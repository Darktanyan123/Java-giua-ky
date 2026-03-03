module com.example.bai2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens bai2 to javafx.fxml;
    exports bai2;
}