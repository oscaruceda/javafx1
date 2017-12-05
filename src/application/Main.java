package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class Main extends Application {
	private AnchorPane rootLayout;
	public Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("JFenix");
			this.primaryStage.setX(200);
			this.primaryStage.setX(200);
			initRootLayout();
			// muestra el primer escenario
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initRootLayout() {
		try {
			// carga el layout indicandole la direccion del fxml
			FXMLLoader loader = new FXMLLoader();
			// cargamos la direccion de la vista fxml
			loader.setLocation(Main.class.getResource("../view/aplication.fxml"));
			// lo cargamos dentro del Anchorpane
			rootLayout = (AnchorPane) loader.load();
			// mostramos la escena con el contenido de la raiz
			Scene scene = new Scene(rootLayout, 640, 480);
			// Añadimos la fuente de las letras y demas diseños de las vistas
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// añadimos fuentes
			// scene.getStylesheets().add("http://fonts.googleapis.com/css?family=Shadows+Into+Light");
			Font.loadFont(getClass().getResourceAsStream("../view/fonts/meatloaf.ttf"), 20);

			// Introducimos todo el anchorpane dentro de la Scena
			primaryStage.setScene(scene);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}