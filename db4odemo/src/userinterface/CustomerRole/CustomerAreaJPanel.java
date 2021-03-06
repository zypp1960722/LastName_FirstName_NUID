/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import userinterface.SystemAdminWorkArea.*;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Role.CustomerRole;
import Business.Role.Role;
import Business.Role.Role.RoleType;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 张睿哲
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {
  
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount account;
    /**
     * Creates new form CustomerManagementScreen
     */
    public CustomerAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount account) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.account=account;
        this.populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewOrders = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabRestaurants = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnViewMenu = new javax.swing.JButton();

        btnViewOrders.setText("View orders");
        btnViewOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrdersActionPerformed(evt);
            }
        });

        tabRestaurants.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Restaurant Info"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabRestaurants);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setText("Select a Restaurant");

        btnViewMenu.setText("View menu");
        btnViewMenu.setToolTipText("");
        btnViewMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnViewMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewMenu)
                    .addComponent(btnViewOrders))
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void populate()
    {
        DefaultTableModel dtm = (DefaultTableModel) tabRestaurants.getModel();
        dtm.setRowCount(0);
        for (Restaurant i : this.ecosystem.getRestaurantDirectory().getRestaurantList()) {
            
                Object row[] = new Object[2];
                row[0] = i;
                row[1] = i.getRestaurantInfo();
                dtm.addRow(row);
        }
    }
    
    private void btnViewOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrdersActionPerformed
        // TODO add your handling code here:
        int selectedRow = tabRestaurants.getSelectedRow();
        
        if (selectedRow >= 0) {
            Restaurant res=(Restaurant)tabRestaurants.getValueAt(selectedRow, 0);
            ViewOrders view=new ViewOrders(this.userProcessContainer,this.ecosystem,res.getRestaurantName(),this.account.getUsername());
            this.userProcessContainer.add("ViewOrders",view);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.show(this.userProcessContainer, "ViewOrders");
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
        
        
    }//GEN-LAST:event_btnViewOrdersActionPerformed

    private void btnViewMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMenuActionPerformed
        int selectedRow = tabRestaurants.getSelectedRow();
        
        if (selectedRow >= 0) {
            Restaurant res=(Restaurant)tabRestaurants.getValueAt(selectedRow, 0);
            ViewMenus view=new ViewMenus(this.userProcessContainer,this.ecosystem,this.account.getUsername(),res.getRestaurantName());
            this.userProcessContainer.add("ViewMenus",view);
            CardLayout layout=(CardLayout)this.userProcessContainer.getLayout();
            layout.show(this.userProcessContainer, "ViewMenus");
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }//GEN-LAST:event_btnViewMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewMenu;
    private javax.swing.JButton btnViewOrders;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabRestaurants;
    // End of variables declaration//GEN-END:variables
}
