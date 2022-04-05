module com.example.vavamalezadanie {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vavamalezadanie to javafx.fxml;
    exports com.example.vavamalezadanie;
}