/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DINH
 */
public class Form_Bai3 extends javax.swing.JFrame {
    ArrayList<NhanVien> dsNV = new ArrayList<>();
    Object[] columnName = new Object[]{"Họ tên","Ngày sinh","Địa chỉ", "Giới Tính", "Phòng ban","Hệ Số lương","Thâm Niên","Lương cơ bản", "Thực Lĩnh"};
    DefaultTableModel defaultTableModel = new DefaultTableModel(columnName, 0);
    

    /**
     * Creates new form Form     
     */
    public Form_Bai3() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        nhanVien_table = new javax.swing.JTable();
        docDuLieu_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nhanVien_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(nhanVien_table);

        docDuLieu_button.setText("Đọc Dữ Liệu");
        docDuLieu_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docDuLieu_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(docDuLieu_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(docDuLieu_button)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void docDuLieu_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docDuLieu_buttonActionPerformed
        // TODO add your handling code here:
        nhanVien_table.setModel(defaultTableModel);
        
        try {
            FileReader fr = new FileReader("NhanVien_B3.dat");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line=br.readLine()) != null){
                String a[] = line.split("\\$");
                NhanVien nv = new NhanVien(a[4], Integer.valueOf(a[5]), Integer.valueOf(a[6]), Long.valueOf(a[7]), a[0], a[1], a[2], a[3]);
                dsNV.add(nv);
                defaultTableModel.addRow(a);
            }
            br.close();
            fr.close();
            JOptionPane.showMessageDialog(null, "Đọc File thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Đọc file thát bại");
            e.printStackTrace();
        }

    }//GEN-LAST:event_docDuLieu_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Bai3().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton docDuLieu_button;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable nhanVien_table;
    // End of variables declaration//GEN-END:variables
}
