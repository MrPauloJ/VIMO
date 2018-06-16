package Panel;
import javax.swing.JOptionPane;
import Bancos.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
public class Cadastro extends javax.swing.JPanel {
    public Cadastro() {
        initComponents();
    }
    //Global Var
    BufferedImage Img;
    User usuario = new User();
    public String Caminho;
    // Change to English Idiom
    public void en() {
    Bancos.Idioma idioma = new Bancos.Idioma();
    idioma.English();
    AlterarFoto.setText(idioma.getAltFotoC());
    apelido.setText(idioma.getNomeC());
    senha.setText(idioma.getSenhaC());
    sexo.setText(idioma.getSexoC());
    email.setText(idioma.getEmailC());
    masculino.setText(idioma.getMasculinoc());
    feminino.setText(idioma.getFemininoc());
    }
    // Change to Portuguese Idiom
    public void br(){
    Bancos.Idioma idioma = new Bancos.Idioma();    
    idioma.ptbr();
    AlterarFoto.setText(idioma.getAltFotoC());
    apelido.setText(idioma.getNomeC());
    senha.setText(idioma.getSenhaC());
    sexo.setText(idioma.getSexoC());
    email.setText(idioma.getEmailC());
    masculino.setText(idioma.getMasculinoc());
    feminino.setText(idioma.getFemininoc());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        CampoNick = new javax.swing.JTextField();
        senha = new javax.swing.JLabel();
        Foto = new javax.swing.JLabel();
        masculino = new javax.swing.JRadioButton();
        feminino = new javax.swing.JRadioButton();
        sexo = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        apelido = new javax.swing.JLabel();
        AlterarFoto = new javax.swing.JButton();
        CampoPass = new javax.swing.JPasswordField();
        CadastrarD = new javax.swing.JButton();
        CampoMail = new javax.swing.JFormattedTextField();
        Background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(1, 50, 33));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoNick.setMaximumSize(new java.awt.Dimension(25, 35));
        CampoNick.setMinimumSize(new java.awt.Dimension(25, 35));
        CampoNick.setPreferredSize(new java.awt.Dimension(25, 35));
        add(CampoNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 235, 33));

        senha.setBackground(new java.awt.Color(0, 0, 0));
        senha.setForeground(new java.awt.Color(255, 255, 255));
        senha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senha.setText("S E N H A");
        add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, 33));

        Foto.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        Foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconUsuarioGVrd.jpg"))); // NOI18N
        Foto.setMaximumSize(new java.awt.Dimension(125, 130));
        Foto.setMinimumSize(new java.awt.Dimension(125, 130));
        Foto.setOpaque(true);
        Foto.setPreferredSize(new java.awt.Dimension(155, 129));
        add(Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 129, 155));

        buttonGroup1.add(masculino);
        masculino.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        masculino.setForeground(new java.awt.Color(255, 255, 255));
        masculino.setText("Masculino");
        masculino.setContentAreaFilled(false);
        add(masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        buttonGroup1.add(feminino);
        feminino.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        feminino.setForeground(new java.awt.Color(255, 255, 255));
        feminino.setText("Feminino");
        feminino.setContentAreaFilled(false);
        add(feminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        sexo.setBackground(new java.awt.Color(0, 0, 0));
        sexo.setForeground(new java.awt.Color(255, 255, 255));
        sexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sexo.setText("S E X O");
        add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, 23));

        email.setBackground(new java.awt.Color(0, 0, 0));
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email.setText("E - M A I L");
        add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, 23));

        apelido.setForeground(new java.awt.Color(255, 255, 255));
        apelido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apelido.setText("A P E L I D O");
        add(apelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, 33));

        AlterarFoto.setForeground(new java.awt.Color(255, 255, 255));
        AlterarFoto.setText("A L T E R A R    I M A G E M");
        AlterarFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        AlterarFoto.setContentAreaFilled(false);
        AlterarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarFotoActionPerformed(evt);
            }
        });
        add(AlterarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 230, 30));

        CampoPass.setMargin(new java.awt.Insets(5, 5, 5, 5));
        CampoPass.setMaximumSize(new java.awt.Dimension(25, 35));
        CampoPass.setMinimumSize(new java.awt.Dimension(25, 35));
        CampoPass.setPreferredSize(new java.awt.Dimension(25, 35));
        add(CampoPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 235, 33));

        CadastrarD.setForeground(new java.awt.Color(255, 255, 255));
        CadastrarD.setText("C A D A S T R A R");
        CadastrarD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        CadastrarD.setContentAreaFilled(false);
        CadastrarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarDActionPerformed(evt);
            }
        });
        add(CadastrarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 110, 30));
        add(CampoMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 230, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/green.jpg"))); // NOI18N
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarDActionPerformed
        User usuario = new User();
        BancoDeDados bd = new BancoDeDados();
        if(CampoNick.getText().isEmpty() || CampoPass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ops! Algum campo está Vazio.");
        }
        else{
            usuario.setUsuario(CampoNick.getText());
            usuario.setSenha(CampoPass.getText());
            if (masculino.isSelected()) {
            usuario.setSexo("Mas");
            }
            else if (feminino.isSelected()) {
            usuario.setSexo("Fem");
            }
            usuario.setEmail(CampoMail.getText());
            usuario.setImagem(Caminho);
            bd.Cadastrar(usuario);
            CampoNick.setText(null);
            CampoPass.setText(null);
            CampoMail.setText(null);
        }
    }//GEN-LAST:event_CadastrarDActionPerformed
    private void AlterarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarFotoActionPerformed
       JFileChooser fc = new JFileChooser();
       BancoDeDados bd = new BancoDeDados();
       int res = fc.showOpenDialog(null);
       if (res == JFileChooser.APPROVE_OPTION){
           File arquivo = fc.getSelectedFile();
           Caminho = arquivo.getPath();
           Caminho = Caminho.replace("/", "//");
       try{
         ImageIcon img = new ImageIcon(Caminho);
         img.setImage(img.getImage().getScaledInstance(129, 155, 100));
         Foto.setIcon(img);
         Foto.repaint();
         Foto.validate();
         Foto.setVisible(true);
       } catch(Exception ex){
           JOptionPane.showMessageDialog(null, "erro");
       }
       }
    }//GEN-LAST:event_AlterarFotoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarFoto;
    private javax.swing.JLabel Background;
    private javax.swing.JButton CadastrarD;
    private javax.swing.JFormattedTextField CampoMail;
    private javax.swing.JTextField CampoNick;
    private javax.swing.JPasswordField CampoPass;
    private javax.swing.JLabel Foto;
    private javax.swing.JLabel apelido;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel email;
    private javax.swing.JRadioButton feminino;
    private javax.swing.JRadioButton masculino;
    private javax.swing.JLabel senha;
    private javax.swing.JLabel sexo;
    // End of variables declaration//GEN-END:variables
}
