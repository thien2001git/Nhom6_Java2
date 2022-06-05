/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhansu.table;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import quanlynhansu.model.Nguoi;

/**
 *
 * @author hxt
 */
public class TableNguoi extends AbstractTableModel {

    private String name[] = {"ID", "Ten", "Gioi tinh", "Ngay sinh", 
        "SDT", "Email", "Dia chi", "Ghi chu", "Trinh do", 
        "Noi dao tao", "Xep loai", "Vi tri"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[] = {Integer.class, String.class, 
        String.class, LocalDate.class, String.class, String.class, 
        String.class, String.class, String.class, 
        String.class, String.class, String.class};
    ArrayList<Nguoi> dsN;

    public TableNguoi(ArrayList<Nguoi> dsN) {
        this.dsN = dsN;
    }

    @Override
    public int getRowCount() {
        return dsN.size();
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
                return dsN.get(rowIndex).getId();
            case 1:
                return dsN.get(rowIndex).getTen();
            case 2:
                return dsN.get(rowIndex).getGioiTinh() == true ? "Nam" : "Nu";
            case 3:
                return dsN.get(rowIndex).getNgaySinh();
            case 4:
                return dsN.get(rowIndex).getSdt();
            case 5:
                return dsN.get(rowIndex).getEmail();
            case 6:
                return dsN.get(rowIndex).getdChi();
            case 7:
                return dsN.get(rowIndex).getGhichu();
            case 8:
                return dsN.get(rowIndex).getTrinhDo();
            case 9:
                return dsN.get(rowIndex).getNoiDaoTao();
            case 10:
                return dsN.get(rowIndex).getXepLoai();
            case 11:
                return dsN.get(rowIndex).getViTri();

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
