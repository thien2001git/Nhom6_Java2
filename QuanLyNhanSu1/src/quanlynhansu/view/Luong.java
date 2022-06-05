/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlynhansu.view;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import quanlynhansu.model.NhanSu;
import quanlynhansu.model.ReadWriteObject;
import quanlynhansu.table.TableLuong;
import quanlynhansu.table.TableNhanSu;

/**
 *
 * @author hxt
 */
public class Luong extends javax.swing.JFrame {

    /**
     * Creates new form Luong
     */
    int dongChon = -1;
//     ng;
    ArrayList<NhanSu> dsNS;

    public Luong() {
        initComponents();
        try {
            dsNS = (ArrayList<NhanSu>) ReadWriteObject.ReadObject("NhanSu.bin");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(NhanSuJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,
                        "Khong the doc du lieu",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NhanSuJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,
                        "Khong the doc du lieu",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
        }
        updateTable();
        jTable2.setAutoCreateRowSorter(true);
    }

    public void updateTable() {

        jTable2.setModel(new TableLuong(dsNS));
        try {
            ReadWriteObject.WriteObject("NhanSu.bin", dsNS);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(NhanSuJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,
                        "Khong the ghi du lieu",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        tabSua = new javax.swing.JTabbedPane();
        ThongTin = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        ttId = new javax.swing.JLabel();
        ttTen = new javax.swing.JLabel();
        ttSdt = new javax.swing.JLabel();
        ttLuongCoBan = new javax.swing.JLabel();
        ttSoNgayCong = new javax.swing.JLabel();
        ttHeSo = new javax.swing.JLabel();
        ttPhuCap = new javax.swing.JLabel();
        ttTongLuong = new javax.swing.JLabel();
        Sua = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        sID = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        sTen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sLuongCoBan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sHeSo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sPhuCap = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sSoNgayCong = new javax.swing.JSpinner();
        sBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jButton7.setText("Quay lai");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);

        jScrollPane2.setViewportView(jPanel2);

        jPanel1.add(jScrollPane2);

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        jSplitPane2.setLeftComponent(jScrollPane4);

        tabSua.setToolTipText("Chi tiet");

        jPanel3.setLayout(new java.awt.GridLayout(5, 3, 20, 0));

        ttId.setText("ID:");
        jPanel3.add(ttId);

        ttTen.setText("Ten:");
        jPanel3.add(ttTen);

        ttSdt.setText("SDT:");
        jPanel3.add(ttSdt);

        ttLuongCoBan.setText("Luong co ban:");
        jPanel3.add(ttLuongCoBan);

        ttSoNgayCong.setText("So ngay cong:");
        jPanel3.add(ttSoNgayCong);

        ttHeSo.setText("He so:");
        jPanel3.add(ttHeSo);

        ttPhuCap.setText("Phu cap:");
        jPanel3.add(ttPhuCap);

        ttTongLuong.setText("Tong luong");
        jPanel3.add(ttTongLuong);

        ThongTin.setViewportView(jPanel3);

        tabSua.addTab("Chi tiet luong", ThongTin);

        jPanel5.setLayout(new java.awt.GridLayout(4, 6));

        jLabel33.setText("Id");
        jPanel5.add(jLabel33);
        jPanel5.add(sID);

        jLabel17.setText("Ten");
        jPanel5.add(jLabel17);
        jPanel5.add(sTen);

        jLabel1.setText("Luong co ban");
        jPanel5.add(jLabel1);
        jPanel5.add(sLuongCoBan);

        jLabel2.setText("He so");
        jPanel5.add(jLabel2);
        jPanel5.add(sHeSo);

        jLabel3.setText("Phu cap");
        jPanel5.add(jLabel3);
        jPanel5.add(sPhuCap);

        jLabel7.setText("So ngay cong");
        jPanel5.add(jLabel7);
        jPanel5.add(sSoNgayCong);

        sBTN.setText("Cap nhat");
        sBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sBTNActionPerformed(evt);
            }
        });
        jPanel5.add(sBTN);

        Sua.setViewportView(jPanel5);

        tabSua.addTab("Sua", Sua);

        jSplitPane2.setRightComponent(tabSua);

        jPanel4.add(jSplitPane2);

        jSplitPane1.setRightComponent(jPanel4);

        getContentPane().add(jSplitPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton7ActionPerformed

    private void sBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sBTNActionPerformed
        // TODO add your handling code here:
        if (dongChon != -1) {
            dongChon = jTable2.convertRowIndexToModel(dongChon);
            quanlynhansu.model.Luong l = dsNS.get(dongChon).getLuong();
            NhanSu n = dsNS.get(dongChon);
            try {
                l.setHeso(Double.parseDouble(sHeSo.getText()));
                l.setLuongcb(Double.parseDouble(sLuongCoBan.getText()));
                l.setPhucap(Double.parseDouble(sPhuCap.getText()));
                n.setSongaycong((Integer) sSoNgayCong.getValue());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,
                        "Ban phai nhap so",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            updateTable();
        }
    }//GEN-LAST:event_sBTNActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        dongChon = jTable2.getSelectedRow();
        if (dongChon != -1) {
            dongChon = jTable2.convertRowIndexToModel(dongChon);
            quanlynhansu.model.Luong l = dsNS.get(dongChon).getLuong();
            NhanSu n = dsNS.get(dongChon);
            ttHeSo.setText("He so: " + l.getHeso().toString());
            ttId.setText("Id: " + n.getId().toString());
            ttLuongCoBan.setText("Luong co ban: " + l.getLuongcb().toString());
            ttPhuCap.setText("Phu cap: " + l.getPhucap().toString());
            ttSdt.setText("SDT: " + n.getSdt());
            ttSoNgayCong.setText("So ngay cong: " + n.getSongaycong().toString());
            ttTen.setText("Ho Ten: " + n.getTen());
            ttTongLuong.setText("Tong luong: " + l.getTongluong().toString());

            sID.setText(n.getId().toString());
            sTen.setText(n.getTen());
            sLuongCoBan.setText(l.getLuongcb().toString());
            sPhuCap.setText(l.getPhucap().toString());
            sSoNgayCong.setValue(n.getSongaycong());
            sHeSo.setText(l.getHeso().toString());

        }
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(Luong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Luong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Luong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Luong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Luong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Sua;
    private javax.swing.JScrollPane ThongTin;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton sBTN;
    private javax.swing.JTextField sHeSo;
    private javax.swing.JLabel sID;
    private javax.swing.JTextField sLuongCoBan;
    private javax.swing.JTextField sPhuCap;
    private javax.swing.JSpinner sSoNgayCong;
    private javax.swing.JLabel sTen;
    private javax.swing.JTabbedPane tabSua;
    private javax.swing.JLabel ttHeSo;
    private javax.swing.JLabel ttId;
    private javax.swing.JLabel ttLuongCoBan;
    private javax.swing.JLabel ttPhuCap;
    private javax.swing.JLabel ttSdt;
    private javax.swing.JLabel ttSoNgayCong;
    private javax.swing.JLabel ttTen;
    private javax.swing.JLabel ttTongLuong;
    // End of variables declaration//GEN-END:variables
}
