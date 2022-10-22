module com.application.aplicaciondsr {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens com.application.aplicaciondsr to javafx.fxml;
    exports com.application.aplicaciondsr;
}