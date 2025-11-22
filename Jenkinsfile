pipeline{
    agent any
    stages{
        stage('GetProject'){
            steps{
                git branch: 'main', url: 'https://github.com/am1ug-cd-ct5171/CT5171_mvn_test.git'
            }
        }
        stage('Build'){
            steps{
                sh 'mvn clean package'
            }
        }
    }
}