@Library('shared-library') _

pipeline {
    agent any
    
    environment{
        NAME = 'VENKAT'
    }
    
    tools{
       maven 'm3.8.4'
    }

    stages {

        stage('cleanup'){
            steps{
            helloWorld()
            cleanWs()
            checkout changelog: false, poll: false, scm: [$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'github', url: 'https://github.com/unleashdevops/java-api.git']]]
            }
        }

        stage('Validate') {
            steps {
                script{
                dir('wish') {
                javabuild.package()
                }
            }
                    
            }
        }
    }
}
