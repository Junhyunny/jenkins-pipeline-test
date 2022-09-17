pipeline {
    agent any
    stages {
        stage('tests') {
            parallel {
                stage('backend test') {
                    steps {
                        dir('backend') {
                            sh 'mvn verify'
                        }
                    }
                }
                stage('frontend test') {
                    steps {
                        dir('frontend') {
                            sh 'npm install && npm test'
                        }
                    }
                }
            }
        }
        stage('build') {
            steps {
                sh 'docker-compose down && docker-compose build'
            }
        }
        stage('deploy') {
            steps {
                sh 'docker-compose up -d'
            }
        }
    }
}