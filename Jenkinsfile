pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                sh 'mvn clean package'
            }
        }
    }
    post{
            success{
                echo 'Success'
            }
            failure{
                echo 'Failure'
            }
        }
}