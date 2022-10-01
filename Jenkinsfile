pipeline {
    agent {
      label 'ubuntu'
    }
    
    environment{
        NAME = 'VENKAT'
    }
    
    tools{
       maven 'm3.8.4'
    }

    stages {

        stage('cleanup'){
            steps{
            cleanWs()
            checkout changelog: false, poll: false, scm: [$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'github', url: 'https://github.com/unleashdevops/java-api.git']]]
            }
        }

        stage('Validate') {
            steps {

                dir('wish') {
                sh "mvn validate"            
            }
                    
            }
        }
    }
}
