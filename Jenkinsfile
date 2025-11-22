pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                sh 'mvn clean package'
            }
        }
        stage('Archive'){
            steps{
                   archiveArtifacts allowEmptyArchive: true, artifacts: '**/ct5171_*.jar'
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