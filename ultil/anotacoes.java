package ultil;
import Opcoes.Anotacoes;
import Bancos.*;
import javax.swing.JOptionPane;
public class anotacoes extends javax.swing.JPanel {
    //Global Var
    User usuario = new User();
    String numLembrete = null;
    public anotacoes() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame = new javax.swing.JPanel();
        principal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lembreteText = new javax.swing.JTextArea();
        Voltar = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(111, 177, 88));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setName(""); // NOI18N
        setLayout(new java.awt.CardLayout());

        jFrame.setLayout(new java.awt.CardLayout());

        principal.setBackground(new java.awt.Color(111, 177, 88));
        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lembreteText.setColumns(20);
        lembreteText.setLineWrap(true);
        lembreteText.setRows(5);
        jScrollPane1.setViewportView(lembreteText);

        principal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 650, 280));

        Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconSeta2.png"))); // NOI18N
        Voltar.setContentAreaFilled(false);
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        principal.add(Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 100, 50));

        Save.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("Salvar");
        Save.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Save.setContentAreaFilled(false);
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        principal.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 90, 30));

        titulo.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Lembrete.png"))); // NOI18N
        principal.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 780, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/green.jpg"))); // NOI18N
        principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        jFrame.add(principal, "card2");

        add(jFrame, "card3");
    }// </editor-fold>//GEN-END:initComponents
    // To take the User
    public void setUsuario(User usuario, String numeroLemb){
        this.usuario=usuario;
        this.numLembrete=numeroLemb;
    }
    // To connect Notes with Users
    public void obterLemb(){
        String lembrete=null;
        BancoDeDados bd = new BancoDeDados();
        lembrete=bd.getLembrete(numLembrete, usuario.getUsuario());
        lembreteText.setText(lembrete);
    }
    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        Anotacoes anotacao = new Anotacoes();
        anotacao.setVisible(true);
        anotacao.setUsuario(this.usuario);
        jFrame.removeAll();
        jFrame.add(anotacao);
        jFrame.repaint();
        jFrame.revalidate();
    }//GEN-LAST:event_VoltarActionPerformed
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        BancoDeDados bd = new BancoDeDados();
        bd.SetLembrete(this.numLembrete,lembreteText.getText(),this.usuario.getUsuario());
        JOptionPane.showMessageDialog(null, "Salvo com sucesso !");
    }//GEN-LAST:event_SaveActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JButton Voltar;
    private javax.swing.JPanel jFrame;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea lembreteText;
    private javax.swing.JPanel principal;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
