/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhansu.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author hxt
 */
public class Nguoi implements Serializable {

    private Integer id;
    private Boolean gioiTinh;
    private LocalDate ngaySinh, ngayCap;
    private String ten, sdt, email, dChi, ghichu, trinhDo, noiDaoTao, xepLoai, viTri, chuyenNganh, cmnd, danToc, tonGiao;

    public Nguoi() {
    }

    public Nguoi(Integer id, Boolean gioiTinh, LocalDate ngaySinh, LocalDate ngayCap, String ten, String sdt, String email, String dChi, String ghichu, String trinhDo, String noiDaoTao, String xepLoai, String viTri, String chuyenNganh, String cmnd, String danToc, String tonGiao) {
        this.id = id;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.ngayCap = ngayCap;
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
        this.dChi = dChi;
        this.ghichu = ghichu;
        this.trinhDo = trinhDo;
        this.noiDaoTao = noiDaoTao;
        this.xepLoai = xepLoai;
        this.viTri = viTri;
        this.chuyenNganh = chuyenNganh;
        this.cmnd = cmnd;
        this.danToc = danToc;
        this.tonGiao = tonGiao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.id);
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
        final Nguoi other = (Nguoi) obj;
        return Objects.equals(this.id, other.id);
    }

    

   

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public LocalDate getNgayCap() {
        return ngayCap;
    }

    public void setNgayCap(LocalDate ngayCap) {
        this.ngayCap = ngayCap;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getDanToc() {
        return danToc;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public String getTonGiao() {
        return tonGiao;
    }

    public void setTonGiao(String tonGiao) {
        this.tonGiao = tonGiao;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getNoiDaoTao() {
        return noiDaoTao;
    }

    public void setNoiDaoTao(String noiDaoTao) {
        this.noiDaoTao = noiDaoTao;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getdChi() {
        return dChi;
    }

    public void setdChi(String dChi) {
        this.dChi = dChi;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

}
