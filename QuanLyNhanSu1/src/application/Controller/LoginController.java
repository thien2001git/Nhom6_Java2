package application.Controller;

import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class LoginController implements Initializable{
	@FXML private TextField username;
	@FXML private PasswordField password;
	Alert alert;
	
	ListAccounts list = new ListAccounts();
	
	ReadWriteObject rw = new ReadWriteObject();
	String fileName = "Account.bin";

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		/*
		list.them(); 
                try { 
                    rw.WriteObject(fileName, list);
                } 
                catch (IOException ex) {
		 System.out.println(ex);
                } */
		docfile();
	}
	
	public void login(ActionEvent event) {
		Alert alert;
		
		if(username.getText().trim().equals("") || password.getText().trim().equals("")) {
			alert = new Alert(Alert.AlertType.WARNING);
			alert.setContentText("Ten dang nhap hoac mat khau khong duoc de trong");
			alert.show();
		}
		
		if(username.getText().contains(" ") || password.getText().contains(" ")) {
			alert = new Alert(Alert.AlertType.WARNING);
			alert.setContentText("Ten dang nhap hoac mat khau khong duoc chua dau cach");
			alert.show();
		}
		
		if(list.CheckAcc(username.getText(), password.getText()) != -1) {
			alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setContentText("Dang nhap thanh cong");
			alert.show();
			
			try {
				Parent root = FXMLLoader.load(this.getClass().getResource("/application/View/Home.fxml"));
				Scene scene = new Scene(root,615,500);
				scene.getStylesheets().add(getClass().getResource("/application/login.css").toExternalForm());
				
				Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.show();
			} catch (IOException ioe) {
				alert = new Alert(Alert.AlertType.WARNING);
                                alert.setContentText(ioe.toString());
                                alert.show();
			}
		}
		else {
			alert = new Alert(Alert.AlertType.WARNING);
			alert.setContentText("Ten dang nhap hoac mat khau khong dung");
			alert.showAndWait();
		}
	}
	
	private void docfile() {
		try {
            list = (ListAccounts) rw.ReadObject(fileName);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
	}
}
