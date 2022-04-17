/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrueLove;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hxt
 */
public class QuanLyKhachHang implements IQuanLy {

    // tạo danh sách khách hàng và các hàm thêm, sửa, xóa, tìm kiếm cho khách hàng
    public ArrayList<KhachHang> dsKhachHang;

    public QuanLyKhachHang(ArrayList<KhachHang> dsKhachHang) {
        this.dsKhachHang = dsKhachHang;
    }

    public QuanLyKhachHang() {
        dsKhachHang = new ArrayList<>();
    }

    // thêm
    @Override
    public void add() {
        if (dsKhachHang == null) {
            dsKhachHang = new ArrayList<KhachHang>();
        }

        Scanner sc = new Scanner(System.in);
        int soKH = 0;
        System.out.println("Nhap so KH");
        try {
            soKH = sc.nextInt();
            if (soKH <= 0) {
                throw new Exception("");
            }
        } catch (Exception e) {
            System.out.println("Nhập số nguyên lớn hơn 0");
        }
        if (soKH > 0) {
            for (int i = 0; i < soKH; i++) {
                KhachHang khachhang = new KhachHang();
                try {
                    khachhang.nhap();
                    dsKhachHang.add(khachhang);
                } catch (Exception e) {
                    System.out.println("Nhập sai kiểu dữ liệu");
                    e.printStackTrace();
                }

            }
        }

    }

    // in ds ra
    public void xuat() {
        for (int i = 0; i < dsKhachHang.size(); i++) {
            dsKhachHang.get(i).xuat();
        }
    }

    // thay thế phần tử bằng vị trí
    @Override
    public void update(int index, Object kh) {
        if (index < 0 || index > dsKhachHang.size()) {
            System.out.println("Số thứ tự đã cho ngoài vòng danh sách");
        } else {
            KhachHang sua = (KhachHang) kh;
            dsKhachHang.set(index, sua);
        }

    }

    // pt xóa bằng vị trí trong ds
    @Override
    public void remove(int i) {
        if (i < 0 || i > dsKhachHang.size()) {
            System.out.println("Số thứ tự đã cho ngoài vòng danh sách");
        } else {
            KhachHang khachhang = new KhachHang();
            dsKhachHang.remove(i);
        }

    }

    // pt tìm kiếm: tìm kiếm bằng mã khách hàng
    @Override
    public List<KhachHang> find(Object obj) {
        List<KhachHang> x = new ArrayList<>();
        if (obj instanceof String) {
            String maKH = (String) obj;
            maKH.toLowerCase();
            
            x = dsKhachHang.stream().filter(c -> c.getMaKH().toLowerCase().contains(maKH) || c.getTenKH().toLowerCase().contains(maKH)).toList();
            System.out.println("Ket qua tim kiem");
            for (KhachHang e : x) {
                e.xuat();
            }
        }
        return x;
    }

}
