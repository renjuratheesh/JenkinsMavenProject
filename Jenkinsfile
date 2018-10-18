pipeline {
	agent any
	stages {
		stage("Cleaning Stage") {
			steps {
				bat "mvn clean"
			}
		}
		
		stage("Email Build Status"){
			steps {
				mail bcc: '', body: "${currentBuild.fullDisplayName}", cc: 'renju.jenkins.training@gmail.com', from: '', replyTo: '', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS!', to: 'renju.jenkins.training@gmail.com'
			}
		}
	}
}