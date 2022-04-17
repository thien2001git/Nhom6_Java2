/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrueLove;

import java.util.Scanner;

/**
 *
 * @author hxt
 */
public class NhanVien {
    private String MaNV;
    private String TenNV;

    public NhanVien() {
    }

    public NhanVien(String MaNV, String TenNV) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%8s %20s", MaNV, TenNV);
    }

    public void xuat() {
        System.out.println(this);
    }

    public void nhap() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien");
        MaNV = scn.nextLine();
        System.out.println("Nhap ten nhan vien");
        TenNV = scn.nextLine();
    }
}
