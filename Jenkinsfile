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
            always{
                echo 'Process finished'
            }
            success{
                echo 'Success'
            }
            failure{
                echo 'Failure'
            }
        }
}