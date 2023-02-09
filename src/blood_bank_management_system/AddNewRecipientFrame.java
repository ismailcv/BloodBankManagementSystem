/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blood_bank_management_system;

/**
 *
 * @author canVarli
 */
public class AddNewRecipientFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddNewRecipientFrame
     */
    public AddNewRecipientFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        textfield_recipient_full_name_ = new javax.swing.JTextField();
        textfield_recipient_contact_no = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea_remars = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        lbl_recipient_id = new javax.swing.JLabel();
        comboBox_recipient_blood_group = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textfield_recipient_complete_address = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Contact Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        btn_save.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood_bank_management_system/save.png"))); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Remarks");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        textfield_recipient_full_name_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_recipient_full_name_ActionPerformed(evt);
            }
        });
        jPanel1.add(textfield_recipient_full_name_, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 90, 125, -1));

        textfield_recipient_contact_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_recipient_contact_noActionPerformed(evt);
            }
        });
        jPanel1.add(textfield_recipient_contact_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 125, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD NEW RECIPIENT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 385, -1));

        textarea_remars.setColumns(20);
        textarea_remars.setRows(5);
        jScrollPane1.setViewportView(textarea_remars);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 226, 109));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Recipient ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 56, -1, -1));

        lbl_recipient_id.setText("0");
        jPanel1.add(lbl_recipient_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 56, 42, -1));

        comboBox_recipient_blood_group.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "0+", "0-" }));
        comboBox_recipient_blood_group.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_recipient_blood_groupActionPerformed(evt);
            }
        });
        jPanel1.add(comboBox_recipient_blood_group, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 130, 126, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Full Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 93, -1, -1));

        btn_close.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood_bank_management_system/Exit application.png"))); // NOI18N
        btn_close.setText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Recipient Blood Group");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 133, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Complete Address");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        textfield_recipient_complete_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_recipient_complete_addressActionPerformed(evt);
            }
        });
        jPanel1.add(textfield_recipient_complete_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 125, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood_bank_management_system/all page background image.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_saveActionPerformed

    private void textfield_recipient_contact_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_recipient_contact_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_recipient_contact_noActionPerformed

    private void comboBox_recipient_blood_groupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_recipient_blood_groupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_recipient_blood_groupActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        this.dispose();
        MainPageFrame mainPageFrame = new MainPageFrame();
        mainPageFrame.setVisible(true);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void textfield_recipient_complete_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_recipient_complete_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_recipient_complete_addressActionPerformed

    private void textfield_recipient_full_name_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_recipient_full_name_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_recipient_full_name_ActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewRecipientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewRecipientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewRecipientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewRecipientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewRecipientFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox<String> comboBox_recipient_blood_group;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_recipient_id;
    private javax.swing.JTextArea textarea_remars;
    private javax.swing.JTextField textfield_recipient_complete_address;
    private javax.swing.JTextField textfield_recipient_contact_no;
    private javax.swing.JTextField textfield_recipient_full_name_;
    // End of variables declaration//GEN-END:variables
}
