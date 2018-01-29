/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymassignmentthree;

import java.awt.event.KeyEvent;

/**
 *
 * @author davwo
 */
public class jMenuFrame extends javax.swing.JFrame {
    Gym myModel = new Gym();

    public jMenuFrame(Gym myModel){
        this.myModel = myModel;
        initComponents();
        jGymNameLabel.setText(myModel.getName());
        jGymOwnerLabel.setText(myModel.getOwner());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRegisterButton = new javax.swing.JButton();
        jSignInButton = new javax.swing.JButton();
        jSignInText = new javax.swing.JTextField();
        jBalanceLabel = new javax.swing.JLabel();
        jDaysLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jGymOwnerLabel = new javax.swing.JLabel();
        jGymNameLabel = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jRegisterButton.setText("Register");
        jRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegisterButtonActionPerformed(evt);
            }
        });

        jSignInButton.setText("Sign In");
        jSignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignInButtonActionPerformed(evt);
            }
        });

        jSignInText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignInTextActionPerformed(evt);
            }
        });
        jSignInText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSignInTextKeyPressed(evt);
            }
        });

        jBalanceLabel.setText("Balance:");
        jBalanceLabel.setVisible(false);

        jDaysLabel.setText("Days Remaining:");
        jDaysLabel.setVisible(false);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jGymOwnerLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jGymOwnerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jGymOwnerLabel.setText("Gym Owner");
        jPanel1.add(jGymOwnerLabel, java.awt.BorderLayout.PAGE_END);

        jGymNameLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jGymNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jGymNameLabel.setText("Gym Name");
        jPanel1.add(jGymNameLabel, java.awt.BorderLayout.CENTER);
        jPanel1.add(filler1, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRegisterButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 86, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDaysLabel)
                            .addComponent(jBalanceLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSignInText, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jSignInButton)))
                        .addGap(92, 92, 92))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSignInButton)
                    .addComponent(jSignInText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBalanceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDaysLabel)
                .addGap(44, 44, 44)
                .addComponent(jRegisterButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegisterButtonActionPerformed
        jMemberFrame memberFrame = new jMemberFrame(myModel);
        memberFrame.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jRegisterButtonActionPerformed

    private void jSignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignInButtonActionPerformed
        Member myMember = null;
        
        for(Member m : myModel.getListM()){
            if(m.getName().equals(jSignInText.getText()) ){
                myMember = m;
            }
        }
        if(myMember != null){
            //SIGN IN SUCCESSFUL
            myMember.signIn();
            
            jBalanceLabel.setText("Balance: " + Double.toString(myMember.getBalance()));
            jDaysLabel.setText("Days Remaining: $" + Integer.toString(myMember.getDays()));
            jBalanceLabel.setVisible(true);
            jDaysLabel.setVisible(true);
            
        } else {
            jBalanceLabel.setText("Please choose a name that exists.");
            jBalanceLabel.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jSignInButtonActionPerformed

    private void jSignInTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignInTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSignInTextActionPerformed

    private void jSignInTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSignInTextKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           jSignInButton.doClick(); 
        }    
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jSignInTextKeyPressed
    
//    
//    DELETE
//    I THINK THIS IS TRASH? i THINK YOU ONLY NEED ONE FRAME WITH MAIN...
//    
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(jMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(jMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(jMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(jMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new jMenuFrame().setVisible(true);
//            }
//        });
//    }
//    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jBalanceLabel;
    private javax.swing.JLabel jDaysLabel;
    private javax.swing.JLabel jGymNameLabel;
    private javax.swing.JLabel jGymOwnerLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jRegisterButton;
    private javax.swing.JButton jSignInButton;
    private javax.swing.JTextField jSignInText;
    // End of variables declaration//GEN-END:variables
}
