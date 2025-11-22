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
                archiveArtifacts allowEmptyArchive: true, artifacts: '**/ct5171_*.jar'

            }
            failure{
                echo 'Failure'
            }
        }
}