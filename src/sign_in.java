
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1232
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



public class sign_in extends javax.swing.JFrame {

    /**
     * Creates new form sign_in
     */
    public sign_in() {
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

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        repass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        pass = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        alac = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Re-Enter Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 370, 20));

        lid.setBackground(new java.awt.Color(236, 234, 234));
        lid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lidMouseEntered(evt);
            }
        });
        lid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lidActionPerformed(evt);
            }
        });
        getContentPane().add(lid, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 260, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Login ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        repass.setBackground(new java.awt.Color(236, 234, 234));
        repass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        repass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                repassMouseEntered(evt);
            }
        });
        getContentPane().add(repass, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 260, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 170, 20));

        pass.setBackground(new java.awt.Color(236, 234, 234));
        pass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passMouseEntered(evt);
            }
        });
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 260, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 370, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Enter Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        alac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        alac.setForeground(new java.awt.Color(0, 0, 204));
        alac.setText("If you have Already Account Please Click here?");
        alac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alacMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                alacMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                alacMouseExited(evt);
            }
        });
        getContentPane().add(alac, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, -1, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Continue");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 100, 40));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 370, 20));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 170, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText(" New user Login");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 100, -1));

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Come and Compare Insurance Companies");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insdekho.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 80));

        jLabel5.setText("    ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jk/secure1.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 430, 520));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void alacMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alacMouseEntered
alac.setText("<html><u>If you have Already Account Please Click here?</u></html>");        // TODO add your handling code here:
    }//GEN-LAST:event_alacMouseEntered

    private void alacMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alacMouseExited
alac.setText("If you have Already Account Please Click here?");        // TODO add your handling code here:
    }//GEN-LAST:event_alacMouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void alacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alacMouseClicked
new already_acc().setVisible(true);
          dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_alacMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String Lid=lid.getText(),Pass,Repass;
Pass=new String(pass.getPassword());
Repass=new String(repass.getPassword());
if(Lid.isEmpty())
    JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=15>Please Enter Details",null,3);  

else
    
    if(Pass.isEmpty())
        JOptionPane.showMessageDialog(this, "<html><font face=rockwell size=15>Please Enter Details",null,3);else
     
    if(Repass.isEmpty())
    JOptionPane.showMessageDialog(this, "<html><font face=rockwell size=15>Please Confirm Password",null,3);
else
        if(Pass.equals(Repass)){
            
try{
    
    Class.forName("java.sql.Driver");
    Connection c =DriverManager.getConnection("jdbc:mysql://localhost/jk","root","mysql");
    Statement st=c.createStatement();
    String qry="select * from login;";
    ResultSet rs=st.executeQuery(qry);
while(rs.next()){
        String ei=rs.getString("LoginId");
        if(Lid.equals(ei))
            JOptionPane.showMessageDialog(this, "<html><font face=rockwell size=15>Login ID has already used",null,3);
}
        if(!rs.next()){
            String query="Insert into login values('"+Lid+"','"+Pass+"');";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "<html><font face=rockwell size=15>ID Created",null,2);
           
          new main_site().setVisible(true);
          dispose(); 
        
            }
           
                    

    
}
    catch(Exception e){
           
                 }
        }
       if(!Pass.equals(Repass))
                        JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=15>Password doesn't match",null,0);
        
       
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lidMouseEntered
lid.setToolTipText("Enter LoginId");        // TODO add your handling code here:
    }//GEN-LAST:event_lidMouseEntered

    private void passMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseEntered
pass.setToolTipText("Enter Password");        // TODO add your handling code here:
    }//GEN-LAST:event_passMouseEntered

    private void repassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repassMouseEntered
repass.setToolTipText("Re-Enter Password");        // TODO add your handling code here:
    }//GEN-LAST:event_repassMouseEntered

    private void lidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lidActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alac;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField lid;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField repass;
    // End of variables declaration//GEN-END:variables
}