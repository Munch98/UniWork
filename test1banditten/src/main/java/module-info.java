module banditten {
    requires javafx.controls;
    requires javafx.fxml;

    opens banditten to javafx.fxml;
    exports banditten;
}