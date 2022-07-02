pipeline{
    agent any;
    stages{
        // stage("github"){
        //     steps {
        //       git 'https://github.com/Fares-Saffouri/Jenkins-Closing-Task.git'
        //     }
        // }
        stage("build"){
            steps{
                sh "mvn clean package"
            }
        }
        stage("Save Artifact") {
            steps {
                archiveArtifacts artifacts: '**/*.jar', followSymlinks: false
            }
        }
    }
    post {
        success {
            slackSend(channel: 'jenkins-task', color: 'good', message: "build and deployed successfully!")
        }
       failure {
           slackSend(channel: 'jenkins-task', color: 'RED', message: "build and deployed failed!")
       }
    }
}
