/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrueLove;


import java.time.LocalDateTime;
import java.util.*;
import java.util.Map.Entry;

/**
 *
 * @author hxt
 */
public class HamDungChung{
    
    static public NhanVien ngauNhien(ArrayList<NhanVien> dsNhanVien){
//        viết thuật toán chọn ngẫu nhiên
        Integer n = (new Random()).nextInt(dsNhanVien.size());
        return dsNhanVien.get(n);
    }
    static public HashMap<String, String> chonTenSP(ArrayList<String> maSanPham, ArrayList<NhanVien> dsnv){
//        gán tên nhân viên cho sản phẩm
        HashMap<String, String> ten = new HashMap<>();
        Integer n = maSanPham.size() >  dsnv.size() ? dsnv.size() : maSanPham.size();
        for (int i = 0; i < n; i++) {
            ten.put(dsnv.get(i).getTenNV(), maSanPham.get(i));
        }
        return ten;
    }
    static public HashMap<String, Integer> demSoTenNhanVien(ArrayList<NhanVien> dsnv){
//        đếm tên nhân viên cho vào hasmap
        HashMap<String, Integer> ten = new HashMap<>();
        for (int i = 0; i < dsnv.size(); i++) {
            String t = dsnv.get(i).getTenNV();
            if(ten.containsKey(t)){
                ten.replace(t, ten.get(t) + 1);
            }else{
                ten.put(t, 0);
            }
        }
        return ten;
    }
    static public LinkedList<NhanVien> dsDangKyDuLich(HashMap<NhanVien, LocalDateTime> dsDangKy){
//        viet thuat toan nhập nhân viên theo thứ tự
        ArrayList<Map.Entry<NhanVien, LocalDateTime>> l = new ArrayList<>(dsDangKy.entrySet());
        l.sort(new Comparator<Map.Entry<NhanVien, LocalDateTime>>() {

            @Override
            public int compare(Entry<NhanVien, LocalDateTime> arg0, Entry<NhanVien, LocalDateTime> arg1) {
                // TODO Auto-generated method stub
                return arg0.getValue().compareTo(arg1.getValue());
            }
            
        });
        LinkedList<NhanVien> nv = new LinkedList<>();
        for (Map.Entry<NhanVien, LocalDateTime> it : l) {
            nv.add(it.getKey());
        }

        return nv;
    }
//        xuất danh sách khách hàng theo doanh thu
    static public ArrayList<KhachHang> xuatDsKhachHang(ArrayList<KhachHang> kh){
        kh.sort(new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang arg0, KhachHang arg1) {
                // TODO Auto-generated method stub
                return arg0.getDoanhSo().compareTo(arg1.getDoanhSo());
            }
        });
        return kh;
    }
    
}
