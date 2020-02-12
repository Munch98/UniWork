module com.mycompany.opgave. {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.opgave. to javafx.fxml;
    exports com.mycompany.opgave.;
}