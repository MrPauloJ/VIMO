package Opcoes;
import java.io.Console;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Interativos extends javax.swing.JPanel {
    public Interativos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Chat = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Challenge = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(111, 177, 88));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Chat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Chat.png"))); // NOI18N
        Chat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Chat.setBorderPainted(false);
        Chat.setContentAreaFilled(false);
        Chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChatActionPerformed(evt);
            }
        });
        add(Chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 310, 210));

        Titulo.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Interativo.png"))); // NOI18N
        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 780, 80));

        Challenge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Challenge.png"))); // NOI18N
        Challenge.setText("Challenge");
        Challenge.setContentAreaFilled(false);
        Challenge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChallengeActionPerformed(evt);
            }
        });
        add(Challenge, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 280, 190));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/green.jpg"))); // NOI18N
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));
    }// </editor-fold>//GEN-END:initComponents
    private void ChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChatActionPerformed
     /* To Link with Vimo's WebSite
     Chat Page*/
        Desktop d = Desktop.getDesktop();
        try {
            d.browse(new URI("http://vimoproject.blogspot.com.br/p/blog-page_29.html"));
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(Interativos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ChatActionPerformed
    private void ChallengeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChallengeActionPerformed
     /* To Link with Vimo's WebSite
      Challenge Page */
        Desktop d = Desktop.getDesktop();
    try {
            d.browse(new URI("http://vimoproject.blogspot.com.br/p/challenge.html"));
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(Interativos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ChallengeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Challenge;
    private javax.swing.JButton Chat;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
