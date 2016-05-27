/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view;

import static app.view.MenuBar.BOOK_LIST;
import static app.view.MenuBar.USER_LIST;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import app.App;
import app.entity.BookEntity;
import app.entity.UserEntity;
import app.model.BookModel;
import app.model.UserModel;

/**
 *
 * @author Tom
 */
public class UserCreate extends javax.swing.JPanel {
	MenuBar fen;

	/**
	 * Creates new form User
	 * @param fen
	 */
	public UserCreate(MenuBar fen) {
		super();
		initComponents();
		this.fen=fen;	 
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabelUserName = new javax.swing.JLabel();
    jTextFieldUserName = new javax.swing.JTextField();
    jLabelUserFirstName = new javax.swing.JLabel();
    jTextFieldUserFirstName = new javax.swing.JTextField();
    jTextFieldUserLogin = new javax.swing.JTextField();
    jLabelUserLogin = new javax.swing.JLabel();
    jTextFieldUserPass = new javax.swing.JTextField();
    jLabelUserPass = new javax.swing.JLabel();
    jTextFieldUserPhone = new javax.swing.JTextField();
    jLabelUserPhone = new javax.swing.JLabel();
    jTextFieldUserMail = new javax.swing.JTextField();
    jLabelUserMail = new javax.swing.JLabel();
    jTextFieldUserService = new javax.swing.JTextField();
    jLabelUserService = new javax.swing.JLabel();
    jButtonCreate = new javax.swing.JButton();
    jButtonRetour = new javax.swing.JButton();

    jLabelUserName.setText("Nom");

    jTextFieldUserName.setText("Doe");

    jLabelUserFirstName.setText("Prenom");

    jTextFieldUserFirstName.setText("John");
    jTextFieldUserFirstName.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldUserFirstNameActionPerformed(evt);
      }
    });

    jTextFieldUserLogin.setText("doej");
    jTextFieldUserLogin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldUserLoginActionPerformed(evt);
      }
    });

    jLabelUserLogin.setText("login");

    jTextFieldUserPass.setText("password");
    jTextFieldUserPass.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldUserPassActionPerformed(evt);
      }
    });

    jLabelUserPass.setText("Password");

    jTextFieldUserPhone.setText("0612345678");
    jTextFieldUserPhone.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldUserPhoneActionPerformed(evt);
      }
    });

    jLabelUserPhone.setText("Telephone");

    jTextFieldUserMail.setText("mail@domain.com");
    jTextFieldUserMail.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldUserMailActionPerformed(evt);
      }
    });

    jLabelUserMail.setText("Adresse e-mail");

    jTextFieldUserService.setText("Comptabilite");
    jTextFieldUserService.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldUserServiceActionPerformed(evt);
      }
    });

    jLabelUserService.setText("Service");

    jButtonCreate.setText("Sauvegarder");
    jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          String firstname = null, name = null, login = null, password = null, phone = null, mail = null, service = null;
			
			if(evt.getActionCommand().contains("Sauvegarder")){

				firstname = jTextFieldUserFirstName.getText().trim();
				name = jTextFieldUserName.getText().trim();
				login = jTextFieldUserLogin.getText().trim();
				password = jTextFieldUserPass.getText().trim();
				phone = jTextFieldUserPhone.getText().trim();
				mail = jTextFieldUserMail.getText().trim();
				service = jTextFieldUserService.getText().trim();

				if(login.equals("") && password.equals("")){
					JOptionPane.showMessageDialog(fen,"Remplissez les champs obligatoires");
				} else {
					UserEntity user = new UserEntity(login, password, name, firstname, phone, mail, service);
					UserModel model = new UserModel(App.getDb());
					model.insertUser(user);
					System.out.println("Insertion reussie!");
					JOptionPane.showMessageDialog(fen,"L'utilisateur "+user.getFirstname()+" "+user.getName()+" est bien sauvegarde !");
				}
			}
        }
      });

    jButtonRetour.setText("Retour");
    jButtonRetour.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonRetourActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(29, 29, 29)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabelUserName)
          .addComponent(jTextFieldUserPass, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabelUserPass)
          .addComponent(jTextFieldUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabelUserLogin)
          .addComponent(jTextFieldUserFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabelUserFirstName))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jTextFieldUserPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabelUserPhone)
          .addComponent(jTextFieldUserMail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabelUserMail)
          .addComponent(jTextFieldUserService, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabelUserService))
        .addGap(220, 220, 220))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jButtonRetour)
        .addGap(18, 18, 18)
        .addComponent(jButtonCreate)
        .addGap(60, 60, 60))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(41, 41, 41)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabelUserName)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabelUserPhone)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jTextFieldUserPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabelUserFirstName)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jTextFieldUserFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabelUserMail)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jTextFieldUserMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabelUserLogin)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jTextFieldUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabelUserService)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jTextFieldUserService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addComponent(jLabelUserPass)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jTextFieldUserPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButtonCreate)
          .addComponent(jButtonRetour))
        .addGap(63, 63, 63))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void jTextFieldUserFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserFirstNameActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextFieldUserFirstNameActionPerformed

  private void jTextFieldUserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserLoginActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextFieldUserLoginActionPerformed

  private void jTextFieldUserPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserPassActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextFieldUserPassActionPerformed

  private void jTextFieldUserPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserPhoneActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextFieldUserPhoneActionPerformed

  private void jTextFieldUserMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserMailActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextFieldUserMailActionPerformed

  private void jTextFieldUserServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserServiceActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextFieldUserServiceActionPerformed

  private void jButtonRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetourActionPerformed
    // TODO add your handling code here:
		System.out.println("want to back ?");
		fen.change(USER_LIST);
  }//GEN-LAST:event_jButtonRetourActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonCreate;
  private javax.swing.JButton jButtonRetour;
  private javax.swing.JLabel jLabelUserFirstName;
  private javax.swing.JLabel jLabelUserLogin;
  private javax.swing.JLabel jLabelUserMail;
  private javax.swing.JLabel jLabelUserName;
  private javax.swing.JLabel jLabelUserPass;
  private javax.swing.JLabel jLabelUserPhone;
  private javax.swing.JLabel jLabelUserService;
  private javax.swing.JTextField jTextFieldUserFirstName;
  private javax.swing.JTextField jTextFieldUserLogin;
  private javax.swing.JTextField jTextFieldUserMail;
  private javax.swing.JTextField jTextFieldUserName;
  private javax.swing.JTextField jTextFieldUserPass;
  private javax.swing.JTextField jTextFieldUserPhone;
  private javax.swing.JTextField jTextFieldUserService;
  // End of variables declaration//GEN-END:variables
}
