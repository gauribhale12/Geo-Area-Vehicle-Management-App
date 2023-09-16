/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Vehicle;
import Model.Vehiclehistory;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gauri
 */
public class SearchJPanel extends javax.swing.JPanel {
    Vehiclehistory tmplst;
    

    /**
     * Creates new form SearchJPanel
     */
    public SearchJPanel(Vehiclehistory tmplst) {
        initComponents();
        this.tmplst = tmplst;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblsearch = new javax.swing.JTable();
        SearchCombo = new javax.swing.JComboBox<>();
        txtsearch = new javax.swing.JTextField();
        txtser = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        Lbdisplay1 = new javax.swing.JLabel();
        Lbdisplay2 = new javax.swing.JLabel();
        lblUberCars1 = new javax.swing.JLabel();
        lblUberCars2 = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);
        setForeground(new java.awt.Color(0, 51, 204));

        tblsearch.setAutoCreateRowSorter(true);
        tblsearch.setBackground(java.awt.Color.pink);
        tblsearch.setForeground(new java.awt.Color(0, 51, 204));
        tblsearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial No", "Manufacurer", "No. of Seats", "City", "Manfucaturing Yr", "Model No", "Exp Certificate", "Availibility", "Uber Affiliation"
            }
        ));
        tblsearch.setGridColor(new java.awt.Color(0, 51, 204));
        jScrollPane1.setViewportView(tblsearch);

        SearchCombo.setBackground(java.awt.Color.pink);
        SearchCombo.setForeground(new java.awt.Color(0, 51, 204));
        SearchCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Available Car", "Current Availibilty", "List by Manufacturer", "List by Manufacturing year", "List by No. of Seats", "List by Serial No.", "List by Model No.", "Uber Affiliation", "List by City", "List by Expired Maintenance Certificate", "List by Catlog Update Date" }));
        SearchCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchComboActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtser, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lbdisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(btnsearch)))
                .addContainerGap(295, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lbdisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(lblUberCars1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(lblUberCars2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(SearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUberCars1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lblUberCars2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbdisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbdisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnsearch)
                .addContainerGap(312, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchComboActionPerformed
        // TODO add your handling code here:
        if(SearchCombo.getSelectedIndex()==0){
            Lbdisplay1.setVisible(false);
            Lbdisplay2.setVisible(false);
            txtsearch.setVisible(false);
            txtser.setVisible(false);
        }
    }//GEN-LAST:event_SearchComboActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        if(SearchCombo.getSelectedIndex()==0){
            tmplst.firstveh();
            populatetable();
            tmplst.TempClr();   
        }
        if(SearchCombo.getSelectedIndex()==1){
            Lbdisplay1.setText("Available Cars: "+String.valueOf(tmplst.availveh()));
        }
        if(SearchCombo.getSelectedIndex()==1){
            Lbdisplay2.setText("Unavailable Cars: "+String.valueOf(tmplst.unavailveh()));
        }
        if(SearchCombo.getSelectedIndex()==2){
            tmplst.manfname(txtsearch.getText());
            populatetable();
            tmplst.TempClr();
        }
        if(SearchCombo.getSelectedIndex()==3){
            tmplst.manfyear(Integer.parseInt(txtsearch.getText()));
            populatetable();
            tmplst.TempClr();
        }
        if(SearchCombo.getSelectedIndex()==4){
            tmplst.seats(Integer.parseInt(txtsearch.getText()));
            populatetable();
            tmplst.TempClr();
        }
        if(SearchCombo.getSelectedIndex()==5){
            tmplst.serialno(txtsearch.getText());
            populatetable();
            tmplst.TempClr();
        }
        if(SearchCombo.getSelectedIndex()==6){
            tmplst.modelno(txtsearch.getText());
            populatetable();
            tmplst.TempClr();
        }
        if(SearchCombo.getSelectedIndex()==8){
            tmplst.city(txtsearch.getText());
            populatetable();
            tmplst.TempClr();
        }
        if(SearchCombo.getSelectedIndex()==9){
            tmplst.expcert();
            populatetable();
            tmplst.TempClr();
        }
        if(SearchCombo.getSelectedIndex()==7){
            lblUberCars1.setText("Uber Cars : ");
            ArrayList<String> vehicles = new ArrayList<String>();
            vehicles = tmplst.UberAff();
            String a = "";
            for(int i = 0; i<vehicles.size(); i++){
                a = a + vehicles.get(i) + "  ";
            }
            lblUberCars2.setText(a);
            tmplst.TempClr();
        }
        if(SearchCombo.getSelectedIndex()==10){
            Lbdisplay1.setText("Updated Date: "+tmplst.UpDt());
        }
    }//GEN-LAST:event_btnsearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbdisplay1;
    private javax.swing.JLabel Lbdisplay2;
    private javax.swing.JComboBox<String> SearchCombo;
    private javax.swing.JButton btnsearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUberCars1;
    private javax.swing.JLabel lblUberCars2;
    private javax.swing.JTable tblsearch;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtser;
    // End of variables declaration//GEN-END:variables
private void populatetable() {
        DefaultTableModel model = (DefaultTableModel) tblsearch.getModel();
        model.setRowCount(0);
        for(Vehicle vh :tmplst.getTmplst()){
        Object row[] = new Object[9];
        row[0] = vh.getSerialno();
        row[1] = vh.getCompname();
        row[2]= vh.getSeats();
        row[3]= vh.getCity();
        row[4] = vh.getManfyear();
        row[5] = vh.getModelno();
        row[6] = vh.getExpcert();
        if(vh.isAvail()){
            row[7] = "Available";   
        }
        else{
            row[7] = "Unavailable";
            
        }
        if(vh.isUberaff()){
            row[8] = "Affiliated";
        }
        else{
            row[8] = "Unaffiliated";
        }
   
        model.addRow(row);
                
        }
    }
}