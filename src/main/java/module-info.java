module org.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;
    requires javafx.graphics;
    requires java.desktop;
    requires java.sql;
    requires java.xml.crypto;
    requires webcam.capture;


    opens org.example.demo to javafx.fxml;
    opens org.example.demo.controller to javafx.fxml;
    exports org.example.demo;
    exports org.example.demo.controller;
    exports org.example.demo.ui;
    opens org.example.demo.ui to javafx.fxml;
}