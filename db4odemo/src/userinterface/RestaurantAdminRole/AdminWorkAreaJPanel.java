package userinterface.RestaurantAdminRole;


import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.ManageRestaurantAdmin;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    Restaurant res;
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer,UserAccount account,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem =  ecosystem;
        this.res = this.ecosystem.getRestaurantDirectory().searchRestaurantByAdmin(account.getUsername());
        if(this.res!=null)
            this.valueLabel.setText(this.res.getRestaurantName());
        else
            JOptionPane.showMessageDialog(null, "System error occurred! Please log out!");
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnManageRestInfo = new javax.swing.JButton();
        btnManageMenu = new javax.swing.JButton();
        btnManageOrders = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        btnManageRestInfo.setText("Manage Restaurant Info");
        btnManageRestInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRestInfoActionPerformed(evt);
            }
        });
        add(btnManageRestInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 180, -1));

        btnManageMenu.setText("Manage menu");
        btnManageMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMenuActionPerformed(evt);
            }
        });
        add(btnManageMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 180, -1));

        btnManageOrders.setText("Manage Orders");
        btnManageOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrdersActionPerformed(evt);
            }
        });
        add(btnManageOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 180, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Restaurant :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 120, 30));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageRestInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRestInfoActionPerformed
        // TODO add your handling code here:
       JPanel viewRes=new ViewRestaurantInfo(this.userProcessContainer,this.ecosystem,this.res.getRestaurantName());
       userProcessContainer.add("ViewRestaurantInfo",viewRes);
       CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
       crdLyt.show(userProcessContainer,"ViewRestaurantInfo");  
    }//GEN-LAST:event_btnManageRestInfoActionPerformed

    private void btnManageMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMenuActionPerformed
       JPanel manageMenu=new ManageMenu(this.userProcessContainer,this.ecosystem,this.res.getRestaurantName());
       userProcessContainer.add("ManageMenu",manageMenu);
       CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
       crdLyt.show(userProcessContainer,"ManageMenu");  
    }//GEN-LAST:event_btnManageMenuActionPerformed

    private void btnManageOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrdersActionPerformed
       JPanel manageOrder=new ManageOrder(this.userProcessContainer,this.ecosystem,this.res.getRestaurantName());
       userProcessContainer.add("ManageOrder",manageOrder);
       CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
       crdLyt.show(userProcessContainer,"ManageOrder");  
    }//GEN-LAST:event_btnManageOrdersActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageMenu;
    private javax.swing.JButton btnManageOrders;
    private javax.swing.JButton btnManageRestInfo;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}