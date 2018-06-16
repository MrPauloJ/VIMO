package Panel;
import Frame.*;
import Bancos.*;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class Config extends javax.swing.JPanel {
    public Config() {
        initComponents();
        }
    //Global Var
    String lingua;
    String Caminho;
    User usuario = new User();
    // Change to English Idiom
    public void Ing(){
    Idioma idioma = new Idioma();
    idioma.English();
    Apelido.setText(idioma.getNomeC());
    Senha.setText(idioma.getSenhaC());
    Sexo.setText(idioma.getSexoC());
    Email.setText(idioma.getEmailC());
    Salvar.setText(idioma.getMudanças());
    Remover.setText(idioma.getRemover());
    AlterarImagem.setText(idioma.getAltFotoC());
    masculino.setText(idioma.getMasculinoc());
    feminino.setText(idioma.getFemininoc());
    }
    // Change to Portuguese Idiom
    public void BR(){
    Idioma idioma = new Idioma();
    idioma.ptbr();
    Apelido.setText(idioma.getNomeC());
    Senha.setText(idioma.getSenhaC());
    Sexo.setText(idioma.getSexoC());
    Email.setText(idioma.getEmailC());
    Salvar.setText(idioma.getMudanças());
    Remover.setText(idioma.getRemover());
    AlterarImagem.setText(idioma.getAltFotoC());
    masculino.setText(idioma.getMasculinoc());
    feminino.setText(idioma.getFemininoc());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        FotoD = new javax.swing.JLabel();
        CampoNick = new javax.swing.JTextField();
        masculino = new javax.swing.JRadioButton();
        feminino = new javax.swing.JRadioButton();
        Email = new javax.swing.JLabel();
        Sexo = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        AltInf = new javax.swing.JLabel();
        Apelido = new javax.swing.JLabel();
        Salvar = new javax.swing.JButton();
        Remover = new javax.swing.JButton();
        CampoMail = new javax.swing.JTextField();
        CampoPass = new javax.swing.JPasswordField();
        AlterarImagem = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(117, 177, 88));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FotoD.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        FotoD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconUsuarioGVrd.jpg"))); // NOI18N
        FotoD.setOpaque(true);
        add(FotoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 155, 129, 155));

        CampoNick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNickActionPerformed(evt);
            }
        });
        add(CampoNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 230, 33));

        buttonGroup1.add(masculino);
        masculino.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        masculino.setForeground(new java.awt.Color(255, 255, 255));
        masculino.setText("Masculino");
        masculino.setContentAreaFilled(false);
        masculino.setFocusPainted(false);
        add(masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, 30));

        buttonGroup1.add(feminino);
        feminino.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        feminino.setForeground(new java.awt.Color(255, 255, 255));
        feminino.setText("Feminino");
        feminino.setContentAreaFilled(false);
        feminino.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(feminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, -1, 30));

        Email.setBackground(new java.awt.Color(0, 0, 0));
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Email.setText("E - M A I L");
        add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 80, 30));

        Sexo.setBackground(new java.awt.Color(0, 0, 0));
        Sexo.setForeground(new java.awt.Color(255, 255, 255));
        Sexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sexo.setText("S E X O");
        add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 80, 30));

        Senha.setBackground(new java.awt.Color(0, 0, 0));
        Senha.setForeground(new java.awt.Color(255, 255, 255));
        Senha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Senha.setText(" S E N H A");
        add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 110, 33));

        AltInf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AltInf.setForeground(new java.awt.Color(255, 255, 255));
        AltInf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AltInf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Alter.png"))); // NOI18N
        AltInf.setFocusable(false);
        add(AltInf, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, 33));

        Apelido.setForeground(new java.awt.Color(255, 255, 255));
        Apelido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Apelido.setText(" A P E L I D O");
        add(Apelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 110, 33));

        Salvar.setForeground(new java.awt.Color(255, 255, 255));
        Salvar.setText("S A L V A R    A L T E R A Ç Õ E S");
        Salvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Salvar.setContentAreaFilled(false);
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });
        add(Salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 194, 40));

        Remover.setForeground(new java.awt.Color(255, 255, 255));
        Remover.setText("R E M O V E R   U S U Á R I O");
        Remover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Remover.setContentAreaFilled(false);
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });
        add(Remover, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 208, 40));

        CampoMail.setMaximumSize(new java.awt.Dimension(33, 167));
        CampoMail.setMinimumSize(new java.awt.Dimension(33, 167));
        add(CampoMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 230, 33));

        CampoPass.setMaximumSize(new java.awt.Dimension(33, 167));
        CampoPass.setMinimumSize(new java.awt.Dimension(33, 167));
        add(CampoPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 230, 33));

        AlterarImagem.setForeground(new java.awt.Color(255, 255, 255));
        AlterarImagem.setText("S E L E C I O N A R   I M G");
        AlterarImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        AlterarImagem.setContentAreaFilled(false);
        AlterarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarImagemActionPerformed(evt);
            }
        });
        add(AlterarImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 170, 33));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/green.jpg"))); // NOI18N
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));
    }// </editor-fold>//GEN-END:initComponents
    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        Bancos.BancoDeDados bd = new Bancos.BancoDeDados();
        bd.DeletarUser(this.usuario);
        JOptionPane.showMessageDialog(null, "Deletado com sucesso !");
    }//GEN-LAST:event_RemoverActionPerformed
    private void CampoNickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNickActionPerformed
    }//GEN-LAST:event_CampoNickActionPerformed
    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        Bancos.BancoDeDados bd = new Bancos.BancoDeDados();
        User usuario1 = new User();
        usuario1.setUsuario(CampoNick.getText());
        usuario1.setSenha(CampoPass.getText());
        usuario1.setEmail(CampoMail.getText());
        usuario1.setImagem(Caminho);
        if(masculino.isSelected()){
            usuario1.setSexo("Mas");
        }
        if(feminino.isSelected()){
            usuario1.setSexo("Fem");
        }
        usuario1.setId(this.usuario.getId());
        try{
            bd.updateInfo(usuario1);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ops, houve algum erro !");
        }
    }//GEN-LAST:event_SalvarActionPerformed
    private void AlterarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarImagemActionPerformed
        JFileChooser fc = new JFileChooser();
       BancoDeDados bd = new BancoDeDados();
       int res = fc.showOpenDialog(null);
       if (res == JFileChooser.APPROVE_OPTION){
           File arquivo = fc.getSelectedFile();
           Caminho = arquivo.getPath();
           Caminho = Caminho.replace("/", "//");
           try {
//        ImageIO.write(aceimg, "JPG", new File("c://Vimo//" + usuario.getUsuario() + "G.jpg"));
        } 
            catch (Exception e) {JOptionPane.showMessageDialog(null, "merda dimensao");}
       try{
         ImageIcon img = new ImageIcon(Caminho);
         img.setImage(img.getImage().getScaledInstance(129, 155, 100));
         FotoD.setIcon(img);
         FotoD.repaint();
         FotoD.validate();
         FotoD.setVisible(true);
       } catch(Exception ex){
           JOptionPane.showMessageDialog(null, "erro");
       }
       }
    }//GEN-LAST:event_AlterarImagemActionPerformed
     //Getting the informations to put for the Config's fuctions
    public void getInfo(User usuario){
        Bancos.BancoDeDados bd = new Bancos.BancoDeDados();
        this.usuario=usuario;
        CampoNick.setText(this.usuario.getUsuario());
        CampoPass.setText(this.usuario.getSenha());
        CampoMail.setText(this.usuario.getEmail());
        if("Mas".equals(this.usuario.getSexo())){
            masculino.doClick();
        } else if ("Fem".equals(this.usuario.getSexo())) {
            feminino.doClick();
        }
        try{
         Caminho=bd.getImagem(this.usuario.getId());
         ImageIcon img = new ImageIcon(Caminho);
         img.setImage(img.getImage().getScaledInstance(129, 155, 100));
         FotoD.setIcon(img);
         FotoD.repaint();
         FotoD.validate();
         FotoD.setVisible(true);
       } catch(Exception ex){
           JOptionPane.showMessageDialog(null, "erro");
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AltInf;
    private javax.swing.JButton AlterarImagem;
    private javax.swing.JLabel Apelido;
    private javax.swing.JLabel Background;
    private javax.swing.JTextField CampoMail;
    private javax.swing.JTextField CampoNick;
    private javax.swing.JPasswordField CampoPass;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel FotoD;
    private javax.swing.JButton Remover;
    private javax.swing.JButton Salvar;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel Sexo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton feminino;
    private javax.swing.JRadioButton masculino;
    // End of variables declaration//GEN-END:variables
}
