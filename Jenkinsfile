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
				mail body: "${env.JOB_NAME}  - Build # ${env.BUILD_NUMBER}  - ${currentBuild.currentResult} \n
				Check console output at ${env.BUILD_URL} to view the results.", subject: "${env.JOB_NAME}  - Build # ${env.BUILD_NUMBER}  - ${currentBuild.currentResult}!!", to: 'renju.jenkins.training@gmail.com'
			}
		}
	}
}