/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlynhansu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import quanlynhansu.model.Account;
import quanlynhansu.model.KhenThuongVaKiLuat;
import quanlynhansu.model.Luong;
import quanlynhansu.model.Nguoi;
import quanlynhansu.model.NhanSu;
import quanlynhansu.model.ReadWriteObject;

/**
 *
 * @author hxt
 */
public class QuanLyNhanSu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        NhanSu ns = new NhanSu(new Account("1", "1"), "Giam doc", "Tong giam doc", "Tong giam doc nhan su", new Luong(30, 0, 3, 1000, 1000), LocalDate.of(2006, Month.MARCH, 1), new Nguoi(0, true, LocalDate.of(1988, Month.APRIL, 1), "Hoang Xuan Thien", "0346206280", "a@gmail.com","Ha Noi - Viet Nam", ""), 30);

//        ArrayList<NhanSu> ns1 = new ArrayList<>();
//        ns1.add(ns);
//        try {
////            File f = new File("NhanSu.bin");
////            f.createNewFile();
//            ReadWriteObject.WriteObject("NhanSu.bin", ns1);
//        } catch (IOException ex) {
//            Logger.getLogger(QuanLyNhanSu.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Nguoi n = new Nguoi(1, Boolean.TRUE, LocalDate.of(2001, Month.MARCH, 8), LocalDate.of(2019, Month.MARCH, 12), "ten", "sdt", "email", "dChi", "ghichu", "trinhDo", "noiDaoTao", "xepLoai", "viTri", "chuyenNganh", "cmnd", "danToc", "tonGiao");
//        ArrayList<Nguoi> ns1 = new ArrayList<>();
////        ArrayList<NhanSu> ns2 = new ArrayList<>();
//        ns1.add(n);
//        try {
//            File f = new File("Nguoi.bin");
//            f.createNewFile();
//            ns1 = (ArrayList<Nguoi>) ReadWriteObject.ReadObject("Nguoi.bin");

//            for (int i = 0; i < ns1.size(); i++) {
//                ns2.add(new NhanSu(ns1.get(i)));
//            }
//            ReadWriteObject.WriteObject("Nguoi.bin", ns1);
//        } catch (IOException ex) {
//            Logger.getLogger(QuanLyNhanSu.class.getName()).log(Level.SEVERE, null, ex);
//        }

//        Account ac = new Account("1", "1");
//        ArrayList<Account> lac = new ArrayList<>();
//        //        Account ac = new Account("1", "1");
//        ArrayList<Account> lac = new ArrayList<>();
//        lac.add(ac);
//        try {
//            File f = new File("Acc.bin");
//            f.createNewFile();
//            ReadWriteObject.WriteObject("Acc.bin", lac);
//        } catch (IOException ex) {
//            Logger.getLogger(QuanLyNhanSu.class.getName()).log(Level.SEVERE, null, ex);
//        }
//lac.add(ac);
//        try {
//            File f = new File("Acc.bin");
//            f.createNewFile();
//            ReadWriteObject.WriteObject("Acc.bin", lac);
//        } catch (IOException ex) {
//            Logger.getLogger(QuanLyNhanSu.class.getName()).log(Level.SEVERE, null, ex);
//        }
        ArrayList<KhenThuongVaKiLuat> ktkl = new ArrayList<>();
        ktkl.add(new KhenThuongVaKiLuat(1, "Day gioi", "90% sinh vien gioi", "Thuong 500k","Khen Thuong"));
        ktkl.add(new KhenThuongVaKiLuat(2, "Khong nghi day", "100% đi day", "Thuong 800k", "Khen Thuong"));
        ktkl.add(new KhenThuongVaKiLuat(1, "Nghi day qua so buoi", "50% khong đi day", "Phat 500k", "Ki luat"));
        ktkl.add(new KhenThuongVaKiLuat(2, "Danh sinh vien", "Gay thuong tich cho sinh vien", "Duoi viec", "Ki luat"));
        try {
//            File f = new File("Ktkl.bin");
//            f.createNewFile();
            ReadWriteObject.WriteObject("Ktkl.bin", ktkl);
        } catch (IOException ex) {
            Logger.getLogger(QuanLyNhanSu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
