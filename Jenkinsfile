pipeline {
	agent any
    stages {
        stage('Build') {
            steps {
                sh 'gradle build'
            }
        }
        stage('SonarQube Analysis') {
        	steps {
        		sh 'gradle --info sonarqube'
        	}
        }
	stage("Quality Gate") {
		steps {
			timeout(time: 20, unit: 'MINUTES') {
				waitForQualityGate abortPipeline: true
			}
		}
	}        
    }
}
