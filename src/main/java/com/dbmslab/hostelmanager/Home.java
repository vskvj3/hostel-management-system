/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dbmslab.hostelmanager;

/**
 *
 * @author cy34
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        BackgroundPanel = new javax.swing.JPanel();
        addInmateDetailsBtn = new javax.swing.JButton();
        updateAttendeceBtn = new javax.swing.JButton();
        addMonthExpenditureBtn = new javax.swing.JButton();
        addEstablishmentFeeBtn = new javax.swing.JButton();
        calculateMessBillbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("homeFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 500));

        BackgroundPanel.setBackground(new java.awt.Color(0, 204, 204));

        addInmateDetailsBtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        addInmateDetailsBtn.setText("Add Inmate Details");
        addInmateDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInmateDetailsBtnActionPerformed(evt);
            }
        });

        updateAttendeceBtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        updateAttendeceBtn.setText("Update Attendence");
        updateAttendeceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAttendeceBtnActionPerformed(evt);
            }
        });

        addMonthExpenditureBtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        addMonthExpenditureBtn.setText("Add Month Expanditure");
        addMonthExpenditureBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMonthExpenditureBtnActionPerformed(evt);
            }
        });

        addEstablishmentFeeBtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        addEstablishmentFeeBtn.setText("Add Establishment Fee");
        addEstablishmentFeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEstablishmentFeeBtnActionPerformed(evt);
            }
        });

        calculateMessBillbtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        calculateMessBillbtn.setText("Calculate Mess Bill");
        calculateMessBillbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateMessBillbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel1.setText("Hostel Management System");

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGap(487, 487, 487)
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addMonthExpenditureBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addInmateDetailsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateAttendeceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addEstablishmentFeeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calculateMessBillbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(435, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(385, 385, 385))
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addComponent(addInmateDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(updateAttendeceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(addMonthExpenditureBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(addEstablishmentFeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(calculateMessBillbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addInmateDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInmateDetailsBtnActionPerformed
        // TODO add your handling code here:
        new addInmate().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addInmateDetailsBtnActionPerformed

    private void addMonthExpenditureBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMonthExpenditureBtnActionPerformed
        // TODO add your handling code here:
        new addExpanditure().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addMonthExpenditureBtnActionPerformed

    private void updateAttendeceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAttendeceBtnActionPerformed
        // TODO add your handling code here:
        new updateAttendence().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_updateAttendeceBtnActionPerformed

    private void addEstablishmentFeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEstablishmentFeeBtnActionPerformed
        // TODO add your handling code here:
        new addEstablishment().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addEstablishmentFeeBtnActionPerformed

    private void calculateMessBillbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateMessBillbtnActionPerformed
        // TODO add your handling code here:
        new calculateMessbill().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_calculateMessBillbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JButton addEstablishmentFeeBtn;
    private javax.swing.JButton addInmateDetailsBtn;
    private javax.swing.JButton addMonthExpenditureBtn;
    private javax.swing.JButton calculateMessBillbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton updateAttendeceBtn;
    // End of variables declaration//GEN-END:variables
}
