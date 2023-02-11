module com.example.sorting {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.example.sorting to javafx.fxml;
  exports com.example.sorting;
}