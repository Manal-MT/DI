module com.example.calculadoraproyecto {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.calculadoraproyecto to javafx.fxml;
    exports com.example.calculadoraproyecto;
}