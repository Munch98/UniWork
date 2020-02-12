module com.mycompany.opgave1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.opgave1 to javafx.fxml;
    exports com.mycompany.opgave1;
}