module edu.utsa.cs3443.mysemesterproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.utsa.cs3443.mysemesterproject to javafx.fxml;
    exports edu.utsa.cs3443.mysemesterproject;
}