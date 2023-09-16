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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author gauri
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    Vehiclehistory history;
    boolean availveh = false;
    boolean uberaffil = false;
    public CreateJPanel(Vehiclehistory history) {
        initComponents();
        this.history = history; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupAvail = new javax.swing.ButtonGroup();
        btnGroupUber = new javax.swing.ButtonGroup();
        LbTitle = new javax.swing.JLabel();
        LbAvail = new javax.swing.JLabel();
        RBavailyes = new javax.swing.JRadioButton();
        RBavailNo = new javax.swing.JRadioButton();
        LbManfName = new javax.swing.JLabel();
        txtmanfname = new javax.swing.JTextField();
        LbManfYear = new javax.swing.JLabel();
        txtmanfyear = new javax.swing.JTextField();
        Lbseats = new javax.swing.JLabel();
        txtseats = new javax.swing.JTextField();
        LbSerialNo = new javax.swing.JLabel();
        txtSerialNo = new javax.swing.JTextField();
        LbModelNo = new javax.swing.JLabel();
        txtModelNo = new javax.swing.JTextField();
        LbUberAff = new javax.swing.JLabel();
        RbUberAffYes = new javax.swing.JRadioButton();
        RbUberAffNo = new javax.swing.JRadioButton();
        LbCity = new javax.swing.JLabel();
        txtcity = new javax.swing.JTextField();
        Lbexpmancert = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        btnsave = new javax.swing.JButton();
        Lbmfyr = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);
        setForeground(new java.awt.Color(0, 51, 204));

        LbTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbTitle.setForeground(new java.awt.Color(0, 102, 204));
        LbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbTitle.setText("Create");

        LbAvail.setBackground(java.awt.Color.white);
        LbAvail.setForeground(new java.awt.Color(0, 51, 204));
        LbAvail.setText("Availability:");

        RBavailyes.setBackground(java.awt.Color.white);
        btnGroupAvail.add(RBavailyes);
        RBavailyes.setForeground(new java.awt.Color(0, 51, 204));
        RBavailyes.setText("Yes");
        RBavailyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBavailyesActionPerformed(evt);
            }
        });

        RBavailNo.setBackground(java.awt.Color.white);
        btnGroupAvail.add(RBavailNo);
        RBavailNo.setForeground(new java.awt.Color(0, 51, 204));
        RBavailNo.setText("No");
        RBavailNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBavailNoActionPerformed(evt);
            }
        });

        LbManfName.setBackground(java.awt.Color.white);
        LbManfName.setForeground(new java.awt.Color(0, 51, 204));
        LbManfName.setText("Manufacturer:");

        LbManfYear.setBackground(java.awt.Color.white);
        LbManfYear.setForeground(new java.awt.Color(0, 51, 204));
        LbManfYear.setText("Manufacturing Year:");

        txtmanfyear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmanfyearKeyReleased(evt);
            }
        });

        Lbseats.setBackground(java.awt.Color.white);
        Lbseats.setForeground(new java.awt.Color(0, 51, 204));
        Lbseats.setText("No. of Seats:");

        LbSerialNo.setBackground(java.awt.Color.white);
        LbSerialNo.setForeground(new java.awt.Color(0, 51, 204));
        LbSerialNo.setText("Serial Number:");

        LbModelNo.setBackground(java.awt.Color.white);
        LbModelNo.setForeground(new java.awt.Color(0, 51, 204));
        LbModelNo.setText("Model Number:");

        LbUberAff.setBackground(java.awt.Color.white);
        LbUberAff.setForeground(new java.awt.Color(0, 51, 204));
        LbUberAff.setText("Uber Affiliation:");

        RbUberAffYes.setBackground(java.awt.Color.white);
        btnGroupUber.add(RbUberAffYes);
        RbUberAffYes.setForeground(new java.awt.Color(0, 51, 204));
        RbUberAffYes.setText("Yes");
        RbUberAffYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbUberAffYesActionPerformed(evt);
            }
        });

        RbUberAffNo.setBackground(java.awt.Color.white);
        btnGroupUber.add(RbUberAffNo);
        RbUberAffNo.setForeground(new java.awt.Color(0, 51, 204));
        RbUberAffNo.setText("No");
        RbUberAffNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbUberAffNoActionPerformed(evt);
            }
        });

        LbCity.setBackground(java.awt.Color.white);
        LbCity.setForeground(new java.awt.Color(0, 51, 204));
        LbCity.setText("City:");

        Lbexpmancert.setBackground(java.awt.Color.white);
        Lbexpmancert.setForeground(new java.awt.Color(0, 51, 204));
        Lbexpmancert.setText("Expired Maintenance Certificate Date:");

        btnsave.setBackground(java.awt.Color.pink);
        btnsave.setForeground(new java.awt.Color(0, 51, 204));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
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
                            .addComponent(btnsave, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbSerialNo)
                                    .addComponent(LbModelNo)
                                    .addComponent(LbUberAff)
                                    .addComponent(LbCity))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RbUberAffYes)
                                        .addGap(51, 51, 51)
                                        .addComponent(RbUberAffNo)))))
                        .addGap(18, 18, 18)
                        .addComponent(Lbmfyr, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Lbexpmancert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtModelNo, txtSerialNo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbAvail)
                    .addComponent(RBavailyes)
                    .addComponent(RBavailNo))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbManfName)
                    .addComponent(txtmanfname, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmanfyear, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbManfYear)
                    .addComponent(Lbmfyr))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbseats)
                    .addComponent(txtseats, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbSerialNo)
                    .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbModelNo)
                    .addComponent(txtModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbUberAff)
                    .addComponent(RbUberAffYes)
                    .addComponent(RbUberAffNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbCity)
                    .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Lbexpmancert)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(btnsave)
                .addGap(26, 26, 26))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtModelNo, txtSerialNo, txtmanfname, txtmanfyear, txtseats});

    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        String compname = txtmanfname.getText();
        String serialno = txtSerialNo.getText();
        String modelno = txtModelNo.getText();
        String city = txtcity.getText();
        SimpleDateFormat SDF = new SimpleDateFormat("MM-dd-yyyy",Locale.getDefault());
        String expcert= SDF.format(jDateChooser2.getDate());
         int manfyear = Integer.parseInt(txtmanfyear.getText());
         int seats = Integer.parseInt(txtseats.getText());
         boolean availveh1 = availveh;
         boolean uberaffil1 = uberaffil;
         
         Vehicle vh = history.addNewVehicles();
         vh.setCity(city);
         vh.setAvail(availveh);
         vh.setCompname(compname);
         vh.setExpcert(expcert);
         vh.setManfyear(manfyear);
         vh.setModelno(modelno);
         vh.setSeats(seats);
         vh.setSerialno(serialno);
         vh.setUberaff(uberaffil);
         vh.setUpdatedt(expcert);
         
         JOptionPane.showMessageDialog(this, "New Vehicle Added");
         txtmanfname.setText("");
         txtSerialNo.setText("");
         txtModelNo.setText("");
         txtcity.setText("");
         txtmanfyear.setText("");
         txtseats.setText("");
         btnGroupAvail.clearSelection();
         btnGroupUber.clearSelection();
         jDateChooser2.setDate(null);
         
         
         
         
         
         
         
         
         
    }//GEN-LAST:event_btnsaveActionPerformed

    private void RBavailyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBavailyesActionPerformed
        // TODO add your handling code here:
        availveh = true;
    }//GEN-LAST:event_RBavailyesActionPerformed

    private void RBavailNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBavailNoActionPerformed
        // TODO add your handling code here:
        availveh = false;
    }//GEN-LAST:event_RBavailNoActionPerformed

    private void RbUberAffYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbUberAffYesActionPerformed
        // TODO add your handling code here:
        uberaffil = true;
    }//GEN-LAST:event_RbUberAffYesActionPerformed

    private void RbUberAffNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbUberAffNoActionPerformed
        // TODO add your handling code here:
        uberaffil = false;
    }//GEN-LAST:event_RbUberAffNoActionPerformed

    private void txtmanfyearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmanfyearKeyReleased
        // TODO add your handling code here:
        String PATTERN;
        PATTERN = "^[0-2][0][0-2][0-9]{0,4}$";
        Pattern patt;
        patt = Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtmanfyear.getText());
        if(!match.matches()){
            Lbmfyr.setText("Invalid Year");
            
        }
        else{ 
       Lbmfyr.setText(null);
        }
    }//GEN-LAST:event_txtmanfyearKeyReleased


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
    private javax.swing.JLabel Lbmfyr;
    private javax.swing.JLabel Lbseats;
    private javax.swing.JRadioButton RBavailNo;
    private javax.swing.JRadioButton RBavailyes;
    private javax.swing.JRadioButton RbUberAffNo;
    private javax.swing.JRadioButton RbUberAffYes;
    private javax.swing.ButtonGroup btnGroupAvail;
    private javax.swing.ButtonGroup btnGroupUber;
    private javax.swing.JButton btnsave;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JTextField txtModelNo;
    private javax.swing.JTextField txtSerialNo;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtmanfname;
    private javax.swing.JTextField txtmanfyear;
    private javax.swing.JTextField txtseats;
    // End of variables declaration//GEN-END:variables
}