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
public class Login extends javax.swing.JPanel {

	/**
	 * Creates new form Login
	 */
	public Login() {
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

    jLabelLogin = new javax.swing.JLabel();
    jTextFieldLogin = new javax.swing.JTextField();
    jLabelPass = new javax.swing.JLabel();
    jTextFieldPass = new javax.swing.JTextField();
    jButtonValidate = new javax.swing.JButton();
    jButtonCancel = new javax.swing.JButton();

    jLabelLogin.setText("jLabelLogin");

    jTextFieldLogin.setText("jTextFieldLogin");
    jTextFieldLogin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldLoginActionPerformed(evt);
      }
    });

    jLabelPass.setText("jLabelPass");

    jTextFieldPass.setText("jTextFieldPass");
    jTextFieldPass.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldPassActionPerformed(evt);
      }
    });

    jButtonValidate.setText("jButtonValidate");
    jButtonValidate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonValidateActionPerformed(evt);
      }
    });

    jButtonCancel.setText("jButtonCancel");
    jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonCancelActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(159, 159, 159)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabelPass)
              .addComponent(jTextFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelLogin)
              .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addGap(73, 73, 73)
            .addComponent(jButtonValidate)
            .addGap(37, 37, 37)
            .addComponent(jButtonCancel)))
        .addContainerGap(86, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(52, 52, 52)
        .addComponent(jLabelLogin)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jLabelPass)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jTextFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(42, 42, 42)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButtonValidate)
          .addComponent(jButtonCancel))
        .addContainerGap(85, Short.MAX_VALUE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextFieldLoginActionPerformed

  private void jTextFieldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPassActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextFieldPassActionPerformed

  private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jButtonCancelActionPerformed

  private void jButtonValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidateActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jButtonValidateActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonCancel;
  private javax.swing.JButton jButtonValidate;
  private javax.swing.JLabel jLabelLogin;
  private javax.swing.JLabel jLabelPass;
  private javax.swing.JTextField jTextFieldLogin;
  private javax.swing.JTextField jTextFieldPass;
  // End of variables declaration//GEN-END:variables
}