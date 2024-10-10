module com.uiejemplos.pruebaproyecto3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uiejemplos.pruebaproyecto3 to javafx.fxml;
    exports com.uiejemplos.pruebaproyecto3;
}