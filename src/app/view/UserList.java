/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view;

/**
 *
 * @author Tom
 */
public class UserList extends javax.swing.JPanel {

	/**
	 * Creates new form UserList
	 */
	public UserList() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jComboBoxSearchCategory = new javax.swing.JComboBox();
    jLabelSearchCategory = new javax.swing.JLabel();
    JLabelTitleBookList = new javax.swing.JLabel();
    jTextFieldSearchUserName = new javax.swing.JTextField();
    jLabelTitleSearchUserName = new javax.swing.JLabel();
    jTextFieldSearchFirstName = new javax.swing.JTextField();
    jLabelSearchFirstName = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTableBookList = new javax.swing.JTable();
    jButtonUserSearch = new javax.swing.JButton();

    jComboBoxSearchCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jLabelSearchCategory.setText("jLabelSearchService");

    JLabelTitleBookList.setText("Liste des utilisateurs");
    JLabelTitleBookList.setName("labTitle"); // NOI18N

    jTextFieldSearchUserName.setText("jTextFieldSearchUserName");
    jTextFieldSearchUserName.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldSearchUserNameActionPerformed(evt);
      }
    });

    jLabelTitleSearchUserName.setText("jLabelSearchUserName");
    jLabelTitleSearchUserName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    jLabelTitleSearchUserName.setName("TESTNAME"); // NOI18N

    jTextFieldSearchFirstName.setText("jTextFieldSearchFirstName");
    jTextFieldSearchFirstName.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldSearchFirstNameActionPerformed(evt);
      }
    });

    jLabelSearchFirstName.setText("jLabelSearchAuthor");

    jTableBookList.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    jScrollPane1.setViewportView(jTableBookList);

    jButtonUserSearch.setText("jButtonSearch");
    jButtonUserSearch.setActionCommand("jButtonSearchUser");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane1)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(52, 52, 52)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jTextFieldSearchFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelSearchFirstName))
            .addGap(64, 64, 64)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabelTitleSearchUserName)
              .addComponent(jTextFieldSearchUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(32, 32, 32)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jComboBoxSearchCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonUserSearch))
              .addComponent(jLabelSearchCategory)))
          .addGroup(layout.createSequentialGroup()
            .addGap(289, 289, 289)
            .addComponent(JLabelTitleBookList)))
        .addGap(0, 31, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(JLabelTitleBookList)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jLabelTitleSearchUserName)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jTextFieldSearchUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jLabelSearchCategory)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jComboBoxSearchCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jButtonUserSearch)))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jLabelSearchFirstName)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jTextFieldSearchFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(37, 37, 37)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void jTextFieldSearchUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchUserNameActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextFieldSearchUserNameActionPerformed

  private void jTextFieldSearchFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchFirstNameActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextFieldSearchFirstNameActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel JLabelTitleBookList;
  private javax.swing.JButton jButtonUserSearch;
  private javax.swing.JComboBox jComboBoxSearchCategory;
  private javax.swing.JLabel jLabelSearchCategory;
  private javax.swing.JLabel jLabelSearchFirstName;
  private javax.swing.JLabel jLabelTitleSearchUserName;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTableBookList;
  private javax.swing.JTextField jTextFieldSearchFirstName;
  private javax.swing.JTextField jTextFieldSearchUserName;
  // End of variables declaration//GEN-END:variables
}
