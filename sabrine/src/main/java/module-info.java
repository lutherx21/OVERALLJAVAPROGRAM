module com.example.sabrine {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sabrine to javafx.fxml;
    exports com.example.sabrine;
}