/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhansu.table;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;
import quanlynhansu.model.NhanSu;

/**
 *
 * @author hxt
 */
public class TableNhanSu extends AbstractTableModel {

    private String name[] = {"ID", "Ten", "SDT", "Email", "Ngay vao lam", "So ngay cong"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[] = {Integer.class, String.class, String.class, String.class, LocalDate.class, Integer.class};
    
    
    ArrayList<NhanSu> dsNS;

    public TableNhanSu(ArrayList<NhanSu> dsNS) {
        this.dsNS = dsNS;
    }
    @Override
    public int getRowCount() {
        return dsNS.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            //Cột mã
            case 0:
                return dsNS.get(rowIndex).getId();
            case 1:
                return dsNS.get(rowIndex).getTen();
            case 2:
                return dsNS.get(rowIndex).getSdt();
            case 3:
                return dsNS.get(rowIndex).getEmail();
            case 4:
                return dsNS.get(rowIndex).getNgayVaoLam();
            case 5:
                return dsNS.get(rowIndex).getSongaycong();

            default:
                return null;
        }
    }
    @Override
    public Class getColumnClass(int columnIndex) {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }
    
}
