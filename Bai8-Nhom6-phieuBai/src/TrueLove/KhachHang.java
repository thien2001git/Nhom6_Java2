/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrueLove;

/**
 *
 * @author hxt
 */
public class KhachHang {
    private String maKH;
    private String tenKH;
    private String doanhSo;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, String doanhSo) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.doanhSo = doanhSo;
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

    public String getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(String doanhSo) {
        this.doanhSo = doanhSo;
    }
    
    
}
