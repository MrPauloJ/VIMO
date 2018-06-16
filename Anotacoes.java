package Opcoes;
import Bancos.*;
import ultil.anotacoes;
public class Anotacoes extends javax.swing.JPanel {
    //Global Var
    User usuario = new User();
    public Anotacoes() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrames = new javax.swing.JPanel();
        principal = new javax.swing.JPanel();
        BL1 = new javax.swing.JButton();
        BL2 = new javax.swing.JButton();
        BL3 = new javax.swing.JButton();
        BL4 = new javax.swing.JButton();
        BL5 = new javax.swing.JButton();
        BL6 = new javax.swing.JButton();
        BL7 = new javax.swing.JButton();
        BL8 = new javax.swing.JButton();
        BL9 = new javax.swing.JButton();
        BL10 = new javax.swing.JButton();
        BL11 = new javax.swing.JButton();
        BL12 = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(111, 177, 88));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setName("eoq"); // NOI18N
        setLayout(new java.awt.CardLayout());

        jFrames.setBackground(new java.awt.Color(111, 177, 88));
        jFrames.setMaximumSize(new java.awt.Dimension(800, 500));
        jFrames.setMinimumSize(new java.awt.Dimension(800, 500));
        jFrames.setPreferredSize(new java.awt.Dimension(800, 500));
        jFrames.setLayout(new java.awt.CardLayout());

        principal.setBackground(new java.awt.Color(111, 177, 88));
        principal.setMaximumSize(new java.awt.Dimension(800, 500));
        principal.setMinimumSize(new java.awt.Dimension(800, 500));
        principal.setPreferredSize(new java.awt.Dimension(800, 500));
        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BL1.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        BL1.setForeground(new java.awt.Color(255, 255, 255));
        BL1.setText("I");
        BL1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BL1.setContentAreaFilled(false);
        BL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BL1ActionPerformed(evt);
            }
        });
        principal.add(BL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 130, 80));

        BL2.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        BL2.setForeground(new java.awt.Color(255, 255, 255));
        BL2.setText("II");
        BL2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BL2.setContentAreaFilled(false);
        BL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BL2ActionPerformed(evt);
            }
        });
        principal.add(BL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 140, 80));

        BL3.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        BL3.setForeground(new java.awt.Color(255, 255, 255));
        BL3.setText("III");
        BL3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        BL3.setContentAreaFilled(false);
        BL3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BL3ActionPerformed(evt);
            }
        });
        principal.add(BL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 140, 80));

        BL4.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        BL4.setForeground(new java.awt.Color(255, 255, 255));
        BL4.setText("IV");
        BL4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BL4.setContentAreaFilled(false);
        BL4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BL4ActionPerformed(evt);
            }
        });
        principal.add(BL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 130, 80));

        BL5.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        BL5.setForeground(new java.awt.Color(255, 255, 255));
        BL5.setText("V");
        BL5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BL5.setContentAreaFilled(false);
        BL5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BL5ActionPerformed(evt);
            }
        });
        principal.add(BL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 130, 80));

        BL6.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        BL6.setForeground(new java.awt.Color(255, 255, 255));
        BL6.setText("VI");
        BL6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BL6.setContentAreaFilled(false);
        BL6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BL6ActionPerformed(evt);
            }
        });
        principal.add(BL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 140, 80));

        BL7.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        BL7.setForeground(new java.awt.Color(255, 255, 255));
        BL7.setText("VII");
        BL7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BL7.setContentAreaFilled(false);
        BL7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BL7ActionPerformed(evt);
            }
        });
        principal.add(BL7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 140, 80));

        BL8.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        BL8.setForeground(new java.awt.Color(255, 255, 255));
        BL8.setText("VIII");
        BL8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BL8.setContentAreaFilled(false);
        BL8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BL8ActionPerformed(evt);
            }
        });
        principal.add(BL8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 130, 80));

        BL9.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        BL9.setForeground(new java.awt.Color(255, 255, 255));
        BL9.setText("IX");
        BL9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BL9.setContentAreaFilled(false);
        BL9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BL9ActionPerformed(evt);
            }
        });
        principal.add(BL9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 130, 80));

        BL10.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        BL10.setForeground(new java.awt.Color(255, 255, 255));
        BL10.setText("X");
        BL10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BL10.setContentAreaFilled(false);
        BL10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BL10ActionPerformed(evt);
            }
        });
        principal.add(BL10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 140, 80));

        BL11.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        BL11.setForeground(new java.awt.Color(255, 255, 255));
        BL11.setText("XI");
        BL11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BL11.setContentAreaFilled(false);
        BL11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BL11ActionPerformed(evt);
            }
        });
        principal.add(BL11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 140, 80));

        BL12.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        BL12.setForeground(new java.awt.Color(255, 255, 255));
        BL12.setText("XII");
        BL12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BL12.setContentAreaFilled(false);
        BL12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BL12ActionPerformed(evt);
            }
        });
        principal.add(BL12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 130, 80));

        Titulo.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Lembrete.png"))); // NOI18N
        principal.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 780, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/green.jpg"))); // NOI18N
        principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 500));

        jFrames.add(principal, "card2");

        add(jFrames, "card3");

        getAccessibleContext().setAccessibleName("eoq");
    }// </editor-fold>//GEN-END:initComponents
    public void setUsuario(User usuario){
        this.usuario=usuario;
    }
    private void BL3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BL3ActionPerformed
        anotacoes anotacao = new anotacoes();
        jFrames.removeAll();
        jFrames.add(anotacao);
        jFrames.repaint();
        jFrames.revalidate();
        anotacao.setUsuario(this.usuario,"Lembrete3");
        anotacao.obterLemb();
    }//GEN-LAST:event_BL3ActionPerformed

    private void BL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BL1ActionPerformed
        anotacoes anotacao = new anotacoes();
        jFrames.removeAll();
        jFrames.add(anotacao);
        jFrames.repaint();
        jFrames.revalidate();
        anotacao.setUsuario(this.usuario,"Lembrete1");
        anotacao.obterLemb();
    }//GEN-LAST:event_BL1ActionPerformed

    private void BL4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BL4ActionPerformed
        anotacoes anotacao = new anotacoes();
        jFrames.removeAll();
        jFrames.add(anotacao);
        jFrames.repaint();
        jFrames.revalidate();
        anotacao.setUsuario(this.usuario,"Lembrete4");
        anotacao.obterLemb();
    }//GEN-LAST:event_BL4ActionPerformed

    private void BL5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BL5ActionPerformed
        anotacoes anotacao = new anotacoes();
        jFrames.removeAll();
        jFrames.add(anotacao);
        jFrames.repaint();
        jFrames.revalidate();
        anotacao.setUsuario(this.usuario,"Lembrete5");
        anotacao.obterLemb();
    }//GEN-LAST:event_BL5ActionPerformed
    private void BL6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BL6ActionPerformed
        anotacoes hu = new anotacoes();
        jFrames.removeAll();
        jFrames.add(hu);
        jFrames.repaint();
        jFrames.revalidate();
        hu.setUsuario(usuario,"Lembrete6");
        hu.obterLemb();
    }//GEN-LAST:event_BL6ActionPerformed
    private void BL7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BL7ActionPerformed
        anotacoes anotacao = new anotacoes();
        jFrames.removeAll();
        jFrames.add(anotacao);
        jFrames.repaint();
        jFrames.revalidate();
        anotacao.setUsuario(this.usuario,"Lembrete7");
        anotacao.obterLemb();
    }//GEN-LAST:event_BL7ActionPerformed
    private void BL8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BL8ActionPerformed
        anotacoes anotacao = new anotacoes();
        jFrames.removeAll();
        jFrames.add(anotacao);
        jFrames.repaint();
        jFrames.revalidate();
        anotacao.setUsuario(this.usuario,"Lembrete8");
        anotacao.obterLemb();
    }//GEN-LAST:event_BL8ActionPerformed
    private void BL9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BL9ActionPerformed
        anotacoes anotacao = new anotacoes();
        jFrames.removeAll();
        jFrames.add(anotacao);
        jFrames.repaint();
        jFrames.revalidate();
        anotacao.setUsuario(this.usuario,"Lembrete9");
        anotacao.obterLemb();
    }//GEN-LAST:event_BL9ActionPerformed
    private void BL10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BL10ActionPerformed
        anotacoes anotacao = new anotacoes();
        jFrames.removeAll();
        jFrames.add(anotacao);
        jFrames.repaint();
        anotacao.setUsuario(this.usuario,"Lembrete10");
        anotacao.obterLemb();
        jFrames.revalidate();
    }//GEN-LAST:event_BL10ActionPerformed
    private void BL11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BL11ActionPerformed
        anotacoes anotacao = new anotacoes();
        jFrames.removeAll();
        jFrames.add(anotacao);
        jFrames.repaint();
        jFrames.revalidate();
        anotacao.setUsuario(this.usuario,"Lembrete11");
        anotacao.obterLemb();
    }//GEN-LAST:event_BL11ActionPerformed
    private void BL12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BL12ActionPerformed
        anotacoes anotacao = new anotacoes();
        jFrames.removeAll();
        jFrames.add(anotacao);
        jFrames.repaint();
        jFrames.revalidate();
        anotacao.setUsuario(this.usuario,"Lembrete12");
        anotacao.obterLemb();
    }//GEN-LAST:event_BL12ActionPerformed
    private void BL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BL2ActionPerformed
        anotacoes anotacao = new anotacoes();
        jFrames.removeAll();
        jFrames.add(anotacao);
        jFrames.repaint();
        jFrames.revalidate();
        anotacao.setUsuario(this.usuario,"Lembrete2");
        anotacao.obterLemb();
    }//GEN-LAST:event_BL2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BL1;
    private javax.swing.JButton BL10;
    private javax.swing.JButton BL11;
    private javax.swing.JButton BL12;
    private javax.swing.JButton BL2;
    private javax.swing.JButton BL3;
    private javax.swing.JButton BL4;
    private javax.swing.JButton BL5;
    private javax.swing.JButton BL6;
    private javax.swing.JButton BL7;
    private javax.swing.JButton BL8;
    private javax.swing.JButton BL9;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jFrames;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel principal;
    // End of variables declaration//GEN-END:variables
}
