/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhansu.table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import quanlynhansu.model.KhenThuongVaKiLuat;
import quanlynhansu.model.NhanSu;

/**
 *
 * @author hxt
 */
public class TableKTKL extends AbstractTableModel {

    private String name[] = {"ID", "Su kien", "Ho ten", "Loai"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[] = {Integer.class, String.class, String.class, String.class};
    
    ArrayList<KhenThuongVaKiLuat> ds;
    ArrayList<NhanSu> dsNS;

    public TableKTKL(ArrayList<NhanSu> dsNS, ArrayList<KhenThuongVaKiLuat> dskk) {
        ds = dskk;
        this.dsNS = dsNS; 
    }
    
    @Override
    public int getRowCount() {
        return ds.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }
    public String getHoTen(Integer id) {
        NhanSu ns = new NhanSu();
        ns.setId(id);
        if(dsNS.contains(ns)) {
            return dsNS.get(dsNS.indexOf(ns)).getTen();
        }
        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            //Cột mã
            case 0:
                return ds.get(rowIndex).getId();
            case 1:
                return ds.get(rowIndex).getTen();
            case 2:
                return getHoTen(ds.get(rowIndex).getId());
            case 3:
                return ds.get(rowIndex).getLoai();
           

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
