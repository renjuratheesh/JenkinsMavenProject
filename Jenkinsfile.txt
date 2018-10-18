pipeline {
	agent any
	stages {
		stage("Cleaning Stage") {
			bat "mvn clean"
		}
		stage("Building Stage") {
			bat "mvn clean"
		}
		stage("Packaging Stage") {
			bat "mvn clean"
		}
	}
}