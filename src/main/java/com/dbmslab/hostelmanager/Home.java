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
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        addInmateDetailsBtn = new javax.swing.JButton();
        updateAttendeceBtn = new javax.swing.JButton();
        addMonthExpenditureBtn = new javax.swing.JButton();
        calculateMessBillbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hostel Manager");
        setMinimumSize(new java.awt.Dimension(10, 0));
        setName("homeFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1400, 900));

        BackgroundPanel.setBackground(new java.awt.Color(0, 153, 153));
        BackgroundPanel.setMaximumSize(new java.awt.Dimension(1400, 900));
        BackgroundPanel.setMinimumSize(new java.awt.Dimension(1400, 900));
        BackgroundPanel.setPreferredSize(new java.awt.Dimension(1400, 900));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOSTEL MANAGEMENT SYSTEM");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        addInmateDetailsBtn.setBackground(new java.awt.Color(0, 51, 51));
        addInmateDetailsBtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        addInmateDetailsBtn.setForeground(new java.awt.Color(255, 255, 255));
        addInmateDetailsBtn.setText("EDIT INMATE DETAILS");
        addInmateDetailsBtn.setBorder(null);
        addInmateDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInmateDetailsBtnActionPerformed(evt);
            }
        });

        updateAttendeceBtn.setBackground(new java.awt.Color(0, 51, 51));
        updateAttendeceBtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        updateAttendeceBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateAttendeceBtn.setText("UPDATE ATTENDENCE");
        updateAttendeceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAttendeceBtnActionPerformed(evt);
            }
        });

        addMonthExpenditureBtn.setBackground(new java.awt.Color(0, 51, 51));
        addMonthExpenditureBtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        addMonthExpenditureBtn.setForeground(new java.awt.Color(255, 255, 255));
        addMonthExpenditureBtn.setText("ADD EXPENSE");
        addMonthExpenditureBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMonthExpenditureBtnActionPerformed(evt);
            }
        });

        calculateMessBillbtn.setBackground(new java.awt.Color(0, 51, 51));
        calculateMessBillbtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        calculateMessBillbtn.setForeground(new java.awt.Color(255, 255, 255));
        calculateMessBillbtn.setText("CALCULATE MESS BILL");
        calculateMessBillbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateMessBillbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(calculateMessBillbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMonthExpenditureBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateAttendeceBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(addInmateDetailsBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(addInmateDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(updateAttendeceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(addMonthExpenditureBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(calculateMessBillbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(462, Short.MAX_VALUE))
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(335, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1435, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
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
    private javax.swing.JButton addInmateDetailsBtn;
    private javax.swing.JButton addMonthExpenditureBtn;
    private javax.swing.JButton calculateMessBillbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton updateAttendeceBtn;
    // End of variables declaration//GEN-END:variables
}
