/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhansu.table;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import quanlynhansu.model.Luong;
import quanlynhansu.model.Nguoi;
import quanlynhansu.model.NhanSu;

/**
 *
 * @author hxt
 */
public class TableLuong extends AbstractTableModel {
    private String name[] = {"ID", "Ten", "So ngay cong", "Tong luong"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[] = {Integer.class, String.class, Integer.class, Double.class};
    ArrayList<NhanSu> dsL;

    public TableLuong(ArrayList<NhanSu> dsNS) {
        this.dsL = dsNS;
    }

    @Override
    public int getRowCount() {
        return dsL.size();
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
                return dsL.get(rowIndex).getId();
            case 1:
                return dsL.get(rowIndex).getTen();
            case 2:
                return dsL.get(rowIndex).getSongaycong();
            case 3:
                return dsL.get(rowIndex).getLuong().getTongluong();

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
