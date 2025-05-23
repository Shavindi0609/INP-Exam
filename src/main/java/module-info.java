module com.ijse.gdse.inpexam {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ijse.gdse.inpexam to javafx.fxml;
    exports com.ijse.gdse.inpexam;
    opens com.ijse.gdse.inpexam.server to javafx.fxml;
    opens com.ijse.gdse.inpexam.client to javafx.fxml;

}