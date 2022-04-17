/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrueLove;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hxt
 */
public class QuanLyNhanVien implements IQuanLy {
    public ArrayList<NhanVien> dsNhanVien;

    public QuanLyNhanVien() {
        dsNhanVien = new ArrayList<>();
    }

    public QuanLyNhanVien(ArrayList<NhanVien> dsNhanVien) {
        this.dsNhanVien = dsNhanVien;
    }

    // thêm vào danh sách
    @Override
    public void add() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap so KH");
        Integer sonv = 0;
        try {
            sonv = scn.nextInt();
            if (sonv <= 0) {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("Nhập số nguyên lớn hơn 0");
        }
        if (sonv > 0) {
            for (int i = 0; i < sonv; i++) {
                try {
                    NhanVien nv = new NhanVien();
                    nv.nhap();
                    if (nv.getMaNV().isBlank() || nv.getTenNV().isBlank()) {
                        throw new Exception("Trống tên hoặc mã nhân viên");
                    }
                    dsNhanVien.add(nv);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            
        }

    }

    //
    @Override
    public void update(int index, Object nv) {
        NhanVien n = (NhanVien) nv;
        if (index < 0 || index >= dsNhanVien.size()) {
            System.out.println("Số thứ tự đã cho ngoài vòng danh sách");
        } else {
            dsNhanVien.set(index, n);
        }
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= dsNhanVien.size()) {
            System.out.println("Số thứ tự đã cho ngoài vòng danh sách");
        } else {
            dsNhanVien.remove(index);
        }
    }

    @Override

    public ArrayList<NhanVien> find(Object obj) {
        String nameOrID = (String) obj;
        return (ArrayList<NhanVien>) dsNhanVien.stream()
                .filter(c -> c.getMaNV().equals(nameOrID) || c.getTenNV().equals(nameOrID));
    }

    @Override
    public void xuat() {

        System.out.println(String.format("%8s %20s", "MaNV", "TenNV"));
        for (int i = 0; i < dsNhanVien.size(); i++) {
            dsNhanVien.get(i).xuat();
        }

    }
}
