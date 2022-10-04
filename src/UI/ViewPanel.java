/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Info;
import model.ProfileList;

/**
 *
 * @author ZeyuLiao
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel
     */
    ProfileList pList;

    public ViewPanel(ProfileList pList) {
        this.pList = pList;
            
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneView = new javax.swing.JScrollPane();
        jPanelView = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelSDate = new javax.swing.JLabel();
        jLabelLevel = new javax.swing.JLabel();
        jLabelTeamInfo = new javax.swing.JLabel();
        jLabelPosition = new javax.swing.JLabel();
        jLabelTel = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelImageIcon = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jButtonViewProfile = new javax.swing.JButton();
        jButtonDeleteProfile = new javax.swing.JButton();
        jButtonSearchProfile = new javax.swing.JButton();
        jScrollPaneViewAll = new javax.swing.JScrollPane();
        jTableViewAll = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jScrollPaneView.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabelName.setText("Name");

        jLabelID.setText("Employee ID");

        jLabelAge.setText("Age");

        jLabelGender.setText("Gender");

        jLabelSDate.setText("Start Date");

        jLabelLevel.setText("Level");

        jLabelTeamInfo.setText("Team Info");

        jLabelPosition.setText("Position Title");

        jLabelTel.setText("Cell Phone Number");

        jLabelEmail.setText("Email");

        jLabelImageIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImageIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabelTitle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("ViewProfile");

        jButtonViewProfile.setText("View Details");
        jButtonViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewProfileActionPerformed(evt);
            }
        });

        jButtonDeleteProfile.setText("Delete Memeber");
        jButtonDeleteProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteProfileActionPerformed(evt);
            }
        });

        jButtonSearchProfile.setText("Search");

        jTableViewAll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "ID", "Team", "Position", "Title"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneViewAll.setViewportView(jTableViewAll);

        jButton1.setText("Edit Profile");

        javax.swing.GroupLayout jPanelViewLayout = new javax.swing.GroupLayout(jPanelView);
        jPanelView.setLayout(jPanelViewLayout);
        jPanelViewLayout.setHorizontalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonViewProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeleteProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSearchProfile)
                .addGap(13, 13, 13))
            .addGroup(jPanelViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneViewAll, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelViewLayout.createSequentialGroup()
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelViewLayout.createSequentialGroup()
                                    .addComponent(jLabelImageIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelSDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelPosition, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                        .addComponent(jLabelLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jLabelTeamInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelViewLayout.setVerticalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneViewAll, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonViewProfile)
                    .addComponent(jButtonDeleteProfile)
                    .addComponent(jButtonSearchProfile)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImageIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelViewLayout.createSequentialGroup()
                        .addComponent(jLabelName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelGender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPosition)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelLevel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTeamInfo)
                .addGap(18, 18, 18)
                .addComponent(jLabelTel)
                .addGap(18, 18, 18)
                .addComponent(jLabelEmail)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jScrollPaneView.setViewportView(jPanelView);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPaneView, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPaneView, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeleteProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteProfileActionPerformed
        // TODO add your handling code here:
        int selectRowIndex = jTableViewAll.getSelectedRow();
        if(selectRowIndex <0){
            JOptionPane.showMessageDialog(this,"Please select a row to delete");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTableViewAll.getModel();
        Info selectInfo = (Info) model.getValueAt(selectRowIndex ,0 );
        pList.deleteProfiles(selectInfo);
        JOptionPane.showMessageDialog(this,"Profile deleted");
        
        populateTable();
       
    }//GEN-LAST:event_jButtonDeleteProfileActionPerformed

    private void jButtonViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewProfileActionPerformed
        // TODO add your handling code here:
        int selectRowIndex = jTableViewAll.getSelectedRow();
        if(selectRowIndex <0){
            JOptionPane.showMessageDialog(this,"Please select a row to delete");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTableViewAll.getModel();
        Info selectInfo = (Info) model.getValueAt(selectRowIndex ,0 );
        
        jLabelName.setText("Name: " +String.valueOf( selectInfo.getName()));
        jLabelID.setText("ID: "+ String.valueOf(selectInfo.getId()));
        jLabelAge.setText("Age: "+ String.valueOf(selectInfo.getAge()));
        jLabelGender.setText("Gender: "+ String.valueOf(selectInfo.getGender()));
        jLabelSDate.setText("Start Date: "+ String.valueOf(selectInfo.getStart_date()));
        jLabelLevel.setText("Level: "+ String.valueOf(selectInfo.getLevel()));
        jLabelPosition.setText("Position Title: "+ String.valueOf(selectInfo.getPosition_title()));
        jLabelTeamInfo.setText("Team: "+ String.valueOf(selectInfo.getTeam_info()));
        jLabelTel.setText("Phone Number: "+ String.valueOf(selectInfo.getTel()));
        jLabelEmail.setText("Email: "+ String.valueOf(selectInfo.getEmail()) + "@northeastern.edu");
        jLabelImageIcon.setIcon(selectInfo.getPhoto());
        
        
        
        
    }//GEN-LAST:event_jButtonViewProfileActionPerformed

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) jTableViewAll.getModel();
        model.setRowCount(0);
        
        for (Info info : pList.getHistory()){
            Object[] row = new Object[5];
            System.out.println(info.getName());
           
            row[0] = info;
            row[1] = info.getId();
            row[2] = info.getTeam_info();
            row[3] = info.getPosition_title();
            row[4] = info.getLevel();
            
            model.addRow(row);           
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDeleteProfile;
    private javax.swing.JButton jButtonSearchProfile;
    private javax.swing.JButton jButtonViewProfile;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelImageIcon;
    private javax.swing.JLabel jLabelLevel;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPosition;
    private javax.swing.JLabel jLabelSDate;
    private javax.swing.JLabel jLabelTeamInfo;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelView;
    private javax.swing.JScrollPane jScrollPaneView;
    private javax.swing.JScrollPane jScrollPaneViewAll;
    private javax.swing.JTable jTableViewAll;
    // End of variables declaration//GEN-END:variables
}
