pipeline {
    agent any
    stages {
        stage('checkout') {
            steps {
                git branch: 'main',
                credentialsId: 'github_access_token',
                url: 'https://github.com/Junhyunny/jenkins-pipeline-test.git'
            }
        }
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

