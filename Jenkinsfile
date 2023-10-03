pipeline {
    agent any

    stages {
        stage('Build and Execute Java Application') {
            steps {
                script {
                    def nameParam = input(
                        message: 'Enter the NAME parameter:',
                        parameters: [
                            string(
                                name: 'NAME',          // Nombre del parámetro
                                defaultValue: 'John', // Valor predeterminado
                                description: 'Name parameter'
                            )
                        ]
                    )

                    sh "javac HelloWorldWithDelay.java"
                    sh "java HelloWorldWithDelay ${nameParam}"
                }
            }
        }
    }
}
