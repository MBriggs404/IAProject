module com.example.iaproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.calendarfx.view;


    opens com.example.iaproject to javafx.fxml;
    exports com.example.iaproject;
}