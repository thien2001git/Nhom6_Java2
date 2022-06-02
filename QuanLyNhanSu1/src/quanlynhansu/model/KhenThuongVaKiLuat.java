/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhansu.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author hxt
 */
public class KhenThuongVaKiLuat implements Serializable {
    private Integer id;
     private String ten;
    private String lyDo;
    private String chiTiet;
    private String loai;

    public KhenThuongVaKiLuat(Integer id, String ten, String lyDo, String chiTiet) {
        this.id = id;
        this.ten = ten;
        this.lyDo = lyDo;
        this.chiTiet = chiTiet;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.ten);
        hash = 41 * hash + Objects.hashCode(this.lyDo);
        hash = 41 * hash + Objects.hashCode(this.chiTiet);
        hash = 41 * hash + Objects.hashCode(this.loai);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KhenThuongVaKiLuat other = (KhenThuongVaKiLuat) obj;
        if (!Objects.equals(this.ten, other.ten)) {
            return false;
        }
        if (!Objects.equals(this.lyDo, other.lyDo)) {
            return false;
        }
        if (!Objects.equals(this.chiTiet, other.chiTiet)) {
            return false;
        }
        if (!Objects.equals(this.loai, other.loai)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    public KhenThuongVaKiLuat(Integer id, String ten, String lyDo, String chiTiet, String loai) {
        this.id = id;
        this.ten = ten;
        this.lyDo = lyDo;
        this.chiTiet = chiTiet;
        this.loai = loai;
    }
    public KhenThuongVaKiLuat(String ten, String lyDo, String chiTiet, String loai) {
//        this.id = id;
        this.ten = ten;
        this.lyDo = lyDo;
        this.chiTiet = chiTiet;
        this.loai = loai;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return loai + " - " + ten + " - " + lyDo + " - " + chiTiet;
    }

    public void setId(Integer id) {
        this.id = id;
    }
   

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
