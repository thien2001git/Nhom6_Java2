/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlynhansu.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import quanlynhansu.model.KhenThuongVaKiLuat;
import quanlynhansu.model.NhanSu;
import quanlynhansu.model.ReadWriteObject;
import quanlynhansu.table.TableKTKL;

/**
 *
 * @author hxt
 */
public class KTKL extends javax.swing.JFrame {

    /**
     * Creates new form KTKL
     */
    Integer dongChon = -1;
    ArrayList<NhanSu> dsNS;
    ArrayList<KhenThuongVaKiLuat> dskk = new ArrayList<>();
    ArrayList<javax.swing.JCheckBox> dsC;

    public KTKL() {
        initComponents();
        dsC = new ArrayList<>();

        try {
            dsNS = (ArrayList<NhanSu>) ReadWriteObject.ReadObject("NhanSu.bin");
            dskk = (ArrayList<KhenThuongVaKiLuat>) ReadWriteObject.ReadObject("Ktkl.bin");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(NhanSuJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NhanSuJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        for (int i = 0; i < dskk.size(); i++) {
            javax.swing.JCheckBox cc = new javax.swing.JCheckBox();
            cc.setText(dskk.get(i).toString());
            cc.setEnabled(true);
            dsC.add(cc);
            sSuaSuKien.add(cc);
        }
        updateTable();
    }

    public void updateTable() {

        jTable2.setModel(new TableKTKL(dsNS, dskk));
        try {
            ReadWriteObject.WriteObject("NhanSu.bin", dsNS);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(NhanSuJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public String getHoTen(Integer id) {
        NhanSu ns = new NhanSu();
        ns.setId(id);
        if (dsNS.contains(ns)) {
            return dsNS.get(dsNS.indexOf(ns)).getTen();
        }
        return "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        tabSua = new javax.swing.JTabbedPane();
        ThongTin = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        ttId = new javax.swing.JLabel();
        ttTen = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Sua = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        sID = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        sTen = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        sSuaSuKien = new javax.swing.JPanel();
        sBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton7.setText("Quay lai");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);

        jScrollPane2.setViewportView(jPanel2);

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

        tabSua.setToolTipText("Chi tiet");

        jPanel3.setLayout(new java.awt.GridLayout(3, 1));

        ttId.setText("ID:");
        jPanel3.add(ttId);

        ttTen.setText("Ten:");
        jPanel3.add(ttTen);

        jLabel4.setText("Danh sach");
        jPanel3.add(jLabel4);

        jScrollPane1.setViewportView(jList1);

        jPanel3.add(jScrollPane1);

        ThongTin.setViewportView(jPanel3);

        tabSua.addTab("Chi tiet luong", ThongTin);

        jPanel5.setLayout(new java.awt.GridLayout(4, 6));

        jLabel33.setText("Id");
        jPanel5.add(jLabel33);
        jPanel5.add(sID);

        jLabel17.setText("Ten");
        jPanel5.add(jLabel17);
        jPanel5.add(sTen);

        jLabel5.setText("Them su kien");
        jPanel5.add(jLabel5);

        sSuaSuKien.setLayout(new java.awt.GridLayout(6, 0));
        jScrollPane5.setViewportView(sSuaSuKien);

        jPanel5.add(jScrollPane5);

        sBTN.setText("Sua");
        jPanel5.add(sBTN);

        Sua.setViewportView(jPanel5);

        tabSua.addTab("Sua", Sua);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tabSua)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabSua)
                .addContainerGap())
        );

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

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        dongChon = jTable2.getSelectedRow();
        if (dongChon != -1) {
            ttId.setText("ID: " + dskk.get(dongChon).getId().toString());
            ttTen.setText("Ho ten: " + getHoTen(dskk.get(dongChon).getId()));

            ArrayList<String> k2 = new ArrayList<>();
            for (Iterator<KhenThuongVaKiLuat> iterator = dskk.iterator(); iterator.hasNext();) {
                KhenThuongVaKiLuat next = iterator.next();
                if (next.getId() == dskk.get(dongChon).getId()) {
                    k2.add(next.toString());
                }
            }

            DefaultListModel<String> model = new DefaultListModel<>();
            model.addAll(k2);
            jList1.setModel(model);

//            sSuaSuKien.remove;
            for (Iterator<javax.swing.JCheckBox> iterator = dsC.iterator(); iterator.hasNext();) {
                javax.swing.JCheckBox next = iterator.next();
                if(k2.contains(next.getText())) {
                    if(next.isSelected() == false) {
                        next.doClick();
                    }
                } else {
                    if(next.isSelected() == true) {
                        next.doClick();
                    }
                }

            }

            sID.setText(dskk.get(dongChon).getId().toString());
            sTen.setText(getHoTen(dskk.get(dongChon).getId()));
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
            java.util.logging.Logger.getLogger(KTKL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KTKL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KTKL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KTKL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KTKL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Sua;
    private javax.swing.JScrollPane ThongTin;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton sBTN;
    private javax.swing.JLabel sID;
    private javax.swing.JPanel sSuaSuKien;
    private javax.swing.JLabel sTen;
    private javax.swing.JTabbedPane tabSua;
    private javax.swing.JLabel ttId;
    private javax.swing.JLabel ttTen;
    // End of variables declaration//GEN-END:variables
}
