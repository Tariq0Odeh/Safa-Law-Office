package application;
 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Main extends Application {
 
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("mainpage.fxml"));
			stage.getIcons().add(new Image("C:\\Users\\tariq\\OneDrive\\Desktop\\DATABASE_FINAL\\Law_Office\\src\\images\\icon.png"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("Safa Law Office");
			stage.show();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	} 
	

	public static void main(String[] args) {
		launch(args);
	}
	

}