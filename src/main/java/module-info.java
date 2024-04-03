module demo.sudokugame {
    requires javafx.controls;
    requires javafx.fxml;


    opens demo.sudokugame to javafx.fxml;
    exports demo.sudokugame;
}