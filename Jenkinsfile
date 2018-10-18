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
	}
}