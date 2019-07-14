package sicm;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FormLogin extends javax.swing.JFrame {

 ResultSet rs = null;
 PreparedStatement ps =null;
    int dragXmouse;
    int dragYmouse;
    public FormLogin() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_passwd = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(600, 450));
        getContentPane().setLayout(null);

        txt_username.setBackground(new java.awt.Color(44, 50, 71));
        txt_username.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        txt_username.setBorder(null);
        getContentPane().add(txt_username);
        txt_username.setBounds(100, 360, 310, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sicm/image/btnLogin.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel5MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 490, 410, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sicm/image/closeRed.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 10, 30, 30);

        txt_passwd.setBackground(new java.awt.Color(44, 50, 71));
        txt_passwd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_passwd.setForeground(new java.awt.Color(255, 255, 255));
        txt_passwd.setBorder(null);
        txt_passwd.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_passwd);
        txt_passwd.setBounds(100, 430, 320, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sicm/image/UILogin.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 480, 600);

        setSize(new java.awt.Dimension(480, 602));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
     this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
    ImageIcon A = new ImageIcon(getClass().getResource("image/closeRed1.png"));
    jLabel2.setIcon(A);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
    ImageIcon A = new ImageIcon(getClass().getResource("image/closeRed.png"));
    jLabel2.setIcon(A);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
    ImageIcon A = new ImageIcon(getClass().getResource("image/closeRed1.png"));
    jLabel2.setIcon(A);
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
    ImageIcon A = new ImageIcon(getClass().getResource("image/closeRed.png"));
    jLabel2.setIcon(A);
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseReleased
        ImageIcon B = new ImageIcon(getClass().getResource("image/btnLogin1.png"));
        jLabel5.setIcon(B);
    }//GEN-LAST:event_jLabel5MouseReleased

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        ImageIcon B = new ImageIcon(getClass().getResource("image/btnLogin1.png"));
        jLabel5.setIcon(B);
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        ImageIcon B = new ImageIcon(getClass().getResource("image/btnLogin.png"));
        jLabel5.setIcon(B);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        ImageIcon B = new ImageIcon(getClass().getResource("image/btnLogin.png"));
        jLabel5.setIcon(B);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
     try {
         Connection kon = dasbor.sambungKeDatabase();
         ResultSet as = kon.createStatement().executeQuery("select * from user where username='"+txt_username.getText()+"' and password =MD5( '"+String.valueOf(txt_passwd.getText())+"')");
         if(as.next()){
             dasbor ad =new dasbor();
             ad.setVisible(true);
             dispose();
         }else{
         JOptionPane.showMessageDialog(rootPane, "Username & Password Salah !");
         }
     } catch (SQLException ex) {
         Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txt_passwd;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
