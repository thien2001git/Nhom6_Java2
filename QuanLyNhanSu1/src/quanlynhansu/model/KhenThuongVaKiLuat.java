/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhansu.model;

import java.io.Serializable;

/**
 *
 * @author hxt
 */
public class KhenThuongVaKiLuat implements Serializable {
    private Integer id;

    public KhenThuongVaKiLuat(Integer id, String ten, String lyDo, String chiTiet) {
        this.id = id;
        this.ten = ten;
        this.lyDo = lyDo;
        this.chiTiet = chiTiet;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return ten + " - " + lyDo + " - " + chiTiet;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    private String ten;
    private String lyDo;
    private String chiTiet;

    public KhenThuongVaKiLuat(String ten, String lyDo, String chiTiet) {
        this.ten = ten;
        this.lyDo = lyDo;
        this.chiTiet = chiTiet;
    }

    public KhenThuongVaKiLuat() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }
    
}
