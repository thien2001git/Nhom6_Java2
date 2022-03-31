/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 *
 * @author Admin
 */
public class Main extends Application {
    
    @Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(this.getClass().getResource("/application/View/Login.fxml"));
			Scene scene = new Scene(root,500,500);
			scene.getStylesheets().add(getClass().getResource("login.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
    
}
