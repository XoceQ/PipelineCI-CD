pipeline {
    agent any

    stages {
        stage('Build and Execute Java Application') {
            steps {
                script {
                    def nameParam = input(
                        message: 'Enter the NAME parameter:',
                        parameters: [string(defaultValue: 'John', description: 'Name parameter')]
                    )

                    sh "javac ParallelTasks.java"
                    sh "java ParallelTasks ${nameParam}"
                }
            }
        }
    }
}
