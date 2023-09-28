pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Checkout the code from your GitHub repository
                checkout scm

                // Compile your Java application (replace 'your-compile-command' with your actual build command)
                sh 'your-compile-command'
            }
        }
        stage('Run') {
            matrix {
                axes {
                    axis {
                        name 'NAME'
                        values 'John', 'Alice', 'Bob'  // Add more names as needed
                    }
                }
                stages {
                    stage('Execute') {
                        steps {
                            script {
                                def randomSleepTime = sh(script: 'echo $[ ( $RANDOM % 5 ) + 1 ]', returnStatus: true, returnStdout: true).trim()
                                echo "Sleeping for $randomSleepTime seconds"
                                sleep time: randomSleepTime, unit: 'SECONDS'

                                // Run your Java application with the specified NAME
                                sh 'java -cp . YourMainClass $NAME'
                            }
                        }
                    }
                }
            }
        }
    }
}

