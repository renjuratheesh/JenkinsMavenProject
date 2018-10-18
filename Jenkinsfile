pipeline {
	agent any
	stages {
		stage("Cleaning Stage") {
			steps {
				bat "mvn clean"
			}
		}
		stage("Testing Stage") {
			steps {
				bat "mvn test"
			}
		}
		stage("Packaging Stage") {
			steps {
				bat "mvn package"
			}
		}
		stage("Consolidate Results") {
			steps {
				input ("Do you want to capture results?")
				junit '**/target/surefire-reports/TEST-*.xml'
                                archive 'target/*.jar'
			}
		}
		stage("Email Build Status"){
			steps {
				mail bcc: '', body: '''$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:
				
				Check console output at $BUILD_URL to view the results.''', cc: 'renju.jenkins.training@gmail.com', from: '', replyTo: '', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS!', to: 'renju.jenkins.training@gmail.com'
			}
		}
	}
}