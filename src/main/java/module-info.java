module uniquindio.edu.co.empresajavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens uniquindio.edu.co.empresajavafx to javafx.fxml;
    exports uniquindio.edu.co.empresajavafx;
    exports uniquindio.edu.co.empresajavafx.viewController;
    opens uniquindio.edu.co.empresajavafx.viewController to javafx.fxml;
}