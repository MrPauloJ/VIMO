package Opcoes;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Query extends javax.swing.JPanel {
    public Query() {
        initComponents();
    }
    public void en() {
    Bancos.Idioma I = new Bancos.Idioma();
    I.English();
    EntrarGoogle.setText(I.getPesqGoogle());
    EntrarYoutube.setText(I.getPesqYoutube());
    }
    public void br() {
    Bancos.Idioma I = new Bancos.Idioma();
    I.ptbr();
    EntrarGoogle.setText(I.getPesqGoogle());
    EntrarYoutube.setText(I.getPesqYoutube());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoYoutube = new javax.swing.JTextField();
        EntrarYoutube = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Youtube = new javax.swing.JLabel();
        Google = new javax.swing.JLabel();
        CampoGoogle = new javax.swing.JTextField();
        EntrarGoogle = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(111, 177, 88));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoYoutube.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CampoYoutube.setMargin(new java.awt.Insets(5, 5, 5, 5));
        CampoYoutube.setMaximumSize(new java.awt.Dimension(37, 440));
        CampoYoutube.setMinimumSize(new java.awt.Dimension(37, 440));
        CampoYoutube.setPreferredSize(new java.awt.Dimension(37, 440));
        add(CampoYoutube, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 440, 37));

        EntrarYoutube.setBackground(null);
        EntrarYoutube.setForeground(new java.awt.Color(255, 255, 255));
        EntrarYoutube.setText("P E S Q U I S A R");
        EntrarYoutube.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        EntrarYoutube.setContentAreaFilled(false);
        EntrarYoutube.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EntrarYoutube.setMaximumSize(new java.awt.Dimension(40, 80));
        EntrarYoutube.setMinimumSize(new java.awt.Dimension(40, 80));
        EntrarYoutube.setPreferredSize(new java.awt.Dimension(40, 80));
        EntrarYoutube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarYoutubeActionPerformed(evt);
            }
        });
        add(EntrarYoutube, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 130, 40));

        Titulo.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Query2.png"))); // NOI18N
        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 690, 100));

        Youtube.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        Youtube.setForeground(new java.awt.Color(255, 255, 255));
        Youtube.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Youtube.setText("Y O U T U B E");
        Youtube.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(Youtube, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 440, 40));

        Google.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        Google.setForeground(new java.awt.Color(255, 255, 255));
        Google.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Google.setText("G O O G L E");
        Google.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(Google, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 440, 40));

        CampoGoogle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CampoGoogle.setMargin(new java.awt.Insets(5, 5, 5, 5));
        CampoGoogle.setMaximumSize(new java.awt.Dimension(37, 440));
        CampoGoogle.setMinimumSize(new java.awt.Dimension(37, 440));
        CampoGoogle.setPreferredSize(new java.awt.Dimension(37, 440));
        add(CampoGoogle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 440, 37));

        EntrarGoogle.setBackground(null);
        EntrarGoogle.setForeground(new java.awt.Color(255, 255, 255));
        EntrarGoogle.setText("P E S Q U I S A R");
        EntrarGoogle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        EntrarGoogle.setContentAreaFilled(false);
        EntrarGoogle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EntrarGoogle.setMaximumSize(new java.awt.Dimension(40, 80));
        EntrarGoogle.setMinimumSize(new java.awt.Dimension(40, 80));
        EntrarGoogle.setPreferredSize(new java.awt.Dimension(40, 80));
        EntrarGoogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarGoogleActionPerformed(evt);
            }
        });
        add(EntrarGoogle, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 130, 40));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/green.jpg"))); // NOI18N
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));
    }// </editor-fold>//GEN-END:initComponents
    private void EntrarYoutubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarYoutubeActionPerformed
     // To Link to the Youtube
        Desktop d = Desktop.getDesktop();
     String P = CampoYoutube.getText();
        try {
            P = java.net.URLEncoder.encode(P, "UTF-8");
            d.browse(new URI("https://www.youtube.com/results?search_query="+P));
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EntrarYoutubeActionPerformed
    private void EntrarGoogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarGoogleActionPerformed
     // To Link to the Google
        Desktop d = Desktop.getDesktop();
     String P = CampoGoogle.getText();
     try {
          P = java.net.URLEncoder.encode(P, "UTF-8");
          d.browse(new URI("https://www.google.com.br/search?q="+P));
     } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EntrarGoogleActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField CampoGoogle;
    private javax.swing.JTextField CampoYoutube;
    private javax.swing.JButton EntrarGoogle;
    private javax.swing.JButton EntrarYoutube;
    private javax.swing.JLabel Google;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Youtube;
    // End of variables declaration//GEN-END:variables
}