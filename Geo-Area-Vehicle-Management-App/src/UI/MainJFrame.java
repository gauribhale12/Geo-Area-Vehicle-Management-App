/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Vehiclehistory;

/**
 *
 * @author gauri
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    Vehiclehistory history;
   
    public MainJFrame() {
        initComponents();
        history = new Vehiclehistory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitpane = new javax.swing.JSplitPane();
        controlpanel = new javax.swing.JPanel();
        btncreate = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        workarea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitpane.setBackground(java.awt.Color.white);

        btncreate.setBackground(java.awt.Color.pink);
        btncreate.setForeground(new java.awt.Color(0, 51, 204));
        btncreate.setText("Create");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        btnview.setBackground(java.awt.Color.pink);
        btnview.setForeground(new java.awt.Color(0, 51, 204));
        btnview.setText("View/Update");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        btnsearch.setBackground(java.awt.Color.pink);
        btnsearch.setForeground(new java.awt.Color(0, 51, 204));
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlpanelLayout = new javax.swing.GroupLayout(controlpanel);
        controlpanel.setLayout(controlpanelLayout);
        controlpanelLayout.setHorizontalGroup(
            controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlpanelLayout.createSequentialGroup()
                .addGroup(controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnview)
                    .addComponent(btncreate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlpanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btncreate, btnsearch, btnview});

        controlpanelLayout.setVerticalGroup(
            controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlpanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(btncreate)
                .addGap(68, 68, 68)
                .addComponent(btnview, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btnsearch)
                .addContainerGap(469, Short.MAX_VALUE))
        );

        controlpanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btncreate, btnsearch, btnview});

        splitpane.setLeftComponent(controlpanel);

        javax.swing.GroupLayout workareaLayout = new javax.swing.GroupLayout(workarea);
        workarea.setLayout(workareaLayout);
        workareaLayout.setHorizontalGroup(
            workareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );
        workareaLayout.setVerticalGroup(
            workareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );

        splitpane.setRightComponent(workarea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitpane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitpane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
        CreateJPanel createPanel = new CreateJPanel(history);
        splitpane.setRightComponent(createPanel);
        
        
    }//GEN-LAST:event_btncreateActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        ViewJPanel viewPanel = new ViewJPanel(history);
        splitpane.setRightComponent(viewPanel);
    }//GEN-LAST:event_btnviewActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        SearchJPanel searchPanel = new SearchJPanel(history);
        splitpane.setRightComponent(searchPanel);
        
    }//GEN-LAST:event_btnsearchActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnview;
    private javax.swing.JPanel controlpanel;
    private javax.swing.JSplitPane splitpane;
    private javax.swing.JPanel workarea;
    // End of variables declaration//GEN-END:variables
}
