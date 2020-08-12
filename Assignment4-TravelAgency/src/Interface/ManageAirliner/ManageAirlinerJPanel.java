/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface.ManageAirliner;

import Business.Airliner;
import Business.Flight;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sachin
 */
public class ManageAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlinerJPanel
     */
    private JPanel userProcessContainer;
    private Airliner airl;
     ManageAirlinerJPanel(JPanel userProcessContainer, Airliner airl) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.airl = airl;
        airlinerNameTxtField.setText(airl.getName());

        populateTable();

    }
     public void populateTable() {
        int rowCount = airlinerDetailsJTable.getRowCount();

        DefaultTableModel dtm = (DefaultTableModel) airlinerDetailsJTable.getModel();

        //  dtm.setRowCount(0);
        for (int i = rowCount - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }

        for (Flight f : airl.getFlightSchedule()) {

            Object[] row = new Object[4];
            row[0] = f;
            row[1] = f.getFromLocation();
            row[2] = f.getToLocation();

            row[3] = f.getTime();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        airlinerDetailsJTable = new javax.swing.JTable();
        airlinerNameTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        viewFlightJBtn = new javax.swing.JButton();
        deleteFlightJBtn = new javax.swing.JButton();
        addFlightJBtn = new javax.swing.JButton();

        airlinerDetailsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Name", "From", "To", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(airlinerDetailsJTable);

        airlinerNameTxtField.setEditable(false);

        jLabel1.setText("Airliner Name");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        viewFlightJBtn.setText("View Flight");
        viewFlightJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFlightJBtnActionPerformed(evt);
            }
        });

        deleteFlightJBtn.setText("Delete Flight");
        deleteFlightJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFlightJBtnActionPerformed(evt);
            }
        });

        addFlightJBtn.setText("Add Flight");
        addFlightJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlightJBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(airlinerNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(viewFlightJBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteFlightJBtn))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addFlightJBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(airlinerNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewFlightJBtn)
                    .addComponent(deleteFlightJBtn))
                .addGap(37, 37, 37)
                .addComponent(addFlightJBtn)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
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

    private void viewFlightJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFlightJBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = airlinerDetailsJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;

        }
        Flight f = (Flight) airlinerDetailsJTable.getValueAt(selectedRow, 0);

        ViewFlightJPanel panel = new ViewFlightJPanel(userProcessContainer, f, airl);
        userProcessContainer.add("ViewFlightJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_viewFlightJBtnActionPerformed

    private void deleteFlightJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFlightJBtnActionPerformed
        // TODO add your handling code here:

        int selectedRow = airlinerDetailsJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;

        }

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the selected Flight?", "Warning", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            Flight f = (Flight) airlinerDetailsJTable.getValueAt(selectedRow, 0);
            airl.getFlightSchedule().remove(f);
            JOptionPane.showMessageDialog(null, "Flight deleted successfully.", "Warning", JOptionPane.WARNING_MESSAGE);

            populateTable();
        }

    }//GEN-LAST:event_deleteFlightJBtnActionPerformed

    private void addFlightJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlightJBtnActionPerformed
        // TODO add your handling code here:

        // Flight flight= airl.addFlight();
        AddFlightJPanel panel = new AddFlightJPanel(userProcessContainer, airl);
        userProcessContainer.add("AddFlightJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addFlightJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFlightJBtn;
    private javax.swing.JTable airlinerDetailsJTable;
    private javax.swing.JTextField airlinerNameTxtField;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteFlightJBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewFlightJBtn;
    // End of variables declaration//GEN-END:variables
}