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
public class AuthorCreate extends javax.swing.JPanel {

	/**
	 * Creates new form AuthorCreate
	 */
	public AuthorCreate() {
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

    jLabelAuthorName = new javax.swing.JLabel();
    jTextFieldAuthorName = new javax.swing.JTextField();
    jLabelAuthorFirstName = new javax.swing.JLabel();
    jTextFieldAuthorFirstName = new javax.swing.JTextField();
    JLabelCreateAuthor = new javax.swing.JLabel();
    JLabelCreateAuthor1 = new javax.swing.JLabel();
    jLabelAuthorName1 = new javax.swing.JLabel();
    jTextFieldAuthorName1 = new javax.swing.JTextField();
    jLabelAuthorFirstName1 = new javax.swing.JLabel();
    jTextFieldAuthorFirstName1 = new javax.swing.JTextField();
    jButtonCreateAthor = new javax.swing.JButton();
    jButtonSearchAthor = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTableAuthor = new javax.swing.JTable();

    jLabelAuthorName.setText("jLabelAuthorName");

    jTextFieldAuthorName.setText("jTextFieldAuthorName");
    jTextFieldAuthorName.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldAuthorNameActionPerformed(evt);
      }
    });

    jLabelAuthorFirstName.setText("jLabelAuthorFirstName");

    jTextFieldAuthorFirstName.setText("jTextFieldAuthorFirstName");
    jTextFieldAuthorFirstName.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldAuthorFirstNameActionPerformed(evt);
      }
    });

    JLabelCreateAuthor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    JLabelCreateAuthor.setText("JLabelCreateAuthor");

    JLabelCreateAuthor1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    JLabelCreateAuthor1.setText("JLabelCreateAuthor");

    jLabelAuthorName1.setText("jLabelAuthorName");

    jTextFieldAuthorName1.setText("jTextFieldAuthorName");
    jTextFieldAuthorName1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldAuthorName1ActionPerformed(evt);
      }
    });

    jLabelAuthorFirstName1.setText("jLabelAuthorFirstName");

    jTextFieldAuthorFirstName1.setText("jTextFieldAuthorFirstName");
    jTextFieldAuthorFirstName1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldAuthorFirstName1ActionPerformed(evt);
      }
    });

    jButtonCreateAthor.setText("jButtonCreateAthor");
    jButtonCreateAthor.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonCreateAthorActionPerformed(evt);
      }
    });

    jButtonSearchAthor.setText("jButtonSearchAthor");
    jButtonSearchAthor.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonSearchAthorActionPerformed(evt);
      }
    });

    jTableAuthor.setModel(new javax.swing.table.DefaultTableModel(
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
    jScrollPane1.setViewportView(jTableAuthor);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(JLabelCreateAuthor)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabelAuthorName)
              .addComponent(jTextFieldAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelAuthorName1)
              .addComponent(jTextFieldAuthorName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(JLabelCreateAuthor1))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabelAuthorFirstName)
              .addComponent(jTextFieldAuthorFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelAuthorFirstName1)
              .addComponent(jTextFieldAuthorFirstName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(31, 31, 31)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jButtonSearchAthor)
              .addComponent(jButtonCreateAthor))))
        .addContainerGap(22, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelAuthorFirstName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAuthorFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jButtonCreateAthor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelAuthorFirstName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAuthorFirstName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jButtonSearchAthor))))
          .addGroup(layout.createSequentialGroup()
            .addComponent(JLabelCreateAuthor)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabelAuthorName)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jTextFieldAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(JLabelCreateAuthor1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabelAuthorName1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jTextFieldAuthorName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents

  private void jTextFieldAuthorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAuthorNameActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextFieldAuthorNameActionPerformed

  private void jTextFieldAuthorFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAuthorFirstNameActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextFieldAuthorFirstNameActionPerformed

  private void jTextFieldAuthorName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAuthorName1ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextFieldAuthorName1ActionPerformed

  private void jTextFieldAuthorFirstName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAuthorFirstName1ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextFieldAuthorFirstName1ActionPerformed

  private void jButtonCreateAthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateAthorActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jButtonCreateAthorActionPerformed

  private void jButtonSearchAthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchAthorActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jButtonSearchAthorActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel JLabelCreateAuthor;
  private javax.swing.JLabel JLabelCreateAuthor1;
  private javax.swing.JButton jButtonCreateAthor;
  private javax.swing.JButton jButtonSearchAthor;
  private javax.swing.JLabel jLabelAuthorFirstName;
  private javax.swing.JLabel jLabelAuthorFirstName1;
  private javax.swing.JLabel jLabelAuthorName;
  private javax.swing.JLabel jLabelAuthorName1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTableAuthor;
  private javax.swing.JTextField jTextFieldAuthorFirstName;
  private javax.swing.JTextField jTextFieldAuthorFirstName1;
  private javax.swing.JTextField jTextFieldAuthorName;
  private javax.swing.JTextField jTextFieldAuthorName1;
  // End of variables declaration//GEN-END:variables
}