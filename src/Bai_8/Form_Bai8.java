/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_8;

import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author DINH
 */
public class Form_Bai8 extends javax.swing.JFrame {
    int value, max, min;
    Number nb;
    int check=0;
    public void khoiTao(){
        try {
            max = Integer.valueOf(max_txt.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nhập sai định dạng!");
            max_txt.selectAll();
            max_txt.requestFocus();
        }
        try {
            min = Integer.valueOf(min_txt.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nhập sai định dạng!");
            min_txt.selectAll();
            min_txt.requestFocus();
        }
        try {
            value = Integer.valueOf(value_txt.getText());
            if(value<=min || value>=max){
                JOptionPane.showMessageDialog(null,"Value không thoả mãn trong khoảng min-max");
                value_txt.selectAll();
                value_txt.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null,"Khởi tạo thành công !");
                check=1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nhập sai định dạng!");
            value_txt.selectAll();
            value_txt.requestFocus();
        }
    }
    
    public Form_Bai8() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        khoiTao_button = new javax.swing.JButton();
        luuTru_button = new javax.swing.JButton();
        value_txt = new javax.swing.JTextField();
        min_txt = new javax.swing.JTextField();
        max_txt = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Value");

        jLabel2.setText("Min");

        jLabel4.setText("Max");

        khoiTao_button.setText("Khởi tạo");
        khoiTao_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                khoiTao_buttonActionPerformed(evt);
            }
        });

        luuTru_button.setText("Lưu trữ");
        luuTru_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luuTru_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(value_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(min_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(max_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(khoiTao_button)
                        .addGap(42, 42, 42)
                        .addComponent(luuTru_button)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(value_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(min_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(max_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(khoiTao_button)
                    .addComponent(luuTru_button))
                .addGap(96, 96, 96))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void khoiTao_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_khoiTao_buttonActionPerformed
        // TODO add your handling code here:
        khoiTao();
        nb = new Number(value, max, min);
    }//GEN-LAST:event_khoiTao_buttonActionPerformed

    private void luuTru_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luuTru_buttonActionPerformed
        // TODO add your handling code here:
        if(check==1){
            if(nb.soNT()){
            try {
                FileWriter fw = new FileWriter("Number_bai8.dat",true);
                fw.write(nb.toString());
                fw.close();
                JOptionPane.showMessageDialog(null,"Lưu File thành công !");
            } catch (Exception e) {
                e.printStackTrace();
            }
            } else {
                JOptionPane.showMessageDialog(null,"Value không phải số nguyên tố!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lưu File không thành công!");
        }
    }//GEN-LAST:event_luuTru_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Bai8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Bai8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Bai8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Bai8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Bai8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton khoiTao_button;
    private javax.swing.JButton luuTru_button;
    private javax.swing.JTextField max_txt;
    private javax.swing.JTextField min_txt;
    private javax.swing.JTextField value_txt;
    // End of variables declaration//GEN-END:variables
}
