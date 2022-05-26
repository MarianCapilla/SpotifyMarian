module com.example.spotifymarian {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jetbrains.annotations;


    opens com.example.spotifymarian to javafx.fxml;
    exports com.example.spotifymarian;
    exports com.example.spotifymarian.modulo;
    opens com.example.spotifymarian.modulo to javafx.fxml;


}