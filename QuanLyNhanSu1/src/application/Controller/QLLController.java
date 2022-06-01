package application.Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.ResourceBundle;

import application.Models.Luong;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class QLLController implements Initializable{
	private Alert alert;
	@FXML private TabPane tabpane;
	@FXML private AnchorPane QLNS_GUI, Them_GUI, Sua_GUI, Tim_GUI;
	@FXML private Label Xemma, Xemten, Xembophan, Xemchucvu, Xemchucdanh, Xemsongaycong,Xemluongcoban,Xemphucap,Xemheso,Xemtongluong;
	@FXML private TextField Them_ma, Them_ten, Them_bophan, Them_chucvu, Them_chucdanh, Them_songaycong,Them_luong,Them_phucap, Them_heso;
	@FXML private TextField Sua_ma, Sua_ten, Sua_bophan, Sua_chucvu, Sua_chucdanh, Sua_songaycong,Sua_luong,Sua_phucap, Sua_heso;
	@FXML private TextField timkiem;
	@FXML private TableColumn<Luong,String> Tim_ma, Tim_ten;
	@FXML private TableColumn<Luong,Integer> Tim_songaycong,Tim_luong,Tim_phucap;
	@FXML private TableColumn<Luong,Double> Tim_heso,Tim_tongluong;
	@FXML private ImageView imgView;
	@FXML private TextField ManvField, HsoField, LuongField, PhucapField, NgaycongField;	
	@FXML private TableColumn<Luong,String> MaColumn, TenColumn, BophanColumn, ChucvuColumn,CdanhColumn;
	@FXML private TableColumn<Luong,Integer> NgaycongColumn,LuongColumn,PhucapColumn;
	@FXML private TableColumn<Luong,Double> HsLuongColumn,TongluongColumn;
	@FXML private TableView<Luong> table;
	@FXML private TableView<Luong> Tim_table;
	static File filename = new File("D:/data.txt");
	static ArrayList<Luong> list = new ArrayList<Luong>();
    static ObservableList<Luong> ListLuong;
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Newobject();
		MaColumn.setCellValueFactory(new PropertyValueFactory<Luong, String>("ma"));
		TenColumn.setCellValueFactory(new PropertyValueFactory<Luong, String>("ten"));
		BophanColumn.setCellValueFactory(new PropertyValueFactory<Luong, String>("bophan"));
		CdanhColumn.setCellValueFactory(new PropertyValueFactory<Luong, String>("chucdanh"));
		ChucvuColumn.setCellValueFactory(new PropertyValueFactory<Luong, String>("chucvu"));
		LuongColumn.setCellValueFactory(new PropertyValueFactory<Luong, Integer>("luongcb"));
		HsLuongColumn.setCellValueFactory(new PropertyValueFactory<Luong, Double>("heso"));
		PhucapColumn.setCellValueFactory(new PropertyValueFactory<Luong, Integer>("phucap"));
		NgaycongColumn.setCellValueFactory(new PropertyValueFactory<Luong, Integer>("songaycong"));
		TongluongColumn.setCellValueFactory(new PropertyValueFactory<Luong, Double>("tongluong"));				
		table.setItems(ListLuong);
	}
	
	public void Newobject() {
		ListLuong = FXCollections.observableArrayList(
				new Luong("NV02","Lê Văn Trung","Phòng tổ chức","Nhân viên","Phó phòng",8_000_000,5.4,3_000_000,45),
				new Luong("NV03","Cao Bá Quát","Phòng kế toán","Giảng viên","Trưởng phòng",10_000_000,5.1,1_000_000,35),
				new Luong("NV04","Lê Bá Sĩ","Khoa ô tô","Giảng viên","Phó khoa",9_000_000,6.2,5_000_000,42),
				new Luong("NV05","Cao Xuân Thắng","Ban giám hiệu","Hiệu trưởng","Hiệu trưởng",13_600_000,4.4,3_000_000,65),
				new Luong("NV06","Diệp An Nhã","Khoa CNTT","Giảng viên","Trưởng khoa",8_900_000,6.4,3_000_000,25),
				new Luong("NV07","Chu Bá Thông","Phòng tổ chức","Nhân viên","Phó phòng",8_500_000,5.2,3_000_000,35),
				new Luong("NV08","Nguyễn Thị Hà","Phòng nhân sự","Nhân viên","Trưởng phòng",12_300_000,5.8,3_000_000,15),
				new Luong("NV09","Lê Sĩ Nam","Phòng điều hành","Nhân viên","Trưởng phòng",8_200_000,5.9,3_000_000,45)
				);
	}
	
	public void Thongtincanhan() {
		tabpane.setVisible(true);
		Luong luong =  table.getSelectionModel().getSelectedItem();
		Xemma.setText(luong.getMa());
		Xemten.setText(luong.getTen());
		Xembophan.setText(luong.getBophan());
		Xemchucvu.setText(luong.getChucvu());
		Xemchucdanh.setText(luong.getChucdanh());
		Xemtongluong.setText(luong.getTongluong());
		Xemsongaycong.setText(String.valueOf(luong.getSongaycong()));
		Xemheso.setText(String.valueOf(luong.getHeso()));
		Xemphucap.setText(String.valueOf(luong.getPhucap()));
		Xemluongcoban.setText(String.valueOf(luong.getLuongcb()));
	}
	
	public void ThemNhanSu() {
		Them_GUI.setVisible(true);
	}
	
	public void ThemNhanSu_Huy() {
		imgView.setImage(null);
		Them_ma.setText(null);
		Them_ten.setText(null);
		Them_bophan.setText(null);
		Them_chucdanh.setText(null);
		Them_heso.setText(null); 
		Them_luong.setText(null);
		Them_phucap.setText(null);
		Them_chucvu.setText(null);
		Them_songaycong.setText(null); 		
		Them_GUI.setVisible(false);
	}
	
	public void ThemNhanSu_Them() {
		if(Them_ma.getText().trim().equals("") || Them_ten.getText().trim().equals("") || 
				Them_bophan.getText().trim().equals("") || Them_chucdanh.getText().trim().equals("") || Them_heso.getText().trim().equals("")
				|| Them_luong.getText().trim().equals("") || Them_phucap.getText().trim().equals("") || Them_songaycong.toString().trim().equals("")) {
			alert = new Alert(AlertType.WARNING);
			alert.setContentText("Bạn phải nhập đầy đủ các trường");
			alert.show();
		}
		else {
			Luong ns = new Luong(Them_ma.getText());
			if(ListLuong.contains(ns)) {
				alert = new Alert(AlertType.WARNING);
				alert.setContentText("Mã nhân viên đã tồn tại. Hãy nhập lại");
				alert.show();
			}
			else {
				ns.setTen(Them_ten.getText());
				ns.setMa(Them_ma.getText());
				ns.setBophan(Them_bophan.getText());
				ns.setChucdanh(Them_chucdanh.getText());
				ns.setChucvu(Them_chucvu.getText());
				ns.setHeso(Double.parseDouble(Them_heso.getText()));
				ns.setLuongcb(Integer.parseInt(Them_luong.getText()));
				ns.setPhucap(Integer.parseInt(Them_phucap.getText()));
				ns.setSongaycong(Integer.parseInt(Them_songaycong.getText()));
				ListLuong.add(ns);
			}
		}
				
		ThemNhanSu_Huy();
	}
	
	int vitri = 0;
	String ma="";
	public void SuaNhanSu() {
		if(table.getSelectionModel().getSelectedItem()==null) {
			alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Thông báo");
			alert.setContentText("Vui lòng chọn 1 dòng trong bảng để cập nhật dữ liệu");
			alert.show();
			
		}else {
		Luong ns = table.getSelectionModel().getSelectedItem();
		Sua_ten.setText(ns.getTen());
		Sua_bophan.setText(ns.getBophan());
		Sua_chucdanh.setText(ns.getChucdanh());
		Sua_chucvu.setText(ns.getChucvu()); 
		Sua_heso.setText(String.valueOf(ns.getHeso()));
		Sua_luong.setText(String.valueOf(ns.getLuongcb()));
		Sua_phucap.setText(String.valueOf(ns.getPhucap()));
		Sua_songaycong.setText(String.valueOf(ns.getSongaycong())); 
		Sua_GUI.setVisible(true);
		vitri = ListLuong.indexOf(ns);
		ma = ns.getMa();
		}
	}
	
	public void SuaNhanSu_Sua() {
		if(Sua_ten.getText().trim().equals("") ||Sua_songaycong.getText().trim().equals("") ||
				Sua_bophan.getText().equals("") || Sua_chucvu.getText().trim().equals("") || Sua_chucdanh.getText().trim().equals("")
				|| Sua_heso.getText().trim().equals("") || Sua_luong.getText().trim().equals("") || Sua_phucap.toString().trim().equals("")) {
			alert = new Alert(AlertType.WARNING);
			alert.setContentText("Bạn phải nhập đầy đủ các trường");
			alert.show();
		}
		else {
			Luong choose = new Luong();
			choose.setMa(ma);
			choose.setTen(Sua_ten.getText());
			choose.setBophan(Sua_bophan.getText());
			choose.setChucvu(Sua_chucvu.getText());
			choose.setChucdanh(Sua_chucdanh.getText());
			choose.setHeso(Double.parseDouble(Sua_heso.getText()));
			choose.setLuongcb(Integer.parseInt(Sua_luong.getText()));
			choose.setPhucap(Integer.parseInt(Sua_phucap.getText()));
			choose.setSongaycong(Integer.parseInt(Sua_songaycong.getText()));			
			ListLuong.set(vitri, choose);
			alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Thông báo");
			alert.setContentText("Cập nhật thành công");
			alert.show();
			Sua_GUI.setVisible(false);
		}
	}
	
	public void SuaNhanSu_Huy() {
			Sua_GUI.setVisible(false);
	}
	
	public void XoaNhanSu() {
		if(table.getSelectionModel().getSelectedItem()==null) {
			alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Thông báo");
			alert.setContentText("Vui lòng chọn 1 dòng trong bảng xóa dữ liệu");
			alert.show();
			
		}else {
		alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setContentText("Bạn có chắc chắn muốn xóa không?");
		
		ButtonType btYes = new ButtonType("Đồng ý", ButtonData.YES);
		ButtonType btCancel = new ButtonType("Hủy", ButtonData.CANCEL_CLOSE);
		alert.getButtonTypes().setAll(btYes,btCancel);
		Optional<ButtonType> result = alert.showAndWait();
		
		Luong selected = table.getSelectionModel().getSelectedItem();
		
		if(result.get() == btYes) {
			ListLuong.remove(selected);			
			alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Thông báo");
			alert.setContentText("Xóa thành công");
			alert.show();
		}
		}
		
	}
	
	public void TimNhanSu() {
		Tim_GUI.setVisible(true);
		
	}
	
	public void TimNhanSu_Tim() {
		ObservableList<Luong> tabletim = FXCollections.observableArrayList();
		String ma = timkiem.getText();
		ListLuong.forEach(item -> {
			if(item.getMa().equals(ma))
				tabletim.add(item);
		});
		Tim_ma.setCellValueFactory(new PropertyValueFactory<Luong, String>("ma"));
		Tim_ten.setCellValueFactory(new PropertyValueFactory<Luong, String>("ten"));
		Tim_luong.setCellValueFactory(new PropertyValueFactory<Luong, Integer>("luongcb"));
		Tim_heso.setCellValueFactory(new PropertyValueFactory<Luong, Double>("heso"));
		Tim_phucap.setCellValueFactory(new PropertyValueFactory<Luong, Integer>("phucap"));
		Tim_songaycong.setCellValueFactory(new PropertyValueFactory<Luong, Integer>("songaycong"));
		Tim_tongluong.setCellValueFactory(new PropertyValueFactory<Luong, Double>("tongluong"));		
		Tim_table.setItems(tabletim);
	}
	
	public void TimNhanSu_Huy() {
		Tim_table.getItems().clear();
		timkiem.setText(null);
		Tim_GUI.setVisible(false);
	}
	
	public void back(ActionEvent e) {
		try {
			Parent root = FXMLLoader.load(this.getClass().getResource("/application/View/Home.fxml"));
			Scene scene = new Scene(root,615,500);
			scene.getStylesheets().add(getClass().getResource("/application/login.css").toExternalForm());
			
			Stage stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.setX(400);
			stage.setY(50);
			stage.show();
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}
	}
	public void luuFile(){
        try {
            FileWriter fw=null;
            if(filename.exists()==true){
            	alert = new Alert(Alert.AlertType.CONFIRMATION);
        		alert.setContentText("File đã tồn tại, bạn muốn ghi đè hay sử dụng file có sẵn");       		
        		ButtonType btghide = new ButtonType("Ghi đè", ButtonData.YES);
        		ButtonType btsudung = new ButtonType("Chèn dữ liệu vào file cũ", ButtonData.OK_DONE);
        		alert.getButtonTypes().setAll(btghide,btsudung);
        		Optional<ButtonType> result = alert.showAndWait();        		
        		if(result.get() == btghide) {
        			fw = new FileWriter(filename.getPath());
        			alert = new Alert(Alert.AlertType.INFORMATION);
        			alert.setTitle("Thông báo");
        			alert.setContentText("Ghi đè dữ liệu thành công");
        			alert.show();
        		}
        		else {
        			 fw = new FileWriter(filename.getPath(),true);
        			 	alert = new Alert(Alert.AlertType.INFORMATION);
        				alert.setTitle("Thông báo");
        				alert.setContentText("Chèn dữ liệu vào file cũ thành công");
        				alert.show();
        		}
            }else {
            	fw = new FileWriter(filename.getPath());
                alert = new Alert(Alert.AlertType.INFORMATION);
    			alert.setTitle("Thông báo");
    			alert.setContentText("Chèn dữ liệu vào file cũ thành công");
    			alert.show();
            }
            BufferedWriter bw = new BufferedWriter(fw);
            Iterator<Luong> in = ListLuong.iterator();
            String tieude = String.format("%4s%20s%20s%10s%13s%13s%13s%15s","Mã","Tên","Bophan","Heso","Luongcoban","Phucap","Ngaycong","Tổng lương");
            bw.write(tieude+"\n");
            while(in.hasNext()){
            bw.write(in.next().toString());
            bw.newLine();
            }
            bw.close();
            fw.close();
            System.out.println("Lưu file thành công");
        } catch (Exception ex) {
                System.out.println(ex.toString());
    }
}
    public void docFile(){
        try {
            FileReader fr = new FileReader(filename.getPath());
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while(true){
                line = br.readLine();
                if(line==null){
                    break;
                }
                System.out.println(line);
            }
        } catch (Exception ex) {
            System.out.println("không đọc được file");
        }
    }
	
	public void ChooseImage(ActionEvent e) {
		Stage stage = (Stage) QLNS_GUI.getScene().getWindow();
		FileChooser fc = new FileChooser();
		fc.setTitle("Choose a image");
		FileChooser.ExtensionFilter imgFilter = new FileChooser.ExtensionFilter("Image Files", "*.jpg","*.png");
		fc.getExtensionFilters().add(imgFilter);
		File file = fc.showOpenDialog(stage);
		if(file != null) {
			Image img = new Image(file.toURI().toString());
			imgView.setImage(img);
		}
	}
}
