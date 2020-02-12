module com.mycompany.timeopgaver2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.timeopgaver2 to javafx.fxml;
    exports com.mycompany.timeopgaver2;
}