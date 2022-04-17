import java.util.Scanner;

import TrueLove.KhachHang;
import TrueLove.NhanVien;
import TrueLove.QuanLyKhachHang;
import TrueLove.QuanLyNhanVien;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author hxt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // menu
        QuanLyKhachHang qLyKhachHang = new QuanLyKhachHang();
        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println("0. Thoát");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Xoa nhan vien");
            System.out.println("3. Sua nhan vien");
            System.out.println("4. Xem danh sach nhan vien");
            System.out.println("5. Them khach hang");
            System.out.println("6. Xoa khach hang");
            System.out.println("7. Sua khach hang");
            System.out.println("8. Xem danh sach khach hang");
            Integer i = -1;
            try {
                i = Integer.parseInt(scn.nextLine());
            } catch (Exception e) {
                System.out.println("Nhập số như menu");
            }
            if (i != -1) {
                switch (i) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        quanLyNhanVien.add();
                        break;
                    case 2:
                        Integer index = -1;
                        try {
                            System.out.println("Nhap thu tu xoa");
                            index = Integer.parseInt(scn.nextLine());
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        quanLyNhanVien.remove(index);
                        break;
                    case 3:
                        NhanVien nv = new NhanVien();
                        index = -1;
                        try {
                            System.out.println("Nhap thu tu sua");
                            index = Integer.parseInt(scn.nextLine());
                            nv.nhap();
                            if (nv.getMaNV().isBlank() || nv.getTenNV().isBlank()) {
                                throw new Exception("Trống tên hoặc mã nhân viên");
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        quanLyNhanVien.update(index, nv);
                        ;
                        break;
                    case 4:
                        quanLyNhanVien.xuat();
                        break;
                    case 5:
                        qLyKhachHang.add();
                        break;
                    case 6:
                        index = -1;
                        try {
                            System.out.println("Nhap thu tu xoa");
                            index = Integer.parseInt(scn.nextLine());
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        qLyKhachHang.remove(index);
                        break;
                    case 7:
                        KhachHang it = new KhachHang();
                        index = -1;
                        try {
                            System.out.println("Nhap thu tu sua");
                            index = Integer.parseInt(scn.nextLine());
                            it.nhap();
                        } catch (Exception e) {
                            System.out.println("Nhập sai kiểu dữ liệu");
                            e.printStackTrace();
                        }
                        qLyKhachHang.update(index, it);
                        break;
                    case 8:
                        qLyKhachHang.xuat();
                        break;
                    default:
                        break;
                }
            }
        }

    }

}
