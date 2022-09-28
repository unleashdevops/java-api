pipeline {
    agent any
    
    environment{
        NAME = 'VENKAT'
    }
    
    tools{
       maven 'm3.8.4'
    }

    stages {
        stage('check maven version') {
            steps {
                sh "mvn --version"
                
            }
        }
    }
}
