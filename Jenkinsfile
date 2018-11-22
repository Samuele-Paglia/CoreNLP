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
    }
}