module se233.imageprocessingapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens se233.imageprocessingapp to javafx.fxml;
    exports se233.imageprocessingapp;
}