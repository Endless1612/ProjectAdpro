module se233.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens se233.demo to javafx.fxml;
    exports se233.demo;
}