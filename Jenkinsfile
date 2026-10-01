pipeline {
    agent any

    stages {
        stage('Clean & Compile') {
            steps {
                echo 'Đang dọn dẹp và biên dịch mã nguồn Java...'
                sh "mvn clean compile"
            }
        }
        
        stage('Run Tests') {
            steps {
                echo 'Đang thực thi JUnit tests...'
                sh "mvn test"
            }
        }
        
        stage('Package') {
            steps {
                echo 'Đang đóng gói ứng dụng...'
                sh "mvn package -DskipTests"
            }
        }
    }
}
