pipeline {
	agent any
	stages {
		stage("Cleaning Stage") {
			steps {
				bat "mvn clean"
			}
		}
		stage("Parallel Execution") {
			steps {
				parallel(
				      a: {
					bat "mvn clean"
				      },
				      b: {
					bat "mvn package"
				      }
    				)
			}
		}
	}
}