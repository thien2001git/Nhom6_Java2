package quanlynhansu.model;

import java.io.Serializable;
import java.time.LocalDate;

public class NhanSu extends Nguoi implements Serializable{

    /**
     *
     */
    private Account acc;
    private String boPhan, cDanh, cVu;
	
    private Luong luong;
    private LocalDate ngayVaoLam;
//    private Nguoi nguoi;
    private Integer songaycong;

    public NhanSu() {
    }
    

    public NhanSu(Account acc, String boPhan, String cDanh, String cVu, Luong luong, LocalDate ngayVaoLam, int songaycong) {
        this.acc = acc;
        this.boPhan = boPhan;
        this.cDanh = cDanh;
        this.cVu = cVu;
        this.luong = luong;
        this.ngayVaoLam = ngayVaoLam;
        this.songaycong = songaycong;
    }

    public NhanSu(Account acc, String boPhan, String cDanh, String cVu, Luong luong, LocalDate ngayVaoLam, int songaycong, Integer id, Boolean gioiTinh, LocalDate ngaySinh, LocalDate ngayCap, String ten, String sdt, String email, String dChi, String ghichu, String trinhDo, String noiDaoTao, String xepLoai, String viTri, String chuyenNganh, String cmnd, String danToc, String tonGiao) {
        super(id, gioiTinh, ngaySinh, ngayCap, ten, sdt, email, dChi, ghichu, trinhDo, noiDaoTao, xepLoai, viTri, chuyenNganh, cmnd, danToc, tonGiao);
        this.acc = acc;
        this.boPhan = boPhan;
        this.cDanh = cDanh;
        this.cVu = cVu;
        this.luong = luong;
        this.ngayVaoLam = ngayVaoLam;
        this.songaycong = songaycong;
    }

    public NhanSu(Nguoi n) {
        super(n.getId(), n.getGioiTinh(), n.getNgaySinh(), n.getNgayCap(), n.getTen(), n.getSdt(), n.getEmail(), n.getdChi(), n.getGhichu(), n.getTrinhDo(), n.getNoiDaoTao(), n.getXepLoai(), n.getViTri(), n.getChuyenNganh(), n.getCmnd(), n.getDanToc(), n.getTonGiao());
        this.acc = new Account();
        this.boPhan = "";
        this.cDanh = "";
        this.cVu = "";
        this.luong = new Luong(0, 0.0, 0.0);
        this.ngayVaoLam = LocalDate.EPOCH;
        this.songaycong = 0;
        
    }
    
    
    

   

    public Account getAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }

    

    public String getBoPhan() {
        return boPhan;
    }

    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }

    public String getcDanh() {
        return cDanh;
    }

    public void setcDanh(String cDanh) {
        this.cDanh = cDanh;
    }

    public String getcVu() {
        return cVu;
    }

    public void setcVu(String cVu) {
        this.cVu = cVu;
    }

    public Luong getLuong() {
        return luong;
    }

    public void setLuong(Luong luong) {
        this.luong = luong;
    }

    public LocalDate getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(LocalDate ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    

    public Integer getSongaycong() {
        return songaycong;
    }

    public void setSongaycong(Integer songaycong) {
        this.songaycong = songaycong;
    }
    

}
