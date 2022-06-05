package quanlynhansu.model;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Luong implements Serializable {

    private Double heso, luongcb, phucap;
    private Double tongluong;

//    public final Locale localeVN = new Locale("vi", "VN");
//    public final NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
//    private int songaycong;
    public Luong() {
        // TODO Auto-generated constructor stub
    }

    public Luong(double heso, double luongcb, double phucap) {
//        this.songaycong = songaycong;
//        this.id = id;
        this.heso = heso;
        this.luongcb = luongcb;
        this.phucap = phucap;
        this.tongluong = luongcb * heso + phucap;
    }

//    public int getSongaycong() {
//        return songaycong;
//    }
//
//    public void setSongaycong(int songaycong) {
//        this.songaycong = songaycong;
//    }
    public Double getHeso() {
        return heso;
    }

    public void setHeso(Double heso) {
        this.heso = heso;
    }

    public Double getLuongcb() {
        return luongcb;
    }

    public void setLuongcb(Double luongcb) {
        this.luongcb = luongcb;
    }

    public Double getPhucap() {
        return phucap;
    }

    public void setPhucap(Double phucap) {
        this.phucap = phucap;
    }

    public Double getTongluong() {
        tongluong = heso * luongcb + phucap;
        return tongluong;
    }

    @Override
    public String toString() {
        return String.format("%f vnd", getTongluong());
    }

}
