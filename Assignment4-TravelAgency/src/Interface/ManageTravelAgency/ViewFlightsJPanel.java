/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface.ManageTravelAgency;
import Business.Airliner;
import Business.Flight;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sachin
 */
public class ViewFlightsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewFlightsJPanel
     */
    private JPanel userProcessContainer;
    private TravelAgency travelAgency;

    ViewFlightsJPanel(JPanel userProcessContainer, TravelAgency travelAgency) {
        initComponents();
        this.travelAgency = travelAgency;
        this.userProcessContainer = userProcessContainer;
        populateTable();
        dateTxtField.setEnabled(false);
        airlinerTxtField.setEnabled(false);

    }

    public void populateTable() {
        int rowCount = masterFlightJTable.getRowCount();

        DefaultTableModel dtm = (DefaultTableModel) masterFlightJTable.getModel();

        // dtm.setRowCount(0);
        for (int i = rowCount - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }

        for (Airliner a : travelAgency.getMasterSchedule()) {

            Object[] row = new Object[6];

            for (Flight f : a.getFlightSchedule()) {

                row[0] = a.getName();
                row[1] = f;
                row[2] = f.getFromLocation();
                row[3] = f.getToLocation();
                row[4] = f.getDate();
                row[5] = f.getTime();

                dtm.addRow(row);
            }

        }
    }

    public void populateTable(ArrayList<Flight> flightList) {
        int rowCount = masterFlightJTable.getRowCount();

        DefaultTableModel dtm = (DefaultTableModel) masterFlightJTable.getModel();

        // dtm.setRowCount(0);
        for (int i = rowCount - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }

        for (Flight f : flightList) {
            Object[] row = new Object[6];

            row[0] = f.getAirlinerName();
            row[1] = f;
            row[2] = f.getFromLocation();
            row[3] = f.getToLocation();
            row[4] = f.getDate();
            row[5] = f.getTime();

            dtm.addRow(row);
        }

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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        masterFlightJTable = new javax.swing.JTable();
        fromTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        toTxtField = new javax.swing.JTextField();
        searchJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        airlinerJCheckBox = new javax.swing.JCheckBox();
        dateJCheckBox = new javax.swing.JCheckBox();
        viewDetailsJBtn = new javax.swing.JButton();
        dateTxtField = new javax.swing.JTextField();
        airlinerTxtField = new javax.swing.JTextField();

        jLabel1.setText("View Flights");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        masterFlightJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airlines Name", "Flight Name", "From", "To", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(masterFlightJTable);

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

        airlinerJCheckBox.setText("Airliner");
        airlinerJCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerJCheckBoxActionPerformed(evt);
            }
        });

        dateJCheckBox.setText("Date");
        dateJCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateJCheckBoxActionPerformed(evt);
            }
        });

        viewDetailsJBtn.setText("View Details");
        viewDetailsJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsJBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(fromTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addGap(27, 27, 27)
                                        .addComponent(toTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(120, 120, 120)
                                        .addComponent(searchJButton))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(airlinerJCheckBox)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(airlinerTxtField))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(dateJCheckBox)
                                            .addGap(31, 31, 31)
                                            .addComponent(dateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(291, 291, 291)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(viewDetailsJBtn)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewDetailsJBtn)
                .addGap(57, 57, 57)
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
                .addContainerGap(287, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 836, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 769, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fromTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromTxtFieldActionPerformed

    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed
        // TODO add your handling code here:
        if (fromTxtField.getText().equals("") || toTxtField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter city name to search for flights", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        ArrayList<Flight> flights = null;
        String from = fromTxtField.getText();
        String to = toTxtField.getText();

        if (airlinerJCheckBox.isSelected() && dateJCheckBox.isSelected()) {
            if (airlinerTxtField.getText().equals("") || dateTxtField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter Airliner name and Date to search", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String airline = airlinerTxtField.getText();
            String date = dateTxtField.getText();
            flights = travelAgency.searchFlightMaster(from, to, airline, date);

        } else if (airlinerJCheckBox.isSelected()) {
            if (airlinerTxtField.getText().equals("") ) {
                JOptionPane.showMessageDialog(null, "Please enter Airliner name to search", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String airline = airlinerTxtField.getText();
            flights = travelAgency.searchFlightAirline(from, to, airline);

        } else if (dateJCheckBox.isSelected()) {
            if (dateTxtField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter Date in dd/mm/yyyy format to search", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String date = dateTxtField.getText();
            flights = travelAgency.searchFlightDate(from, to, date);
        } else {
            flights = travelAgency.searchFlight(from, to);
        }

        populateTable(flights);
    }//GEN-LAST:event_searchJButtonActionPerformed

    private void airlinerJCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerJCheckBoxActionPerformed
        // TODO add your handling code here:
        if (airlinerJCheckBox.isSelected()) {
            airlinerTxtField.setEnabled(true);
        } else {
            airlinerTxtField.setEnabled(false);
        }
    }//GEN-LAST:event_airlinerJCheckBoxActionPerformed

    private void dateJCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateJCheckBoxActionPerformed
        // TODO add your handling code here:
        if (dateJCheckBox.isSelected()) {
            dateTxtField.setEnabled(true);

        } else {
            dateTxtField.setEnabled(false);
        }

    }//GEN-LAST:event_dateJCheckBoxActionPerformed

    private void viewDetailsJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsJBtnActionPerformed
        // TODO add your handling code here:

        int selectedRow = masterFlightJTable.getSelectedRow();

        if (selectedRow >= 0) {

            String airliner = (String) masterFlightJTable.getValueAt(selectedRow, 0);

            Flight flight = (Flight) masterFlightJTable.getValueAt(selectedRow, 1);

            ViewFlightDetailJPanel viewDetails = new ViewFlightDetailJPanel(userProcessContainer, airliner, flight);

            userProcessContainer.add("ViewFlightDetailJPanel", viewDetails);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to view.");
        }

    }//GEN-LAST:event_viewDetailsJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox airlinerJCheckBox;
    private javax.swing.JTextField airlinerTxtField;
    private javax.swing.JCheckBox dateJCheckBox;
    private javax.swing.JTextField dateTxtField;
    private javax.swing.JTextField fromTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable masterFlightJTable;
    private javax.swing.JButton searchJButton;
    private javax.swing.JTextField toTxtField;
    private javax.swing.JButton viewDetailsJBtn;
    // End of variables declaration//GEN-END:variables
}
