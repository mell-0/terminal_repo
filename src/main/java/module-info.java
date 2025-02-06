module com.example.hello_world {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hello_world to javafx.fxml;
    exports com.example.hello_world;
}