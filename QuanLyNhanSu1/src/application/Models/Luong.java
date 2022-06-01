package application.Models;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;


public class Luong {
	Locale localeVN = new Locale("vi", "VN");
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
	private String ma, ten, bophan,chucdanh, chucvu;
	private int songaycong,luongcb,phucap;
	private double heso;
	private String tongluong;
	public Luong() {
		// TODO Auto-generated constructor stub
	}

	public Luong(String ma) {
		super();
		this.ma = ma;
	}

	public Luong(String ma, String ten, String bophan,String chucdanh, String chucvu, int luongcb, double heso, int phucap,
	    int songaycong) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.bophan = bophan;
		this.chucvu = chucvu;
		this.luongcb = luongcb;
		this.heso = heso;
		this.phucap = phucap;
		this.songaycong = songaycong;
		this.chucdanh = chucdanh;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getBophan() {
		return bophan;
	}

	public void setBophan(String bophan) {
		this.bophan = bophan;
	}

	public String getChucvu() {
		return chucvu;
	}

	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}

	public int getLuongcb() {
		return luongcb;
	}

	public void setLuongcb(int luongcb) {
		this.luongcb = luongcb;
	}
	
	public double getHeso() {
		return heso;
	}
	
	public void setHeso(double heso) {
		this.heso = heso;
	}

	@Override
	public String toString() {
		return  String.format("%4s%20s%20s%10s%13o%13o%13o%15s",getMa(),getTen(),getBophan(),getHeso(),getLuongcb(),getPhucap(),getSongaycong(),getTongluong());
	}

	public int getPhucap() {
		return phucap;
	}

	public void setPhucap(int phucap) {
		this.phucap = phucap;
	}

	public int getSongaycong() {
		return songaycong;
	}

	public void setSongaycong(int songaycong) {
		this.songaycong = songaycong;
	}

	public String getChucdanh() {
		return chucdanh;
	}

	public void setChucdanh(String chucdanh) {
		this.chucdanh = chucdanh;
	}

	public void setTongluong(String tongluong) {
		this.tongluong = tongluong;
	}

	public String getTongluong() {
		double sum=0;
		if(chucdanh.equals("Nhan vien")) {
			sum = (double) (Math.round(luongcb * songaycong / 30 + phucap));
		}
		else{
			sum = (double) (Math.round(luongcb *heso + phucap));
		}
		return numberFormat.format(sum);
	}
}
