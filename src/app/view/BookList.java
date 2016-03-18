package app.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tom
 */
public class BookList extends javax.swing.JPanel {

	/**
	 * Creates new form BookList
	 */
	public BookList() {
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

    jLabelSearchCategory = new javax.swing.JLabel();
    panel1 = new java.awt.Panel();
    JLabelTitleBookList = new javax.swing.JLabel();
    jTextFieldSearchTitle = new javax.swing.JTextField();
    jLabelTitleSearch = new javax.swing.JLabel();
    jTextFieldSearchAuthor = new javax.swing.JTextField();
    jLabelSearchAutor = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTableBookList = new javax.swing.JTable();
    jComboBoxSearchCategory = new javax.swing.JComboBox();
    jButtonSearch = new javax.swing.JButton();

    jLabelSearchCategory.setText("jLabelSearchCategory");

    javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
    panel1.setLayout(panel1Layout);
    panel1Layout.setHorizontalGroup(
      panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 297, Short.MAX_VALUE)
    );
    panel1Layout.setVerticalGroup(
      panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );

    JLabelTitleBookList.setText("Liste des livres");
    JLabelTitleBookList.setName("labTitle"); // NOI18N

    jTextFieldSearchTitle.setText("jTextFieldSearchTitle");
    jTextFieldSearchTitle.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldSearchTitleActionPerformed(evt);
      }
    });

    jLabelTitleSearch.setText("jLabelSearchTitle");
    jLabelTitleSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    jLabelTitleSearch.setName("TESTNAME"); // NOI18N

    jTextFieldSearchAuthor.setText("jTextFieldSearchAuthor");
    jTextFieldSearchAuthor.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldSearchAuthorActionPerformed(evt);
      }
    });

    jLabelSearchAutor.setText("jLabelSearchAuthor");

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

    jComboBoxSearchCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jButtonSearch.setText("jButtonSearch");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGroup(layout.createSequentialGroup()
        .addGap(46, 46, 46)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabelTitleSearch)
          .addComponent(jTextFieldSearchTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(63, 63, 63)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(JLabelTitleBookList)
            .addGap(292, 292, 292))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jTextFieldSearchAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelSearchAutor))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelSearchCategory)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jComboBoxSearchCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSearch)
                .addGap(25, 25, 25))))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(JLabelTitleBookList)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelTitleSearch)
          .addComponent(jLabelSearchAutor)
          .addComponent(jLabelSearchCategory))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jTextFieldSearchTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jTextFieldSearchAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jComboBoxSearchCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButtonSearch))
        .addGap(39, 39, 39)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
          .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void jTextFieldSearchTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchTitleActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextFieldSearchTitleActionPerformed

  private void jTextFieldSearchAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchAuthorActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextFieldSearchAuthorActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel JLabelTitleBookList;
  private javax.swing.JButton jButtonSearch;
  private javax.swing.JComboBox jComboBoxSearchCategory;
  private javax.swing.JLabel jLabelSearchAutor;
  private javax.swing.JLabel jLabelSearchCategory;
  private javax.swing.JLabel jLabelTitleSearch;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTableBookList;
  private javax.swing.JTextField jTextFieldSearchAuthor;
  private javax.swing.JTextField jTextFieldSearchTitle;
  private java.awt.Panel panel1;
  // End of variables declaration//GEN-END:variables
}