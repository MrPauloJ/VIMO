package Frame;
import Bancos.*;
import Panel.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {
    //Global Var
    public Login() {
        initComponents();
        // To Push the buttom automatically
        getRootPane().setDefaultButton(EntrarD);
    }
        //Key_Enter = Buttom(EntrarD)
       public void keyPressed(KeyEvent e) {
	if (e.getKeyCode() == KeyEvent.VK_ENTER) {
	EntrarD.doClick();
				}
			}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Opcao = new javax.swing.JPanel();
        Sair = new javax.swing.JButton();
        NomeE = new javax.swing.JLabel();
        Sobre = new javax.swing.JButton();
        EntrarE = new javax.swing.JButton();
        CadastrarE = new javax.swing.JButton();
        FotoE = new javax.swing.JLabel();
        Frame = new javax.swing.JPanel();
        jLogin = new javax.swing.JPanel();
        Apelido = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        FotoD = new javax.swing.JLabel();
        EntrarD = new javax.swing.JButton();
        CampoNick = new javax.swing.JTextField();
        CampoPass = new javax.swing.JPasswordField();
        jSobre = new javax.swing.JPanel();
        jCadastrar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Opcao.setBackground(new java.awt.Color(7, 7, 8));
        Opcao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Opcao.setMaximumSize(new java.awt.Dimension(180, 500));
        Opcao.setMinimumSize(new java.awt.Dimension(180, 500));
        Opcao.setPreferredSize(new java.awt.Dimension(180, 500));
        Opcao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sair.setFont(new java.awt.Font("Gill Sans MT", 0, 8)); // NOI18N
        Sair.setForeground(new java.awt.Color(255, 255, 255));
        Sair.setText("S A I R");
        Sair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Sair.setContentAreaFilled(false);
        Sair.setFocusPainted(false);
        Sair.setRequestFocusEnabled(false);
        Sair.setRolloverEnabled(false);
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Opcao.add(Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 50, 18));

        NomeE.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        NomeE.setForeground(new java.awt.Color(255, 255, 255));
        NomeE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NomeE.setText("VIMOR");
        Opcao.add(NomeE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 80, -1));

        Sobre.setBackground(null);
        Sobre.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        Sobre.setForeground(new java.awt.Color(255, 255, 255));
        Sobre.setText("Sobre");
        Sobre.setBorder(null);
        Sobre.setBorderPainted(false);
        Sobre.setContentAreaFilled(false);
        Sobre.setFocusPainted(false);
        Sobre.setRequestFocusEnabled(false);
        Sobre.setRolloverEnabled(false);
        Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreActionPerformed(evt);
            }
        });
        Opcao.add(Sobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 180, 30));

        EntrarE.setBackground(null);
        EntrarE.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        EntrarE.setForeground(new java.awt.Color(255, 255, 255));
        EntrarE.setText("E N T R A R");
        EntrarE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        EntrarE.setContentAreaFilled(false);
        EntrarE.setFocusable(false);
        EntrarE.setRequestFocusEnabled(false);
        EntrarE.setRolloverEnabled(false);
        EntrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarEActionPerformed(evt);
            }
        });
        Opcao.add(EntrarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 190, 50));

        CadastrarE.setBackground(null);
        CadastrarE.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        CadastrarE.setForeground(new java.awt.Color(255, 255, 255));
        CadastrarE.setText("C A D A S T R A R");
        CadastrarE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        CadastrarE.setContentAreaFilled(false);
        CadastrarE.setFocusable(false);
        CadastrarE.setRequestFocusEnabled(false);
        CadastrarE.setRolloverEnabled(false);
        CadastrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarEActionPerformed(evt);
            }
        });
        Opcao.add(CadastrarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 190, 50));

        FotoE.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        FotoE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconUsuarioPVd.jpg"))); // NOI18N
        FotoE.setOpaque(true);
        Opcao.add(FotoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 50, -1));

        getContentPane().add(Opcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -8, 190, 520));

        Frame.setBackground(new java.awt.Color(1, 50, 33));
        Frame.setMaximumSize(new java.awt.Dimension(800, 500));
        Frame.setLayout(new java.awt.CardLayout());

        jLogin.setBackground(new java.awt.Color(1, 50, 33));
        jLogin.setMaximumSize(new java.awt.Dimension(800, 500));
        jLogin.setMinimumSize(new java.awt.Dimension(800, 500));
        jLogin.setPreferredSize(new java.awt.Dimension(800, 500));
        jLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Apelido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Apelido.setForeground(new java.awt.Color(255, 255, 255));
        Apelido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Apelido.setText("A P E L I D O");
        Apelido.setMaximumSize(new java.awt.Dimension(40, 70));
        Apelido.setMinimumSize(new java.awt.Dimension(40, 70));
        Apelido.setPreferredSize(new java.awt.Dimension(40, 70));
        jLogin.add(Apelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 150, 40));

        Senha.setBackground(new java.awt.Color(0, 0, 0));
        Senha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Senha.setForeground(new java.awt.Color(255, 255, 255));
        Senha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Senha.setText("S E N H A");
        Senha.setMaximumSize(new java.awt.Dimension(40, 70));
        Senha.setMinimumSize(new java.awt.Dimension(40, 70));
        Senha.setPreferredSize(new java.awt.Dimension(40, 70));
        jLogin.add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 150, 40));

        FotoD.setBackground(null);
        FotoD.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        FotoD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/VimoLogin.png"))); // NOI18N
        FotoD.setInheritsPopupMenu(false);
        FotoD.setMaximumSize(new java.awt.Dimension(125, 130));
        FotoD.setMinimumSize(new java.awt.Dimension(125, 130));
        FotoD.setPreferredSize(new java.awt.Dimension(125, 130));
        jLogin.add(FotoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 410, 180));

        EntrarD.setBackground(null);
        EntrarD.setForeground(new java.awt.Color(255, 255, 255));
        EntrarD.setText("E N T R A R");
        EntrarD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        EntrarD.setContentAreaFilled(false);
        EntrarD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EntrarD.setMaximumSize(new java.awt.Dimension(40, 80));
        EntrarD.setMinimumSize(new java.awt.Dimension(40, 80));
        EntrarD.setPreferredSize(new java.awt.Dimension(40, 80));
        EntrarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarDActionPerformed(evt);
            }
        });
        jLogin.add(EntrarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 80, 30));

        CampoNick.setMargin(new java.awt.Insets(5, 5, 5, 5));
        CampoNick.setMaximumSize(new java.awt.Dimension(25, 35));
        CampoNick.setMinimumSize(new java.awt.Dimension(25, 35));
        jLogin.add(CampoNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 230, 40));

        CampoPass.setMargin(new java.awt.Insets(5, 5, 5, 5));
        CampoPass.setMaximumSize(new java.awt.Dimension(25, 35));
        CampoPass.setMinimumSize(new java.awt.Dimension(25, 35));
        jLogin.add(CampoPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 230, 40));

        Frame.add(jLogin, "card2");

        jSobre.setBackground(new java.awt.Color(1, 50, 33));
        jSobre.setMaximumSize(new java.awt.Dimension(800, 500));
        jSobre.setMinimumSize(new java.awt.Dimension(800, 500));
        jSobre.setPreferredSize(new java.awt.Dimension(800, 500));

        javax.swing.GroupLayout jSobreLayout = new javax.swing.GroupLayout(jSobre);
        jSobre.setLayout(jSobreLayout);
        jSobreLayout.setHorizontalGroup(
            jSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jSobreLayout.setVerticalGroup(
            jSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        Frame.add(jSobre, "card4");

        jCadastrar.setBackground(new java.awt.Color(1, 50, 33));
        jCadastrar.setMaximumSize(new java.awt.Dimension(800, 500));
        jCadastrar.setMinimumSize(new java.awt.Dimension(800, 500));
        jCadastrar.setPreferredSize(new java.awt.Dimension(800, 500));

        javax.swing.GroupLayout jCadastrarLayout = new javax.swing.GroupLayout(jCadastrar);
        jCadastrar.setLayout(jCadastrarLayout);
        jCadastrarLayout.setHorizontalGroup(
            jCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jCadastrarLayout.setVerticalGroup(
            jCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        Frame.add(jCadastrar, "card3");

        getContentPane().add(Frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 800, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void EntrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarEActionPerformed
        Frame.removeAll();
        Frame.add(jLogin);
        Frame.repaint();
        Frame.revalidate();
    }//GEN-LAST:event_EntrarEActionPerformed

    private void CadastrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarEActionPerformed
        Cadastro cadastrar = new Cadastro();
        Frame.removeAll();
        Frame.add(cadastrar);
        Frame.repaint();
        Frame.revalidate();
    }//GEN-LAST:event_CadastrarEActionPerformed

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed
        Sobre about = new Sobre();
        Frame.removeAll();
        Frame.add(about);
        Frame.repaint();
        Frame.revalidate();
    }//GEN-LAST:event_SobreActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void EntrarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarDActionPerformed
        User usuario = new User();
        if(CampoNick.getText().isEmpty() || CampoPass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ops! Algum campo está vázio.");
        }
        else{
            BancoDeDados bd = new BancoDeDados();
            usuario.setUsuario(CampoNick.getText());
            usuario.setSenha(CampoPass.getText());
            // To login the account
            bd.Login(usuario);
            // To clean TextFields up
            CampoPass.setText(null);
            CampoNick.setText(null);
            boolean verificaAcesso = bd.acesso();
            // To confirm and change to TelaI's frame
            if (verificaAcesso == true) {
             TelaI telaInicial = new TelaI();
             telaInicial.getDados(usuario);
             telaInicial.setLocationRelativeTo(null);
             telaInicial.setVisible(true);    
             dispose();
        }
        }
    }//GEN-LAST:event_EntrarDActionPerformed

    public static void main(String args[]) {
   
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login telaAtual = new Login();
                telaAtual.setVisible(true);
                telaAtual.setLocationRelativeTo(null);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apelido;
    private javax.swing.JButton CadastrarE;
    private javax.swing.JTextField CampoNick;
    private javax.swing.JPasswordField CampoPass;
    private javax.swing.JButton EntrarD;
    private javax.swing.JButton EntrarE;
    private javax.swing.JLabel FotoD;
    private javax.swing.JLabel FotoE;
    private javax.swing.JPanel Frame;
    private javax.swing.JLabel NomeE;
    private javax.swing.JPanel Opcao;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel Senha;
    private javax.swing.JButton Sobre;
    private javax.swing.JPanel jCadastrar;
    private javax.swing.JPanel jLogin;
    private javax.swing.JPanel jSobre;
    // End of variables declaration//GEN-END:variables
}
