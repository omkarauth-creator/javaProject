pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out Java project'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Success') {
            steps {
                echo 'Java project built successfully!'
            }
        }
    }
}
