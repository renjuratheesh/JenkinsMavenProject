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
				mail bcc: '', body: "${currentBuild.fullDisplayName}", cc: 'renju.jenkins.training@gmail.com', from: '', replyTo: '', subject: "${env.JOB_NAME} - Build # ${env.BUILD_NUMBER} - ${currentBuild.result}",to: 'renju.jenkins.training@gmail.com'
			}
		}
	}
}