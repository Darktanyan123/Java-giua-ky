pipeline {
    agent any
    
    tools {
        // Khai báo tên Maven đã cấu hình trong Manage Jenkins -> Tools (ví dụ: 'Maven 3.8.x')
        maven 'Maven 3'
        // Khai báo JDK tương ứng (ví dụ: 'JDK 17')
        jdk 'JDK 17'
    }

    stages {
        stage('Clean & Compile') {
            steps {
                echo 'Đang dọn dẹp và biên dịch mã nguồn Java...'
                // Dùng lệnh mvn trên Linux/Unix (hoặc bat "mvn clean compile" nếu chạy trên Windows agent)
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
                echo 'Đang đóng gói ứng dụng thành file JAR/WAR...'
                // Bỏ qua bước test lại ở lệnh package để tiết kiệm thời gian
                sh "mvn package -DskipTests"
            }
        }
    }
    
    post {
        success {
            echo ' Pipeline build dự án Java thành công!'
            // Bạn có thể lưu trữ artifact bằng cách:
            // archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
        failure {
            echo ' Build thất bại, hãy kiểm tra lại lỗi code hoặc cấu hình Maven.'
        }
    }
}
