pipeline {
    agent any

    tools {
        maven 'maven'
        jdk 'jdk-21'
    }

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/zoras0/selenium'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
