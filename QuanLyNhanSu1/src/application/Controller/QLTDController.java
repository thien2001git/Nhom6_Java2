package application.Controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.ResourceBundle;

import application.Models.TuyenDung;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ComboBox;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class QLTDController implements Initializable{
	private Alert alert;
	@FXML
	private AnchorPane QLTD_GUI, Them_GUI, Sua_GUI, Tim_GUI;
	@FXML
	private TextField Them_ma, Them_ten, Them_sdt, Them_dchi, Them_email, Them_tdo, Them_truong, Them_cnganh, Them_xeploai, Them_vitri, Them_cmnd, Them_dtoc, Them_tgiao, Them_hnhan, Them_que;
	@FXML
	private TextField Sua_ma, Sua_ten, Sua_sdt, Sua_dchi, Sua_email, Sua_tdo, Sua_cnganh, Sua_truong, Sua_xeploai, Sua_vitri, Sua_cmnd, Sua_dtoc, Sua_tgiao, Sua_hnhan, Sua_que;
	@FXML
	private RadioButton Them_gtnam, Them_gtnu, Sua_gtnam, Sua_gtnu;
	@FXML
	private DatePicker Them_ngsinh, Them_ngcap, Sua_ngsinh, Sua_ngcap;
	@FXML
	private Label infma, inften, infgtinh, infNgsinh, infdchi, infsdt, infemail, inftruong, infcnganh, infxloai;
	@FXML
	private Label infcmnd, infngcap, infdtoc, inftgiao, infqquan, infhnhan;
	@FXML
	private ImageView imgView;
	@FXML
	private TabPane tabpane;
        
        @FXML private ComboBox<String> combobox;
	@FXML private TextField timkiem;
        
	@FXML
	private TableView<TuyenDung> table, tTable;
	@FXML
	private TableColumn<TuyenDung, String> macolumn, tencolumn, gtinhcolumn, ngsinhcolumn, trdocolumn;
	@FXML
	private TableColumn<TuyenDung, String> truongcolumn, cnganhcolumn,xeploaicolumn, vtricolumn;
        
        @FXML
	private TableColumn<TuyenDung, String> Tmacolumn, Ttencolumn, Tgtinhcolumn, Tngsinhcolumn, Ttrdocolumn;
	@FXML
	private TableColumn<TuyenDung, String> Ttruongcolumn, Tcnganhcolumn,Txeploaicolumn, Tvtricolumn;
	
	private ObservableList<TuyenDung> listUngVien = FXCollections.observableArrayList();
        private ObservableList<String> listBox = FXCollections.observableArrayList("Ma ung vien","Ten ung vien");
        
        ListTuyenDung list = new ListTuyenDung();
        ReadWriteObject rw = new ReadWriteObject();
	String fileName = "TuyenDung.bin";
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
                DataQuery();
		macolumn.setCellValueFactory(new PropertyValueFactory<TuyenDung, String>("ma"));
		tencolumn.setCellValueFactory(new PropertyValueFactory<TuyenDung, String>("ten"));
		gtinhcolumn.setCellValueFactory(new PropertyValueFactory<TuyenDung, String>("gtinh"));
		ngsinhcolumn.setCellValueFactory(new PropertyValueFactory<TuyenDung, String>("ngsinh"));
		trdocolumn.setCellValueFactory(new PropertyValueFactory<TuyenDung, String>("trinhdo"));
		truongcolumn.setCellValueFactory(new PropertyValueFactory<TuyenDung, String>("truong"));
		cnganhcolumn.setCellValueFactory(new PropertyValueFactory<TuyenDung, String>("cnganh"));
		xeploaicolumn.setCellValueFactory(new PropertyValueFactory<TuyenDung, String>("xeploai"));
		vtricolumn.setCellValueFactory(new PropertyValueFactory<TuyenDung, String>("vtungtuyen"));
              
		table.setItems(listUngVien);
		
	}
	
	public void DataQuery() {
		try {
                    list = (ListTuyenDung) rw.ReadObject(fileName);
                    for(int i = 0; i < list.getSize(); i++) {
                    listUngVien.add(list.getTuyenDung(i));
                    }
                } catch (IOException | ClassNotFoundException ex) {
                    alert = new Alert(Alert.AlertType.WARNING);
                    alert.setContentText("Danh sach hien tai rong");
                	alert.show();
                }
	}
	
	public void Thongtincanhan() {
		tabpane.setVisible(true);
		TuyenDung td =  table.getSelectionModel().getSelectedItem();
		infma.setText(td.getMa());
		inften.setText(td.getTen());
		infgtinh.setText(td.getGtinh());
		infNgsinh.setText(td.getNgsinh());
		infdchi.setText(td.getDchi());
		infsdt.setText(td.getSdt());
		infemail.setText(td.getEmail());
		infcmnd.setText("12345543753");
		infngcap.setText("1970");
		infdtoc.setText("Kinh");
		inftgiao.setText("Không");
		infqquan.setText("Viet Nam");
		infhnhan.setText("Đã kêt hôn");
		inftruong.setText(td.getTruong());
		infcnganh.setText(td.getCnganh());
		infxloai.setText(td.getXeploai());
	}
	
	public void ThemUngVien() {
		Them_GUI.setVisible(true);
	}
	
	public void ThemUngVien_Huy() {
		imgView.setImage(null);
		Them_ma.setText(null);
		Them_ten.setText(null);
		Them_sdt.setText(null);
		Them_dchi.setText(null);
		Them_email.setText(null); 
		Them_tdo.setText(null);
		Them_truong.setText(null);
		Them_cnganh.setText(null); 
		Them_cmnd.setText(null);
		Them_ngsinh.setValue(null);
		Them_xeploai.setText(null);
		Them_gtnu.setSelected(false);
		Them_gtnam.setSelected(false);
		Them_que.setText(null);
		Them_dtoc.setText(null);
		Them_tgiao.setText(null);
		Them_hnhan.setText(null);
		Them_ngcap.setValue(null);
		Them_vitri.setText(null);
		
		Them_GUI.setVisible(false);
	}
	
	public void ThemUngVien_Them() {
		LocalDate ngsinh = ConvertDate(Them_ngsinh).getValue();
		String gtinh = Them_gtnam.isSelected()? "nam" : (Them_gtnu.isSelected()? "nu" : "");
		
		if(Them_ma.getText().trim().equals("") || Them_ten.getText().trim().equals("") || ngsinh.toString().trim().equals("") ||  Them_cnganh.getText().trim().equals("") ||
				Them_sdt.getText().trim().equals("") || gtinh.trim().equals("") || Them_email.getText().trim().equals("") || Them_dchi.getText().trim().equals("")
				|| Them_tdo.getText().trim().equals("") || Them_truong.getText().trim().equals("") || Them_xeploai.getText().trim().equals("") || Them_vitri.getText().trim().equals("")) {
			alert = new Alert(AlertType.WARNING);
			alert.setContentText("Bạn phải nhập đầy đủ các trường");
			alert.show();
		}
		else {
			TuyenDung td = new TuyenDung(Them_ma.getText());
			if(listUngVien.contains(td)) {
				alert = new Alert(AlertType.WARNING);
				alert.setContentText("Mã ứng viên đã tồn tại. Hãy nhập lại");
				alert.show();
			}
			else {
                            try {
                                td.setTen(Them_ten.getText());
				td.setGtinh(gtinh);
				td.setNgsinh(ngsinh.toString());
				td.setSdt(Them_sdt.getText());
				td.setEmail(Them_email.getText());
				td.setDchi(Them_dchi.getText());
				td.setTrinhdo(Them_tdo.getText());
				td.setTruong(Them_truong.getText());
				td.setCnganh(Them_cnganh.getText());
				td.setXeploai(Them_xeploai.getText());
				td.setVtungtuyen(Them_vitri.getText());
				listUngVien.add(td);
				list.ThemTD(td);
                                luuFile();
				
				alert = new Alert(Alert.AlertType.INFORMATION);
				alert.setContentText("Thêm thành công");
				alert.show();
				ThemUngVien_Huy();
                            } catch (Exception e) {
                                alert = new Alert(Alert.AlertType.WARNING);
				alert.setContentText(e.toString());
				alert.show();
                            }
				
			}
		}	
	}
	
	
	public void SuaUngVien() {
		TuyenDung td = table.getSelectionModel().getSelectedItem();
		Sua_ma.setText(td.getMa());
		Sua_ten.setText(td.getTen());
		Sua_sdt.setText(td.getSdt());
		Sua_dchi.setText(td.getDchi());
		Sua_email.setText(td.getEmail()); 
		Sua_tdo.setText(td.getTrinhdo());
		Sua_truong.setText(td.getTruong());
		Sua_cnganh.setText(td.getCnganh()); 
		Sua_cmnd.setText("1298583871");
		Sua_ngsinh.setValue(LocalDate.of(1970, 6, 15));
		Sua_xeploai.setText(td.getXeploai());		
		Sua_que.setText("Ha Noi, Viet Nam");
		Sua_dtoc.setText("Kinh");
		Sua_tgiao.setText("Khong");
		Sua_hnhan.setText("Da ket hon");
		Sua_ngcap.setValue(LocalDate.of(2021, 11, 10));
		Sua_vitri.setText(td.getVtungtuyen());
		Sua_GUI.setVisible(true);
	}
	
	public void SuaUngVien_Sua() {
		LocalDate ngsinh = ConvertDate(Sua_ngsinh).getValue();
		String gtinh = Sua_gtnam.isSelected()? "nam" : (Sua_gtnu.isSelected()? "nu" : "");
		
		if(Sua_ma.getText().trim().equals("") || Sua_ten.getText().trim().equals("") || ngsinh.toString().trim().equals("") ||  Sua_cnganh.getText().trim().equals("") ||
				Sua_sdt.getText().trim().equals("") || gtinh.trim().equals("") || Sua_email.getText().trim().equals("") || Sua_dchi.getText().trim().equals("")
				|| Sua_tdo.getText().trim().equals("") || Sua_truong.getText().trim().equals("") || Sua_xeploai.getText().trim().equals("") || Sua_vitri.getText().trim().equals("")) {
			alert = new Alert(AlertType.WARNING);
			alert.setContentText("Bạn phải nhập đầy đủ các trường");
			alert.show();
		}
		else {		
                    TuyenDung ns = new TuyenDung(Sua_ma.getText());
				ns.setTen(Sua_ten.getText());
				ns.setGtinh(gtinh);
				ns.setNgsinh(ngsinh.toString());
				ns.setSdt(Sua_sdt.getText());
				ns.setEmail(Sua_email.getText());
				ns.setDchi(Sua_dchi.getText());
				ns.setTrinhdo(Sua_tdo.getText());
				ns.setTruong(Sua_truong.getText());
				ns.setCnganh(Sua_cnganh.getText());
				ns.setXeploai(Sua_xeploai.toString());
				list.Sua(Sua_ma.getText(), ns);
                                
				luuFile();
				
				table.getItems().clear();
				initialize(null, null);
                    
                    
			alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Thông báo");
			alert.setContentText("Cập nhật thành công");
			alert.show();
			Sua_GUI.setVisible(false);
		}
	}
	
	public void SuaUngVien_Huy() {
		Sua_ten.setText(null);
		Sua_sdt.setText(null);
		Sua_dchi.setText(null);
		Sua_email.setText(null); 
		Sua_tdo.setText(null);
		Sua_truong.setText(null);
		Sua_cnganh.setText(null); 
		Sua_cmnd.setText(null);
		Sua_ngsinh.setValue(null);
		Sua_xeploai.setText(null);
		Sua_gtnu.setSelected(false);
		Sua_gtnam.setSelected(false);
		Sua_que.setText(null);
		Sua_dtoc.setText(null);
		Sua_tgiao.setText(null);
		Sua_hnhan.setText(null);
		Sua_ngcap.setValue(null);
		Sua_vitri.setText(null);
		
		Sua_GUI.setVisible(false);
	}
	
	public void XoaUngVien() {
		alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setContentText("Bạn có chắc chắn muốn xóa không?");
		
		ButtonType btYes = new ButtonType("Đồng ý", ButtonData.YES);
		ButtonType btCancel = new ButtonType("Hủy", ButtonData.CANCEL_CLOSE);
		alert.getButtonTypes().setAll(btYes,btCancel);
		Optional<ButtonType> result = alert.showAndWait();
		
		TuyenDung selected = table.getSelectionModel().getSelectedItem();
		
		if(result.get() == btYes) {
			listUngVien.remove(selected);
			list.xoa(selected);
                        luuFile();
                        
			alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Thông báo");
			alert.setContentText("Xóa thành công");
			alert.show();
		}
		
	}
        
        public void TimNhanSu_Tim() {
		ObservableList<TuyenDung> list2 = FXCollections.observableArrayList();
		tTable.getItems().clear();
		
		if(combobox.getValue().equals("Ma ung vien")) {
			listUngVien.forEach(item -> {
				if(item.getMa().equals(timkiem.getText()))
					list2.add(item);
			});
		}
		else if(combobox.getValue().equals("Ten ung vien")) {
			listUngVien.forEach(item -> {
				if(item.getTen().equals(timkiem.getText()))
					list2.add(item);
			});
		}

		
		Tmacolumn.setCellValueFactory(new PropertyValueFactory<TuyenDung, String>("ma"));
		Ttencolumn.setCellValueFactory(new PropertyValueFactory<TuyenDung, String>("ten"));
		Tgtinhcolumn.setCellValueFactory(new PropertyValueFactory<TuyenDung, String>("gtinh"));
		Tngsinhcolumn.setCellValueFactory(new PropertyValueFactory<TuyenDung, String>("ngsinh"));
		Ttrdocolumn.setCellValueFactory(new PropertyValueFactory<TuyenDung, String>("trinhdo"));
		Ttruongcolumn.setCellValueFactory(new PropertyValueFactory<TuyenDung, String>("truong"));
		Tcnganhcolumn.setCellValueFactory(new PropertyValueFactory<TuyenDung, String>("cnganh"));
		Txeploaicolumn.setCellValueFactory(new PropertyValueFactory<TuyenDung, String>("xeploai"));
		Tvtricolumn.setCellValueFactory(new PropertyValueFactory<TuyenDung, String>("vtungtuyen"));
		
                System.out.println(list2);
                
		tTable.setItems(list2);
	}
	
        public void TimNhanSu() {
		Tim_GUI.setVisible(true);
		combobox.setItems(listBox);
	}
		
	public void TimNhanSu_Huy() {
		Tim_GUI.setVisible(false);
		timkiem.setText(null);
		combobox.setValue(null);
	}
        
	public void ThemNhanSu() {
		Them_GUI.setVisible(true);
	}
	
	public void ThemNhanSu_Huy() {
		imgView.setImage(null);
		Them_ma.setText(null);
		Them_ten.setText(null);
		Them_sdt.setText(null);
		Them_dchi.setText(null);
		Them_email.setText(null); 
		Them_cmnd.setText(null);
		
		Them_GUI.setVisible(false);
	}
        
	private void luuFile() {
            try {
                rw.WriteObject(fileName, list);
            } catch (IOException ex) {
                alert = new Alert(Alert.AlertType.WARNING);
		alert.setContentText(ex.toString());
		alert.show();
            }
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
                        alert = new Alert(AlertType.WARNING);
			alert.setContentText(ioe.toString());
			alert.show();
		}
	}
	
	public void ChooseImage(ActionEvent e) {
		Stage stage = (Stage) QLTD_GUI.getScene().getWindow();
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
	
	public DatePicker ConvertDate(DatePicker dpk) {
		StringConverter<LocalDate> converter = new StringConverter<LocalDate>() {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
			
			@Override
			public String toString(LocalDate date) {
				if (date != null) 
					return dtf.format(date);
	            else 
	                return "";
	        }
			
			@Override
			public LocalDate fromString(String string) {
				if (string != null && !string.isEmpty())
                    return LocalDate.parse(string, dtf);
                else 
                    return null;   
			}
		};
		dpk.setConverter(converter);
		dpk.setPromptText("MM/dd/yyyy");
		return dpk;
	}
}
