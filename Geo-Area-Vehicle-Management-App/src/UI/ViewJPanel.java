/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Vehicle;
import Model.Vehiclehistory;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gauri
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    Vehiclehistory history;
    boolean availveh = false;
    boolean uberaffil = false;
    public ViewJPanel(Vehiclehistory history) {
        initComponents();
        this.history = history;
        populatetable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpavail = new javax.swing.ButtonGroup();
        btngrpaff = new javax.swing.ButtonGroup();
        LbTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblvehicles = new javax.swing.JTable();
        btnview = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        RbUberAffYes = new javax.swing.JRadioButton();
        txtmanfname = new javax.swing.JTextField();
        RbUberAffNo = new javax.swing.JRadioButton();
        LbManfYear = new javax.swing.JLabel();
        txtmanfyear = new javax.swing.JTextField();
        Lbseats = new javax.swing.JLabel();
        LbAvail = new javax.swing.JLabel();
        txtseats = new javax.swing.JTextField();
        LbSerialNo = new javax.swing.JLabel();
        txtSerialNo = new javax.swing.JTextField();
        RBavailyes = new javax.swing.JRadioButton();
        LbModelNo = new javax.swing.JLabel();
        RBavailNo = new javax.swing.JRadioButton();
        txtModelNo = new javax.swing.JTextField();
        LbManfName = new javax.swing.JLabel();
        LbUberAff = new javax.swing.JLabel();
        LbCity = new javax.swing.JLabel();
        txtcity = new javax.swing.JTextField();
        Lbexpmancert = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        txtexpcert = new javax.swing.JTextField();

        setBackground(java.awt.Color.white);
        setForeground(new java.awt.Color(0, 0, 204));

        LbTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbTitle.setText("View");

        tblvehicles.setBackground(java.awt.Color.pink);
        tblvehicles.setForeground(new java.awt.Color(0, 0, 204));
        tblvehicles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Serial No", "Manufacturer", "No. of Seats", "City"
            }
        ));
        tblvehicles.setGridColor(new java.awt.Color(0, 51, 204));
        jScrollPane1.setViewportView(tblvehicles);

        btnview.setBackground(java.awt.Color.pink);
        btnview.setForeground(new java.awt.Color(0, 0, 204));
        btnview.setText("View");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        btnupdate.setBackground(java.awt.Color.pink);
        btnupdate.setForeground(new java.awt.Color(0, 0, 204));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        RbUberAffYes.setBackground(java.awt.Color.white);
        btngrpaff.add(RbUberAffYes);
        RbUberAffYes.setForeground(new java.awt.Color(0, 0, 204));
        RbUberAffYes.setText("Yes");
        RbUberAffYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbUberAffYesActionPerformed(evt);
            }
        });

        RbUberAffNo.setBackground(java.awt.Color.white);
        btngrpaff.add(RbUberAffNo);
        RbUberAffNo.setForeground(new java.awt.Color(0, 0, 204));
        RbUberAffNo.setText("No");
        RbUberAffNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbUberAffNoActionPerformed(evt);
            }
        });

        LbManfYear.setBackground(java.awt.Color.white);
        LbManfYear.setForeground(new java.awt.Color(0, 0, 204));
        LbManfYear.setText("Manufacturing Year:");

        Lbseats.setBackground(java.awt.Color.white);
        Lbseats.setForeground(new java.awt.Color(0, 0, 204));
        Lbseats.setText("No. of Seats:");

        LbAvail.setBackground(java.awt.Color.white);
        LbAvail.setForeground(new java.awt.Color(0, 0, 204));
        LbAvail.setText("Availability:");

        LbSerialNo.setBackground(java.awt.Color.white);
        LbSerialNo.setForeground(new java.awt.Color(0, 0, 204));
        LbSerialNo.setText("Serial Number:");

        RBavailyes.setBackground(java.awt.Color.white);
        btngrpavail.add(RBavailyes);
        RBavailyes.setForeground(new java.awt.Color(0, 0, 204));
        RBavailyes.setText("Yes");
        RBavailyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBavailyesActionPerformed(evt);
            }
        });

        LbModelNo.setBackground(java.awt.Color.white);
        LbModelNo.setForeground(new java.awt.Color(0, 0, 204));
        LbModelNo.setText("Model Number:");

        RBavailNo.setBackground(java.awt.Color.white);
        btngrpavail.add(RBavailNo);
        RBavailNo.setForeground(new java.awt.Color(0, 0, 204));
        RBavailNo.setText("No");
        RBavailNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBavailNoActionPerformed(evt);
            }
        });

        LbManfName.setBackground(java.awt.Color.white);
        LbManfName.setForeground(new java.awt.Color(0, 0, 204));
        LbManfName.setText("Manufacturer:");

        LbUberAff.setBackground(java.awt.Color.white);
        LbUberAff.setForeground(new java.awt.Color(0, 0, 204));
        LbUberAff.setText("Uber Affiliation:");

        LbCity.setBackground(java.awt.Color.white);
        LbCity.setForeground(new java.awt.Color(0, 0, 204));
        LbCity.setText("City:");

        Lbexpmancert.setBackground(java.awt.Color.white);
        Lbexpmancert.setForeground(new java.awt.Color(0, 0, 204));
        Lbexpmancert.setText("Expied Maintenance Certificate Date:");

        btnsave.setBackground(java.awt.Color.pink);
        btnsave.setForeground(new java.awt.Color(0, 0, 204));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 791, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnsave)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnview)
                                .addGap(43, 43, 43)
                                .addComponent(btnupdate)))
                        .addGap(28, 28, 28))))
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbUberAff)
                            .addComponent(LbCity))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RbUberAffYes)
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RbUberAffNo)
                                    .addComponent(txtexpcert, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(Lbexpmancert))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(259, 259, 259)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LbAvail)
                                .addComponent(LbManfName)
                                .addComponent(LbManfYear)
                                .addComponent(Lbseats))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtmanfyear, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(RBavailyes)
                                    .addGap(45, 45, 45)
                                    .addComponent(RBavailNo))
                                .addComponent(txtmanfname)
                                .addComponent(txtseats)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LbSerialNo)
                                .addComponent(LbModelNo))
                            .addGap(52, 52, 52)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(452, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnupdate, btnview});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnview)
                    .addComponent(btnupdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbexpmancert)
                    .addComponent(txtexpcert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbUberAff)
                    .addComponent(RbUberAffYes)
                    .addComponent(RbUberAffNo))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbCity)
                    .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnsave)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(208, 208, 208)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LbAvail)
                        .addComponent(RBavailyes)
                        .addComponent(RBavailNo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(LbManfName))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(txtmanfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtmanfyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LbManfYear))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(Lbseats))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(txtseats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LbSerialNo)
                        .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LbModelNo)
                        .addComponent(txtModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(160, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnupdate, btnview});

    }// </editor-fold>//GEN-END:initComponents

    private void RbUberAffYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbUberAffYesActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_RbUberAffYesActionPerformed

    private void RbUberAffNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbUberAffNoActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_RbUberAffNoActionPerformed

    private void RBavailyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBavailyesActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_RBavailyesActionPerformed

    private void RBavailNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBavailNoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_RBavailNoActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblvehicles.getSelectedRow();
        Vehicle selectedVehicle = history.getHistory().get(selectedRowIndex);
        selectedVehicle.setUberaff(Boolean.parseBoolean(btngrpaff.getSelection().getActionCommand()));
        selectedVehicle.setCompname(txtmanfname.getText());
        selectedVehicle.setManfyear(Integer.parseInt(txtmanfyear.getText()));
        selectedVehicle.setSeats(Integer.parseInt(txtseats.getText()));
        selectedVehicle.setSerialno(txtSerialNo.getText());
        selectedVehicle.setModelno(txtModelNo.getText());
        selectedVehicle.setCity(txtcity.getText());
        selectedVehicle.setAvail(Boolean.parseBoolean(btngrpavail.getSelection().getActionCommand()));
        
        JOptionPane.showMessageDialog(this,"Upadted");
        
        populatetable();
        

        
        

    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        btnsave.setEnabled(false);
        int selectedRowIndex = tblvehicles.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Select a row to view");
            return;    
        }
        else{
        
        Vehicle selectedvehicles = history.getHistory().get(selectedRowIndex);
        if(selectedvehicles.isAvail()){
            RBavailyes.setSelected(true);
        }
        else{
            RBavailNo.setSelected(false);
        }
        txtModelNo.setText(String.valueOf(selectedvehicles.getModelno()));
        txtSerialNo.setText(String.valueOf(selectedvehicles.getSerialno()));
        txtcity.setText(String.valueOf(selectedvehicles.getCity()));
        txtmanfname.setText(String.valueOf(selectedvehicles.getCompname()));
        txtmanfyear.setText(String.valueOf(selectedvehicles.getManfyear()));
        txtseats.setText(String.valueOf(selectedvehicles.getSeats()));
        txtexpcert.setText(String.valueOf(selectedvehicles.getExpcert()));
        
        if(selectedvehicles.isUberaff()){
            RbUberAffYes.setSelected(true);
        }
        else{
            RbUberAffNo.setSelected(false);
        }
        }
    }//GEN-LAST:event_btnviewActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        btnsave.setEnabled(true);
        int selectedRowIndex = tblvehicles.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Select the row to be updated");
        }
        else{
            Vehicle selectedVehicle = history.getHistory().get(selectedRowIndex);
            if(selectedVehicle.isUberaff()){
                RbUberAffYes.setSelected(true);
            }
            else{
                RbUberAffNo.setSelected(true);
            }
            txtModelNo.setText(String.valueOf(selectedVehicle.getModelno()));
            txtSerialNo.setText(String.valueOf(selectedVehicle.getSerialno()));
            txtcity.setText(String.valueOf(selectedVehicle.getCity()));
            txtmanfname.setText(String.valueOf(selectedVehicle.getCompname()));
            txtmanfyear.setText(String.valueOf(selectedVehicle.getManfyear()));
            txtseats.setText(String.valueOf(selectedVehicle.getSeats()));
            txtexpcert.setText(String.valueOf(selectedVehicle.getExpcert()));
            
            if(selectedVehicle.isAvail()){
                RBavailyes.setSelected(true);
            }
            else{
                RBavailNo.setSelected(true);
            }   
        }
    }//GEN-LAST:event_btnupdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbAvail;
    private javax.swing.JLabel LbCity;
    private javax.swing.JLabel LbManfName;
    private javax.swing.JLabel LbManfYear;
    private javax.swing.JLabel LbModelNo;
    private javax.swing.JLabel LbSerialNo;
    private javax.swing.JLabel LbTitle;
    private javax.swing.JLabel LbUberAff;
    private javax.swing.JLabel Lbexpmancert;
    private javax.swing.JLabel Lbseats;
    private javax.swing.JRadioButton RBavailNo;
    private javax.swing.JRadioButton RBavailyes;
    private javax.swing.JRadioButton RbUberAffNo;
    private javax.swing.JRadioButton RbUberAffYes;
    private javax.swing.ButtonGroup btngrpaff;
    private javax.swing.ButtonGroup btngrpavail;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnview;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblvehicles;
    private javax.swing.JTextField txtModelNo;
    private javax.swing.JTextField txtSerialNo;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtexpcert;
    private javax.swing.JTextField txtmanfname;
    private javax.swing.JTextField txtmanfyear;
    private javax.swing.JTextField txtseats;
    // End of variables declaration//GEN-END:variables

    private void populatetable() {
        DefaultTableModel model = (DefaultTableModel) tblvehicles.getModel();
        model.setRowCount(0);
        for (Vehicle vh : history.getHistory()){
        Object row[] = new Object[4];
        row[0] = vh.getSerialno();
        row[1] = vh.getCompname();
        row[2]= vh.getSeats();
        row[3]= vh.getCity();
        
        model.addRow(row);
                
        }
    }
}
