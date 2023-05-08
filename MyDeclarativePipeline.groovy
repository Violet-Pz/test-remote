def call() {
    /* insert your pipeline here */
    pipeline {
        agent any
        stages {
            stage('build') {
                steps{
                    sh './jenkins/build.sh'
                }
            }
            stage('login') {
                steps {
                    sh './jenkins/login.sh'
                }
            }
        }
    }
}
