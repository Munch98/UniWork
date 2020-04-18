module org.openfjx {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.openfjx to javafx.fxml;
    exports org.openfjx;
}