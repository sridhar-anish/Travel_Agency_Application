/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface.ManageCustomer;

import Business.Customer;
import Business.Flight;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author anish
 */
    
public class BookFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookFlightJPanel
     */
    private JPanel userProcessContainer;
    private Customer cust;
    private TravelAgency travelAgency ;
    BookFlightJPanel(JPanel userProcessContainer, Customer cust, TravelAgency travelAgency ) {
                initComponents();
                this.userProcessContainer=userProcessContainer;
                this.cust=cust;
                this.travelAgency=travelAgency;
                dateTxtField.setEnabled(false);
                airlinerTxtField.setEnabled(false);
             
                
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
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        fromTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        toTxtField = new javax.swing.JTextField();
        searchJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dateJCheckBox = new javax.swing.JCheckBox();
        airlinerJCheckBox = new javax.swing.JCheckBox();
        dateTxtField = new javax.swing.JTextField();
        airlinerTxtField = new javax.swing.JTextField();

        jLabel1.setText("Book Flight");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        fromTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromTxtFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("To");

        searchJButton.setText("Search");
        searchJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Filter By: ");

        dateJCheckBox.setText("Date");
        dateJCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateJCheckBoxActionPerformed(evt);
            }
        });

        airlinerJCheckBox.setText("Airliner");
        airlinerJCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerJCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fromTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(toTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(searchJButton))
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(airlinerJCheckBox)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(airlinerTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(dateJCheckBox)
                                    .addGap(46, 46, 46)
                                    .addComponent(dateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)
                        .addGap(295, 295, 295)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(jLabel1))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(toTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchJButton))
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateJCheckBox)
                    .addComponent(dateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airlinerJCheckBox)
                    .addComponent(airlinerTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(480, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backButtonActionPerformed

    private void fromTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromTxtFieldActionPerformed

    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed
        // TODO add your handling code here:

        if (fromTxtField.getText().equals("") || toTxtField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter city name to search for flights", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ArrayList<Flight> flights= null;
        String from= fromTxtField.getText();
        String to=toTxtField.getText();

        if(airlinerJCheckBox.isSelected() && dateJCheckBox.isSelected()){
            if (airlinerTxtField.getText().equals("") || dateTxtField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter Airliner name and Date to search", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String airline= airlinerTxtField.getText();
            String date= dateTxtField.getText();
            flights= travelAgency.searchFlightMaster(from, to, airline, date);

        }
        else if(airlinerJCheckBox.isSelected()){
            if (airlinerTxtField.getText().equals("") ) {
                JOptionPane.showMessageDialog(null, "Please enter Airliner name to search", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String airline= airlinerTxtField.getText();
            flights= travelAgency.searchFlightAirline(from, to, airline);

        }

        else if(dateJCheckBox.isSelected()){
            if (dateTxtField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter Date in dd/mm/yyyy format to search", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String date= dateTxtField.getText();
            flights= travelAgency.searchFlightDate(from, to, date);
        }

        else{

            flights= travelAgency.searchFlight(from, to);
        }

        FlightAvailJPanel panel= new FlightAvailJPanel(userProcessContainer, flights,travelAgency,cust);
        userProcessContainer.add("FlightAvailJPanel", panel);
        CardLayout layout= (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_searchJButtonActionPerformed

    private void dateJCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateJCheckBoxActionPerformed
        // TODO add your handling code here:

        if(dateJCheckBox.isSelected()){dateTxtField.setEnabled(true);

        }

        else{
            dateTxtField.setEnabled(false);
        }
    }//GEN-LAST:event_dateJCheckBoxActionPerformed

    private void airlinerJCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerJCheckBoxActionPerformed
        // TODO add your handling code here:
        if(airlinerJCheckBox.isSelected())airlinerTxtField.setEnabled(true);
        else{
            airlinerTxtField.setEnabled(false);
        }
    }//GEN-LAST:event_airlinerJCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox airlinerJCheckBox;
    private javax.swing.JTextField airlinerTxtField;
    private javax.swing.JButton backButton;
    private javax.swing.JCheckBox dateJCheckBox;
    private javax.swing.JTextField dateTxtField;
    private javax.swing.JTextField fromTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton searchJButton;
    private javax.swing.JTextField toTxtField;
    // End of variables declaration//GEN-END:variables
}
