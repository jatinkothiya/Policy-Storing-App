
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class HOME extends javax.swing.JFrame {

    /**
     * Creates new form HOME
     */
    public HOME() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nmi = new javax.swing.JTextField();
        d1 = new javax.swing.JCheckBox();
        d2 = new javax.swing.JCheckBox();
        b3 = new javax.swing.JCheckBox();
        ci = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        lamt = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        dp = new javax.swing.JTextField();
        dt2 = new javax.swing.JRadioButton();
        dt1 = new javax.swing.JRadioButton();
        a1 = new javax.swing.JCheckBox();
        a2 = new javax.swing.JCheckBox();
        d3 = new javax.swing.JCheckBox();
        b1 = new javax.swing.JCheckBox();
        b2 = new javax.swing.JCheckBox();
        a3 = new javax.swing.JCheckBox();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        d4 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        but1 = new javax.swing.JButton();
        but2 = new javax.swing.JButton();
        but3 = new javax.swing.JButton();
        but4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("<");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText(" Top Rated Companies");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 330, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jk/kotak'.jpg"))); // NOI18N
        jLabel4.setText("   ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 110, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jk/hdfc.png"))); // NOI18N
        jLabel5.setText("   ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 100, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jk/max life.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 100, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jk/DHFL.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 110, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setText("Income  :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, 100, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel11.setText("Net Monthly");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 100, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel12.setText("Enter CI No. :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 100, -1));

        nmi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmiActionPerformed(evt);
            }
        });
        getContentPane().add(nmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 360, 110, -1));

        d1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        d1.setText("Lifetime Damage Service cover (Rs.1200)");
        getContentPane().add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        d2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        d2.setText("Personal Insurance of 8 lac (Rs.3070)");
        d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ActionPerformed(evt);
            }
        });
        getContentPane().add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 280, -1));

        b3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b3.setText(" Member Insurance of 2 lac (Rs.410)");
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 280, -1));

        ci.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 310, 110, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Calculate valid Loan Amout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel13.setText("Document Type :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 450, 120, -1));

        lamt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 500, 130, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel14.setText("Loan Amount :-");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, 110, -1));

        dp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(dp, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 410, 110, -1));

        buttonGroup1.add(dt2);
        dt2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        dt2.setText("Documented");
        getContentPane().add(dt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 470, 120, -1));

        buttonGroup1.add(dt1);
        dt1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        dt1.setText("Filed");
        dt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dt1ActionPerformed(evt);
            }
        });
        getContentPane().add(dt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, 70, -1));

        a1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        a1.setText("Lifetime Damage Service cover (Rs.825)");
        getContentPane().add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        a2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        a2.setText("Personal Insurance of 5 lac (Rs.2010)");
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });
        getContentPane().add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 270, -1));

        d3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        d3.setText("Memeber Insurance of 2 lac (Rs.528)");
        getContentPane().add(d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 280, -1));

        b1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b1.setText("Lifetime Damage Service cover (Rs.1040)");
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        b2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b2.setText("Personal Insurance of 7 lac (Rs.2970)");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 280, -1));

        a3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        a3.setText("Renew Insurance 25% less (free) ");
        getContentPane().add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 270, -1));

        c1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        c1.setText("Lifetime Damage Service cover (Rs.950)");
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, -1));

        c2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        c2.setText("Personal Insurance of 3 lac (Rs.1500)");
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 270, -1));

        d4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        d4.setText("Renew Insurance 25% less (free) ");
        getContentPane().add(d4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 280, -1));

        c3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        c3.setText("Renew Insurance 25% less (free) ");
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 270, -1));

        but1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        but1.setText("Count my Premium/yr.");
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });
        getContentPane().add(but1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        but2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        but2.setText("Count my Premium/yr.");
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });
        getContentPane().add(but2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        but3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        but3.setText("Count my Premium/yr.");
        but3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but3ActionPerformed(evt);
            }
        });
        getContentPane().add(but3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, -1, -1));

        but4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        but4.setText("Count my Premium/yr.");
        but4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but4ActionPerformed(evt);
            }
        });
        getContentPane().add(but4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel15.setText("Decided Price :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 110, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("ADD TO CART");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("ADD TO CART");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("ADD TO CART");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("ADD TO CART");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("OPEN CART");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, -1, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("MODIFY DETAILS");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jk/backkkground.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new main_site().setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   String a,b,c,d;
   Double f = null,nl = null;
   a=ci.getText();
c=nmi.getText();
d=dp.getText();

        if(a.isEmpty())
            JOptionPane.showMessageDialog(this,"<html><font size=4> Please Enter Details",null,3);
        else
          
                 if(c.isEmpty())
            JOptionPane.showMessageDialog(this,"P<html><font size=4>lease Enter Details",null,3);
                 else if(d.isEmpty())
                       JOptionPane.showMessageDialog(this,"<html><font size=4>Please Enter Details",null,3);
      
      if(Double.parseDouble(d)/60<=Double.parseDouble(c)){
        nl=Double.parseDouble(d);
       JOptionPane.showMessageDialog(this,"<html><font size=10> Congratulations! 100% Loan Amount is Set",null,-1);}       if(Double.parseDouble(d)/60>Double.parseDouble(c)){
            if(dt2.isSelected())
            f=Double.parseDouble(d)*0.1;
         if(dt1.isSelected())
            f=Double.parseDouble(d)*0.05; 
       
        nl=Double.parseDouble(c)*60+f;
       }
        lamt.setText(""+nl);
        
        
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nmiActionPerformed

    private void d2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d2ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a2ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
String a,b,c;
a=ci.getText();
b=nmi.getText();
c=dp.getText();
if(a.isEmpty())
    JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=15>Please Enter Details and<br>Calculate Loan Amount",null,3);       
else        if(b.isEmpty())
    JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=15>Please Enter Details and<br>Calculate Loan Amount",null,3);       
        
 else       if(c.isEmpty())
    JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=15>Please Enter Details and<br>Calculate Loan Amount",null,3);       
       
        
        Float pd;
pd=Float.parseFloat(lamt.getText())/120;
if(a1.isSelected())
    pd+=825;
if(a2.isSelected())
    pd+=2010;
if(a3.isSelected())
    pd+=0;
but1.setText(""+pd);


// TODO add your handling code here:
    }//GEN-LAST:event_but1ActionPerformed

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed
String a,b,c;
a=ci.getText();
b=nmi.getText();
c=dp.getText();
if(a.isEmpty())
    JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=15>Please Enter Details and<br>Calculate Loan Amount",null,3);       
else        if(b.isEmpty())
    JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=15>Please Enter Details and<br>Calculate Loan Amount",null,3);       
        
 else       if(c.isEmpty())
    JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=15>Please Enter Details and<br>Calculate Loan Amount",null,3);       
       
        
        Float pd;
pd=Float.parseFloat(lamt.getText())/108;
if(b1.isSelected())
    pd+=1040;
if(b2.isSelected())
    pd+=2970;
if(b3.isSelected())
    pd+=410;
but2.setText(""+pd);        // TODO add your handling code here:
    }//GEN-LAST:event_but2ActionPerformed

    private void but3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but3ActionPerformed
String a,b,c;
a=ci.getText();
b=nmi.getText();
c=dp.getText();
if(a.isEmpty())
    JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=15>Please Enter Details and<br>Calculate Loan Amount",null,3);       
else        if(b.isEmpty())
    JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=15>Please Enter Details and<br>Calculate Loan Amount",null,3);       
        
 else       if(c.isEmpty())
    JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=15>Please Enter Details and<br>Calculate Loan Amount",null,3);       
       
        
        Float pd;
pd=Float.parseFloat(lamt.getText())/128;
if(c1.isSelected())
    pd+=950;
if(c2.isSelected())
    pd+=1500;
if(c3.isSelected())
    pd+=0;
but3.setText(""+pd);        // TODO add your handling code here:
    }//GEN-LAST:event_but3ActionPerformed

    private void but4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but4ActionPerformed
String a,b,c;
a=ci.getText();
b=nmi.getText();
c=dp.getText();
if(a.isEmpty())
    JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=15>Please Enter Details and<br>Calculate Loan Amount",null,3);       
else        if(b.isEmpty())
    JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=15>Please Enter Details and<br>Calculate Loan Amount",null,3);       
        
 else       if(c.isEmpty())
    JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=15>Please Enter Details and<br>Calculate Loan Amount",null,3);       
       
        
        Float pd;
pd=Float.parseFloat(lamt.getText())/100;
if(d1.isSelected())
    pd+=1200;
if(d2.isSelected())
    pd+=3070;
if(d3.isSelected())
    pd+=528;
if(d4.isSelected())
    pd+=0;
but4.setText(""+pd);        // TODO add your handling code here:
    }//GEN-LAST:event_but4ActionPerformed

    private void dt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dt1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
String a,b,c,j,doc = null,lo;
int pd=0; 
a=ci.getText();
b=nmi.getText();
c=dp.getText();
j="MAX Life";
 if(dt1.isSelected())
     doc="Filed";
 if(dt2.isSelected())
     doc="Documented";
 
lo=lamt.getText();
if(d1.isSelected())
    pd+=1200;
if(d2.isSelected())
    pd+=3070;
if(d3.isSelected())
    pd+=528;
if(d4.isSelected())
    pd+=0;





        if(a.isEmpty() || b.isEmpty() || c.isEmpty())
             JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=15>Please Enter Details and<br>Calculate Loan Amount",null,3); 
    try{
            Class.forName("java.sql.Driver");
    Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/jk","root","mysql");
    Statement st=conn.createStatement();
String qry="select * from home;";
    ResultSet rse=st.executeQuery(qry);
while(rse.next()){
        String ei=rse.getString("ci_no");
        if(a.equals(ei))
            JOptionPane.showMessageDialog(this, "<html><font face=rockwell size=6>Already Added on this Number<br>If you want to Mofify Details Please Click on MODIFY DETAILS",null,3);
}
            if(!rse.next()){
            String query="Insert into home values('"+a+"',"+b+","+c+",'"+doc+"',"+lo+",'"+j+"',"+pd+","+but4.getText()+");";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "<html><font face=rockwell size=15>Added to Cart Successfully",null,2);
            }
                 
  }
       catch(Exception e){
       
       } 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
String a,b,c,j,doc = null,lo;
int pd=0; 
a=ci.getText();
b=nmi.getText();
c=dp.getText();
j="Kotak Life";
 if(dt1.isSelected())
     doc="Filed";
 if(dt2.isSelected())
     doc="Documented";
 
lo=lamt.getText();
if(a1.isSelected())
    pd+=825;
if(a2.isSelected())
    pd+=2010;
if(a3.isSelected())
    pd+=0;




        if(a.isEmpty() || b.isEmpty() || c.isEmpty())
             JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=15>Please Enter Details and<br>Calculate Loan Amount",null,3); 
    try{
            Class.forName("java.sql.Driver");
    Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/jk","root","mysql");
    Statement st=conn.createStatement();
String qry="select * from home;";
    ResultSet rse=st.executeQuery(qry);
while(rse.next()){
        String ei=rse.getString("ci_no");
        if(a.equals(ei))
            JOptionPane.showMessageDialog(this, "<html><font face=rockwell size=6>Already Added on this Number<br>If you want to Mofify Details Please Click on MODIFY DETAILS",null,3);
}
            if(!rse.next()){
            String query="Insert into home values('"+a+"',"+b+","+c+",'"+doc+"',"+lo+",'"+j+"',"+pd+","+but1.getText()+");";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "<html><font face=rockwell size=15>Added to Cart Successfully",null,2);
            }
                 
  }
       catch(Exception e){
       
       } 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   String a,b,c,j,doc = null,lo;
int pd=0; 
a=ci.getText();
b=nmi.getText();
c=dp.getText();
j="HDFC";
 if(dt1.isSelected())
     doc="Filed";
 if(dt2.isSelected())
     doc="Documented";
 
lo=lamt.getText();
if(b1.isSelected())
    pd+=1040;
if(b2.isSelected())
    pd+=2970;
if(b3.isSelected())
    pd+=410;





        if(a.isEmpty() || b.isEmpty() || c.isEmpty())
             JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=15>Please Enter Details and<br>Calculate Loan Amount",null,3); 
    try{
            Class.forName("java.sql.Driver");
    Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/jk","root","mysql");
    Statement st=conn.createStatement();
String qry="select * from home;";
    ResultSet rse=st.executeQuery(qry);
while(rse.next()){
        String ei=rse.getString("ci_no");
        if(a.equals(ei))
            JOptionPane.showMessageDialog(this, "<html><font face=rockwell size=6>Already Added on this Number<br>If you want to Mofify Details Please Click on MODIFY DETAILS",null,3);
}
            if(!rse.next()){
            String query="Insert into home values('"+a+"',"+b+","+c+",'"+doc+"',"+lo+",'"+j+"',"+pd+","+but2.getText()+");";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "<html><font face=rockwell size=15>Added to Cart Successfully",null,2);
            }
                 
  }
       catch(Exception e){
       
       } 
      // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
String a,b,c,j,doc = null,lo;
int pd=0; 
a=ci.getText();
b=nmi.getText();
c=dp.getText();
j="DHFL";
 if(dt1.isSelected())
     doc="Filed";
 if(dt2.isSelected())
     doc="Documented";
 
lo=lamt.getText();
if(c1.isSelected())
    pd+=950;
if(c2.isSelected())
    pd+=1500;
if(c3.isSelected())
    pd+=0;

        if(a.isEmpty() || b.isEmpty() || c.isEmpty())
             JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=15>Please Enter Details and<br>Calculate Loan Amount",null,3); 
    try{
            Class.forName("java.sql.Driver");
    Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/jk","root","mysql");
    Statement st=conn.createStatement();
String qry="select * from home;";
    ResultSet rse=st.executeQuery(qry);
while(rse.next()){
        String ei=rse.getString("ci_no");
        if(a.equals(ei))
            JOptionPane.showMessageDialog(this, "<html><font face=rockwell size=6>Already Added on this Number<br>If you want to Mofify Details Please Click on MODIFY DETAILS",null,3);
}
            if(!rse.next()){
            String query="Insert into home values('"+a+"',"+b+","+c+",'"+doc+"',"+lo+",'"+j+"',"+pd+","+but3.getText()+");";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "<html><font face=rockwell size=15>Added to Cart Successfully",null,2);
            }
                 
  }
       catch(Exception e){
       
       }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
String bn;
bn=JOptionPane.showInputDialog(this,"<html><font face=rockwell size=7>Enter CI's Number",null,3);
        try{
     Class.forName("java.sql.Driver");
    Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/jk","root","mysql");
    Statement st=conn.createStatement();
String qry="select * from home where ci_no='"+bn+"';";
    ResultSet rs=st.executeQuery(qry);
    while(rs.next()){
        String ei=rs.getString("ci_no");
        String in=rs.getString("netmoninc");
        String p=rs.getString("price");
        String bc=rs.getString("DOC_TYPE");
        String lm=rs.getString("Loan_amt");
        String ins=rs.getString("INS_COMP");
        String co=rs.getString("Totalcover_Rs");
        String pr=rs.getString("premium");
        if(bn.equals(ei)){
          
       JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=6>CI No. :- "+ei+"<br>Net Monthly Income :- "+in+"<br>Price :- "+p+"<br>Document Type :- "+bc+"<br>Loan Amount :- "+lm+"<br>Insurance Company :- "+ins+"<br>Cover Added Amount :- "+co+"<br>Premium per Annum :- "+pr,null,2);
        }
        
    else if(!rs.next())
  
      JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=6>CI Number not Found <br> Please Add to Cart first",null,0);
}}
catch(Exception ss){

}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
String bnn,a,b,c,doc = null;
 String cab[]=new String[4];
        cab[0]="Kotak Life";
        cab[1]="HDFC";
        cab[2]="MAX Life";
        cab[3]="DHFL";
  if(dt1.isSelected())
     doc="Filed";
 if(dt2.isSelected())
     doc="Documented";
bnn=JOptionPane.showInputDialog(this,"<html><font face=rockwell size=7>Enter CI Number where you want to Change",null,3);
Object cpp=JOptionPane.showInputDialog(null,null, "Select Company :- ",JOptionPane.QUESTION_MESSAGE,null,cab,"Kotak Life");

a=ci.getText();
b=nmi.getText();
c=dp.getText();

 float prem = 0 ,cov = 0;
         
         if(cpp.equals(cab[0])){
      
   prem=Float.parseFloat(but1.getText()); 
  
 Float pd;
pd=Float.parseFloat(lamt.getText())/120;
       cov=(float)(prem-pd);
        
            


    }
else        if(cpp.equals(cab[1])){
   prem=Float.parseFloat(but2.getText());
                         
   Float pd;
pd=Float.parseFloat(lamt.getText())/108;

            
    cov=        (float) (prem-pd);
   
        }
    else    if(cpp.equals(cab[2])){
   prem=Float.parseFloat(but4.getText());
                Float pd;
pd=Float.parseFloat(lamt.getText())/100;

    
 
   cov=        (float)(prem-pd);
        }
    else    if(cpp.equals(cab[3])){
            
               
        Float pd;
pd=Float.parseFloat(lamt.getText())/128;
prem=Float.parseFloat(but3.getText());
cov=(float)(prem-pd);
        }     
        
        try{
     Class.forName("java.sql.Driver");
    Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/jk","root","mysql");
    Statement st=conn.createStatement();
String qry="Update home set ci_no='"+a+"',netmoninc="+b+",price="+c+",DOC_TYPE='"+doc+"',INS_COMP='"+cpp+"',Totalcover_Rs="+cov+",premium="+prem+" where ci_no='"+bnn+"';";
           st.executeUpdate(qry);
    JOptionPane.showMessageDialog(this,"<html><font face=rockwell size=6>Detail's Modified Successfully",null,2);
    
        }
        catch(Exception tt){
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox a1;
    private javax.swing.JCheckBox a2;
    private javax.swing.JCheckBox a3;
    private javax.swing.JCheckBox b1;
    private javax.swing.JCheckBox b2;
    private javax.swing.JCheckBox b3;
    private javax.swing.JButton but1;
    private javax.swing.JButton but2;
    private javax.swing.JButton but3;
    private javax.swing.JButton but4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JTextField ci;
    private javax.swing.JCheckBox d1;
    private javax.swing.JCheckBox d2;
    private javax.swing.JCheckBox d3;
    private javax.swing.JCheckBox d4;
    private javax.swing.JTextField dp;
    private javax.swing.JRadioButton dt1;
    private javax.swing.JRadioButton dt2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lamt;
    private javax.swing.JTextField nmi;
    // End of variables declaration//GEN-END:variables
}