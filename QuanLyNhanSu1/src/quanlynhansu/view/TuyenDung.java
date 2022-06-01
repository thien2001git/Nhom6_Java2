package quanlynhansu.view;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import quanlynhansu.QuanLyNhanSu;
import quanlynhansu.model.Nguoi;
import quanlynhansu.model.NhanSu;
import quanlynhansu.model.ReadWriteObject;
import quanlynhansu.table.TableNguoi;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author hxt
 */
public class TuyenDung extends javax.swing.JFrame {

    /**
     * Creates new form TuyenDung
     */
    int dongChon = -1;
    Nguoi ng;
    ArrayList<Nguoi> dsN;

    public TuyenDung() {
        initComponents();
        try {
            dsN = (ArrayList<Nguoi>) ReadWriteObject.ReadObject("Nguoi.bin");
        } catch (IOException ex) {
            Logger.getLogger(TuyenDung.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TuyenDung.class.getName()).log(Level.SEVERE, null, ex);
        }

        updateTable();
    }

    public void updateTable() {

        jTable1.setModel(new TableNguoi(dsN));
    }

    public void them() {
        if (tCMND.getText().isBlank()
                || tChuyenNganh.getText().isBlank()
                || tDanToc.getText().isBlank()
                || tDiaChi.getText().isBlank()
                || tEmail.getText().isBlank()
                || tNgayCap.getDate().toString().isBlank()
                || tNgaySinh.getDate().toString().isBlank()
                || tNoiHoc.getText().isBlank()
                || tSDT.getText().isBlank()
                || tTen.getText().isBlank()
                || tTonGiao.getText().isBlank()
                || tTrinhDo.getText().isBlank()
                || tViTri.getText().isBlank()
                || tXepLoai.getText().isBlank()) {
            JOptionPane.showMessageDialog(this,
                    "Ban da nhap thieu thong tin",
                    "Thong bao", JOptionPane.PLAIN_MESSAGE);
        } else {
            Date ns = tNgaySinh.getDate();
//            Date nc = tNgayCap.getDate();
            Nguoi n = new Nguoi(dsN.get(dsN.size() - 1).getId() + 1,
                    tGioiTinh.getSelectedIndex() == 0 ? true : false,
                    ns.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                    tNgayCap.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                    tTen.getText(),
                    tSDT.getText(),
                    tEmail.getText(),
                    tDiaChi.getText(),
                    tGhiChu.getText(),
                    tTrinhDo.getText(),
                    tNoiHoc.getText(),
                    tXepLoai.getText(),
                    tViTri.getText(),
                    tChuyenNganh.getText(),
                    tCMND.getText(),
                    tDanToc.getText(),
                    tTonGiao.getText());
            dsN.add(n);
            JOptionPane.showMessageDialog(this,
                    "Ban da them thanh cong",
                    "Thong bao", JOptionPane.PLAIN_MESSAGE);
            updateTable();
            try {
                ReadWriteObject.WriteObject("Nguoi.bin", dsN);
            } catch (IOException ex) {
                Logger.getLogger(TuyenDung.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void sua() {
        if (tCMND1.getText().isBlank()
                || tChuyenNganh1.getText().isBlank()
                || tDanToc1.getText().isBlank()
                || tDiaChi1.getText().isBlank()
                || tEmail1.getText().isBlank()
                || tNgayCap1.getDate().toString().isBlank()
                || tNgaySinh1.getDate().toString().isBlank()
                || tNoiHoc1.getText().isBlank()
                || tSDT1.getText().isBlank()
                || tTen1.getText().isBlank()
                || tTonGiao1.getText().isBlank()
                || tTrinhDo1.getText().isBlank()
                || tViTri1.getText().isBlank()
                || tXepLoai1.getText().isBlank()) {
            JOptionPane.showMessageDialog(this,
                    "Ban da nhap thieu thong tin",
                    "Thong bao", JOptionPane.PLAIN_MESSAGE);
        } else {
            Date ns = tNgaySinh1.getDate();
//            Date nc = tNgayCap.getDate();
            Nguoi n = new Nguoi(Integer.parseInt(sID.getText()),
                    tGioiTinh1.getSelectedIndex() == 0 ? true : false,
                    tNgaySinh1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                    tNgayCap1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                    tTen1.getText(),
                    tSDT1.getText(),
                    tEmail1.getText(),
                    tDiaChi1.getText(),
                    tGhiChu1.getText(),
                    tTrinhDo1.getText(),
                    tNoiHoc1.getText(),
                    tXepLoai1.getText(),
                    tViTri1.getText(),
                    tChuyenNganh1.getText(),
                    tCMND1.getText(),
                    tDanToc1.getText(),
                    tTonGiao1.getText());
            dsN.set(dongChon, n);

            JOptionPane.showMessageDialog(this,
                    "Ban da cap nhat thanh cong",
                    "Thong bao", JOptionPane.PLAIN_MESSAGE);
            updateTable();
            try {
                ReadWriteObject.WriteObject("Nguoi.bin", dsN);
            } catch (IOException ex) {
                Logger.getLogger(TuyenDung.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        tuyen = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tabSua = new javax.swing.JTabbedPane();
        ThongTin = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        tenN = new javax.swing.JLabel();
        gioiTinh = new javax.swing.JLabel();
        ngSinh = new javax.swing.JLabel();
        sdt = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        cmnd = new javax.swing.JLabel();
        ngCap = new javax.swing.JLabel();
        diaChi = new javax.swing.JLabel();
        danToc = new javax.swing.JLabel();
        tonGiao = new javax.swing.JLabel();
        trinhDo = new javax.swing.JLabel();
        noiDT = new javax.swing.JLabel();
        nganh = new javax.swing.JLabel();
        xepLoai = new javax.swing.JLabel();
        ghiChu = new javax.swing.JLabel();
        Them = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tTen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tNgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        tGioiTinh = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tCMND = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tNgayCap = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        tSDT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tDiaChi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tDanToc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tTonGiao = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tTrinhDo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tNoiHoc = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tXepLoai = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tChuyenNganh = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tViTri = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tGhiChu = new javax.swing.JTextField();
        tBtn = new javax.swing.JButton();
        Sua = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        sID = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tTen1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tNgaySinh1 = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        tGioiTinh1 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        tCMND1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tNgayCap1 = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        tSDT1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tEmail1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tDiaChi1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        tDanToc1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        tTonGiao1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tTrinhDo1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tNoiHoc1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        tXepLoai1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        tChuyenNganh1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        tViTri1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        tGhiChu1 = new javax.swing.JTextField();
        sBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tuyen.setText("Tuyen nguoi nay");
        tuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuyenActionPerformed(evt);
            }
        });
        jPanel1.add(tuyen);

        jButton3.setText("Xoa");
        jPanel1.add(jButton3);

        jButton4.setText("Quay lai");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jScrollPane1.setViewportView(jPanel1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        tabSua.setToolTipText("Chi tiet");

        jPanel3.setLayout(new java.awt.GridLayout(5, 3, 20, 0));

        id.setText("ID: ");
        jPanel3.add(id);

        tenN.setText("Ten:");
        jPanel3.add(tenN);
        jPanel3.add(gioiTinh);
        jPanel3.add(ngSinh);
        jPanel3.add(sdt);
        jPanel3.add(email);
        jPanel3.add(cmnd);
        jPanel3.add(ngCap);
        jPanel3.add(diaChi);
        jPanel3.add(danToc);
        jPanel3.add(tonGiao);
        jPanel3.add(trinhDo);
        jPanel3.add(noiDT);
        jPanel3.add(nganh);
        jPanel3.add(xepLoai);
        jPanel3.add(ghiChu);

        ThongTin.setViewportView(jPanel3);

        tabSua.addTab("Chi Tiet Nguoi Ung Tuyen", ThongTin);

        jPanel4.setLayout(new java.awt.GridLayout(6, 6));

        jLabel1.setText("Ten");
        jPanel4.add(jLabel1);
        jPanel4.add(tTen);

        jLabel2.setText("Ngay sinh");
        jPanel4.add(jLabel2);
        jPanel4.add(tNgaySinh);

        jLabel3.setText("Gioi tinh");
        jPanel4.add(jLabel3);

        tGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nu" }));
        tGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tGioiTinhActionPerformed(evt);
            }
        });
        jPanel4.add(tGioiTinh);

        jLabel4.setText("CMND");
        jPanel4.add(jLabel4);
        jPanel4.add(tCMND);

        jLabel5.setText("Ngay cap");
        jPanel4.add(jLabel5);
        jPanel4.add(tNgayCap);

        jLabel6.setText("SDT");
        jPanel4.add(jLabel6);
        jPanel4.add(tSDT);

        jLabel7.setText("Email");
        jPanel4.add(jLabel7);
        jPanel4.add(tEmail);

        jLabel8.setText("Dia chi");
        jPanel4.add(jLabel8);
        jPanel4.add(tDiaChi);

        jLabel9.setText("Dan toc");
        jPanel4.add(jLabel9);
        jPanel4.add(tDanToc);

        jLabel10.setText("Ton giao");
        jPanel4.add(jLabel10);
        jPanel4.add(tTonGiao);

        jLabel11.setText("Trinh do");
        jPanel4.add(jLabel11);
        jPanel4.add(tTrinhDo);

        jLabel12.setText("Noi hoc");
        jPanel4.add(jLabel12);
        jPanel4.add(tNoiHoc);

        jLabel13.setText("Xep loai");
        jPanel4.add(jLabel13);
        jPanel4.add(tXepLoai);

        jLabel14.setText("Chuyen nganh");
        jPanel4.add(jLabel14);
        jPanel4.add(tChuyenNganh);

        jLabel15.setText("Vi tri");
        jPanel4.add(jLabel15);
        jPanel4.add(tViTri);

        jLabel16.setText("Ghi chu");
        jPanel4.add(jLabel16);
        jPanel4.add(tGhiChu);

        tBtn.setText("Them");
        tBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBtnActionPerformed(evt);
            }
        });
        jPanel4.add(tBtn);

        Them.setViewportView(jPanel4);

        tabSua.addTab("Them", Them);

        jPanel5.setLayout(new java.awt.GridLayout(6, 6));

        jLabel33.setText("Id");
        jPanel5.add(jLabel33);
        jPanel5.add(sID);

        jLabel17.setText("Ten");
        jPanel5.add(jLabel17);
        jPanel5.add(tTen1);

        jLabel18.setText("Ngay sinh");
        jPanel5.add(jLabel18);
        jPanel5.add(tNgaySinh1);

        jLabel19.setText("Gioi tinh");
        jPanel5.add(jLabel19);

        tGioiTinh1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nu" }));
        tGioiTinh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tGioiTinh1ActionPerformed(evt);
            }
        });
        jPanel5.add(tGioiTinh1);

        jLabel20.setText("CMND");
        jPanel5.add(jLabel20);
        jPanel5.add(tCMND1);

        jLabel21.setText("Ngay cap");
        jPanel5.add(jLabel21);
        jPanel5.add(tNgayCap1);

        jLabel22.setText("SDT");
        jPanel5.add(jLabel22);
        jPanel5.add(tSDT1);

        jLabel23.setText("Email");
        jPanel5.add(jLabel23);
        jPanel5.add(tEmail1);

        jLabel24.setText("Dia chi");
        jPanel5.add(jLabel24);
        jPanel5.add(tDiaChi1);

        jLabel25.setText("Dan toc");
        jPanel5.add(jLabel25);
        jPanel5.add(tDanToc1);

        jLabel26.setText("Ton giao");
        jPanel5.add(jLabel26);
        jPanel5.add(tTonGiao1);

        jLabel27.setText("Trinh do");
        jPanel5.add(jLabel27);
        jPanel5.add(tTrinhDo1);

        jLabel28.setText("Noi hoc");
        jPanel5.add(jLabel28);
        jPanel5.add(tNoiHoc1);

        jLabel29.setText("Xep loai");
        jPanel5.add(jLabel29);
        jPanel5.add(tXepLoai1);

        jLabel30.setText("Chuyen nganh");
        jPanel5.add(jLabel30);
        jPanel5.add(tChuyenNganh1);

        jLabel31.setText("Vi tri");
        jPanel5.add(jLabel31);
        jPanel5.add(tViTri1);

        jLabel32.setText("Ghi chu");
        jPanel5.add(jLabel32);
        jPanel5.add(tGhiChu1);

        sBTN.setText("Cap nhat");
        sBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sBTNActionPerformed(evt);
            }
        });
        jPanel5.add(sBTN);

        Sua.setViewportView(jPanel5);

        tabSua.addTab("Sua", Sua);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tabSua, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tabSua, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        dongChon = jTable1.getSelectedRow();
        if (dongChon != -1) {
            ng = dsN.get(dongChon);
            id.setText("Id: " + ng.getId().toString());
            tenN.setText("Ho Ten: " + ng.getTen());
            cmnd.setText("CMND: " + ng.getCmnd());
            danToc.setText("Dan toc: " + ng.getDanToc());
            diaChi.setText("Dia chi: " + ng.getdChi());
            email.setText("Email: " + ng.getEmail());
            gioiTinh.setText(ng.getGioiTinh() == true ? "Gioi tinh: " + "Nam" : "Gioi tinh: " + "Nu");
            ngCap.setText("Ngay cap: " + ng.getNgayCap().toString());
            ngSinh.setText("Ngay sinh: " + ng.getNgaySinh().toString());
            noiDT.setText("Dao tao: " + ng.getNoiDaoTao());
            sdt.setText("SDT: " + ng.getSdt());
            tonGiao.setText("Ton giao: " + ng.getTonGiao());
            trinhDo.setText("Trinh do: " + ng.getTrinhDo());
            xepLoai.setText("Xep loai: " + ng.getXepLoai());
            ghiChu.setText("Ghi chu: " + ng.getGhichu());
            nganh.setText("Nganh: " + ng.getChuyenNganh());

            Nguoi n = dsN.get(dongChon);
            sID.setText(n.getId().toString());
            tGioiTinh1.setSelectedIndex(n.getGioiTinh() == true ? 0 : 1);
            tNgaySinh1.setDate(Date.from(n.getNgaySinh().atStartOfDay(ZoneId.systemDefault()).toInstant()));
            tNgayCap1.setDate(Date.from(n.getNgayCap().atStartOfDay(ZoneId.systemDefault()).toInstant()));
            tTen1.setText(n.getTen());
            tSDT1.setText(n.getSdt());
            tEmail1.setText(n.getEmail());
            tDiaChi1.setText(n.getdChi());
            tGhiChu1.setText(n.getGhichu());
            tTrinhDo1.setText(n.getTrinhDo());
            tNoiHoc1.setText(n.getNoiDaoTao());
            tXepLoai1.setText(n.getXepLoai());
            tViTri1.setText(n.getViTri());
            tChuyenNganh1.setText(n.getChuyenNganh());
            tCMND1.setText(n.getCmnd());
            tDanToc1.setText(n.getDanToc());
            tTonGiao1.setText(n.getTonGiao());

            tuyen.setEnabled(true);
        } else {
            tuyen.setEnabled(false);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuyenActionPerformed
        // TODO add your handling code here:
        if (dongChon != -1) {
            NhanSu ns = new NhanSu(dsN.get(dongChon));
            ArrayList<NhanSu> ns2 = new ArrayList<>();
            try {
//            File f = new File("Nguoi.bin");
//            f.createNewFile();
//            ns1 = (ArrayList<Nguoi>) ReadWriteObject.ReadObject("Nguoi.bin");

                ns2 = (ArrayList<NhanSu>) ReadWriteObject.ReadObject("NhanSu.bin");
                if (ns2 != null) {
                    if (ns2.contains(ns)) {
                        JOptionPane.showMessageDialog(this,
                                "Ban da tuyen nguoi nay truoc do",
                                "Thong bao", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this,
                                "Ban da tuyen thanh cong",
                                "Thong bao", JOptionPane.PLAIN_MESSAGE);
                        ns2.add(ns);
                        ReadWriteObject.WriteObject("NhanSu.bin", ns2);
                    }
                } else {
                    System.out.println("quanlynhansu.view.TuyenDung.tuyenActionPerformed() ns2 null");
                }

            } catch (EOFException ex) {
//                Logger.getLogger(QuanLyNhanSu.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this,
                        "Ban da tuyen thanh cong",
                        "Thong bao", JOptionPane.PLAIN_MESSAGE);
                ns2.add(ns);
                try {
                    ReadWriteObject.WriteObject("NhanSu.bin", ns2);
                } catch (IOException ex1) {
                    Logger.getLogger(TuyenDung.class.getName()).log(Level.SEVERE, null, ex1);
                }

            } catch (IOException ex) {
                Logger.getLogger(QuanLyNhanSu.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TuyenDung.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_tuyenActionPerformed

    private void tGioiTinh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tGioiTinh1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tGioiTinh1ActionPerformed

    private void sBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sBTNActionPerformed
        // TODO add your handling code here:
        sua();
    }//GEN-LAST:event_sBTNActionPerformed

    private void tBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tBtnActionPerformed
        // TODO add your handling code here:
        them();
    }//GEN-LAST:event_tBtnActionPerformed

    private void tGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tGioiTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tGioiTinhActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TuyenDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TuyenDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TuyenDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TuyenDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TuyenDung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Sua;
    private javax.swing.JScrollPane Them;
    private javax.swing.JScrollPane ThongTin;
    private javax.swing.JLabel cmnd;
    private javax.swing.JLabel danToc;
    private javax.swing.JLabel diaChi;
    private javax.swing.JLabel email;
    private javax.swing.JLabel ghiChu;
    private javax.swing.JLabel gioiTinh;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel ngCap;
    private javax.swing.JLabel ngSinh;
    private javax.swing.JLabel nganh;
    private javax.swing.JLabel noiDT;
    private javax.swing.JButton sBTN;
    private javax.swing.JLabel sID;
    private javax.swing.JLabel sdt;
    private javax.swing.JButton tBtn;
    private javax.swing.JTextField tCMND;
    private javax.swing.JTextField tCMND1;
    private javax.swing.JTextField tChuyenNganh;
    private javax.swing.JTextField tChuyenNganh1;
    private javax.swing.JTextField tDanToc;
    private javax.swing.JTextField tDanToc1;
    private javax.swing.JTextField tDiaChi;
    private javax.swing.JTextField tDiaChi1;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tEmail1;
    private javax.swing.JTextField tGhiChu;
    private javax.swing.JTextField tGhiChu1;
    private javax.swing.JComboBox<String> tGioiTinh;
    private javax.swing.JComboBox<String> tGioiTinh1;
    private com.toedter.calendar.JDateChooser tNgayCap;
    private com.toedter.calendar.JDateChooser tNgayCap1;
    private com.toedter.calendar.JDateChooser tNgaySinh;
    private com.toedter.calendar.JDateChooser tNgaySinh1;
    private javax.swing.JTextField tNoiHoc;
    private javax.swing.JTextField tNoiHoc1;
    private javax.swing.JTextField tSDT;
    private javax.swing.JTextField tSDT1;
    private javax.swing.JTextField tTen;
    private javax.swing.JTextField tTen1;
    private javax.swing.JTextField tTonGiao;
    private javax.swing.JTextField tTonGiao1;
    private javax.swing.JTextField tTrinhDo;
    private javax.swing.JTextField tTrinhDo1;
    private javax.swing.JTextField tViTri;
    private javax.swing.JTextField tViTri1;
    private javax.swing.JTextField tXepLoai;
    private javax.swing.JTextField tXepLoai1;
    private javax.swing.JTabbedPane tabSua;
    private javax.swing.JLabel tenN;
    private javax.swing.JLabel tonGiao;
    private javax.swing.JLabel trinhDo;
    private javax.swing.JButton tuyen;
    private javax.swing.JLabel xepLoai;
    // End of variables declaration//GEN-END:variables
}
