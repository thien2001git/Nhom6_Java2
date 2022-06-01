/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/module-info.java to edit this template
 */

module QuanLyNhanSu {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.base;
    requires java.base;
	
    opens application to javafx.fxml, javafx.graphics;
    opens application.View;
    opens application.Controller;
    opens application.Models;
    
}
