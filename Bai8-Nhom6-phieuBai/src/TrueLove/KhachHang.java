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
public class KhachHang {
    private String maKH;
    private String tenKH;
    private double doanhSo;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, Float doanhSo) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.doanhSo = doanhSo;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma KH: ");
        maKH = sc.nextLine();
        System.out.println("Nhap ten KH: ");
        tenKH = sc.nextLine();
        System.out.println("Nhap ten Doanh so: ");
        doanhSo = sc.nextDouble();

    }
    public void xuat() {
        System.out.println("Ma KH: "+ maKH);
        System.out.println("Ten KH: " + tenKH);
        System.out.println("Doanh so: " + doanhSo);
    }
    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public Double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(Double doanhSo) {
        this.doanhSo = doanhSo;
    }

}
