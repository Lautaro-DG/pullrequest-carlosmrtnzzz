package tarea09;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.Parent;

/**
 * Juego de Memoria. Clase lanzadora
 *
 * @author INDICAR Carlos Martinez Jimenez
 */
public class Principal extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("memoria.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Juego de memoria - Por Carlos Martinez Jimenez");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
