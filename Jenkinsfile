pipeline {
  agent {
    node {
      label 'docker-slave'
    }

  }
  stages {
    stage('test') {
      steps {
        sh 'echo hello'
      }
    }
  }
}