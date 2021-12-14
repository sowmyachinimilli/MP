/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import userinterface.DonorRole.DonorProfilePanel;

/**
 *
 * @author sowmyachinimilli
 */
public class ManageWarehousePanel extends javax.swing.JPanel {

    /**
     * Creates new form AddWarehousePanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public ManageWarehousePanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        this.userProcessContainer = userProcessContainer;
        setBG();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPaneWH = new javax.swing.JSplitPane();
        SysAdminControlPanel = new javax.swing.JPanel();
        btnAddWH = new javax.swing.JButton();
        btnViewWH = new javax.swing.JButton();
        SysAdminWorkareaPanel = new javax.swing.JPanel();
        LabelImg = new javax.swing.JLabel();

        SysAdminControlPanel.setBackground(new java.awt.Color(255, 255, 255));
        SysAdminControlPanel.setPreferredSize(new java.awt.Dimension(150, 600));

        btnAddWH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAddWH.setText("Add Warehouse");
        btnAddWH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddWHActionPerformed(evt);
            }
        });

        btnViewWH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnViewWH.setText("View/Modify");
        btnViewWH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewWHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SysAdminControlPanelLayout = new javax.swing.GroupLayout(SysAdminControlPanel);
        SysAdminControlPanel.setLayout(SysAdminControlPanelLayout);
        SysAdminControlPanelLayout.setHorizontalGroup(
            SysAdminControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SysAdminControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SysAdminControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddWH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewWH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SysAdminControlPanelLayout.setVerticalGroup(
            SysAdminControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SysAdminControlPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnAddWH)
                .addGap(26, 26, 26)
                .addComponent(btnViewWH)
                .addContainerGap(449, Short.MAX_VALUE))
        );

        SplitPaneWH.setLeftComponent(SysAdminControlPanel);

        SysAdminWorkareaPanel.setPreferredSize(new java.awt.Dimension(840, 600));

        javax.swing.GroupLayout SysAdminWorkareaPanelLayout = new javax.swing.GroupLayout(SysAdminWorkareaPanel);
        SysAdminWorkareaPanel.setLayout(SysAdminWorkareaPanelLayout);
        SysAdminWorkareaPanelLayout.setHorizontalGroup(
            SysAdminWorkareaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
        );
        SysAdminWorkareaPanelLayout.setVerticalGroup(
            SysAdminWorkareaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelImg, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );

        SplitPaneWH.setRightComponent(SysAdminWorkareaPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneWH, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneWH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setBG() {
        try {
            LabelImg.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/blurbg.jpeg"));

            Image newimg = img.getScaledInstance(1500, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
            LabelImg.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(DonorProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnAddWHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddWHActionPerformed
        // TODO add your handling code here:
        AddWarehousePanel objAddWH = new AddWarehousePanel(userProcessContainer,ecosystem);
        SplitPaneWH.setRightComponent(objAddWH);
    }//GEN-LAST:event_btnAddWHActionPerformed

    private void btnViewWHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewWHActionPerformed
        // TODO add your handling code here:
        ViewModifyWarehousePanel objViewModWH = new ViewModifyWarehousePanel(userProcessContainer,ecosystem);
        SplitPaneWH.setRightComponent(objViewModWH);
    }//GEN-LAST:event_btnViewWHActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImg;
    private javax.swing.JSplitPane SplitPaneWH;
    private javax.swing.JPanel SysAdminControlPanel;
    private javax.swing.JPanel SysAdminWorkareaPanel;
    private javax.swing.JButton btnAddWH;
    private javax.swing.JButton btnViewWH;
    // End of variables declaration//GEN-END:variables
}
