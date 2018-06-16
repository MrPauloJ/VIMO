package Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.Timer;
import Bancos.*;
import Opcoes.*;
import Panel.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class TelaI extends javax.swing.JFrame {
    public TelaI() {
        initComponents();
    }
    //Global var
    User usuario = new User();
    String Caminho;
    private String idiom;

    // Getting Dates
    public void getDados(User usuario){
        this.usuario.setUsuario(usuario.getUsuario());
        this.usuario.setSenha(usuario.getSenha());
        BancoDeDados bd = new BancoDeDados();
        this.usuario = bd.pesqUsuario(usuario.getUsuario());
        NomeE.setText(this.usuario.getUsuario());
        NomeD.setText(this.usuario.getUsuario());
        try{
         Caminho=bd.getImagem(this.usuario.getId());
         ImageIcon img = new ImageIcon(Caminho);
         img.setImage(img.getImage().getScaledInstance(50, 50, 100));
         FotoE.setIcon(img);
         FotoE.repaint();
         FotoE.validate();
         FotoE.setVisible(true);
       } catch(Exception ex){
           JOptionPane.showMessageDialog(null, "erro");
       }
    }
    // Change to English Idiom
    public void en(){
    Idioma I = new Idioma();
    I.English();
    wellcome.setText(I.getWellcomeTP());
    apresentacao.setText(I.getTextTP());
    Inicio.setText(I.getInicioTP());
    Lembrete.setText(I.getLembreteTP());
    Pesquisa.setText(I.getPesquisaTP());
    Utilitario.setText(I.getUtilitarioTP());
    Configuracao.setText(I.getConfiguracaoTP());
    Sobre.setText(I.getSobre());
    Sair.setText(I.getSairTP());
    }
    // Change to Portuguese Idiom
    public void br(){
    Idioma I = new Idioma();
    I.ptbr();
    wellcome.setText(I.getWellcomeTP());
    apresentacao.setText(I.getTextTP());
    Inicio.setText(I.getInicioTP());
    Lembrete.setText(I.getLembreteTP());
    Pesquisa.setText(I.getPesquisaTP());
    Utilitario.setText(I.getUtilitarioTP());
    Configuracao.setText(I.getConfiguracaoTP());
    Sobre.setText(I.getSobre());
    Sair.setText(I.getSairTP());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        opcoes = new javax.swing.JPanel();
        NomeE = new javax.swing.JLabel();
        FotoE = new javax.swing.JLabel();
        Sobre = new javax.swing.JButton();
        Inicio = new javax.swing.JButton();
        Pesquisa = new javax.swing.JButton();
        Utilitario = new javax.swing.JButton();
        Configuracao = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        Lembrete = new javax.swing.JButton();
        frames = new javax.swing.JPanel();
        jConfig = new javax.swing.JPanel();
        jInicio = new javax.swing.JPanel();
        BTING = new javax.swing.JButton();
        BTBR = new javax.swing.JButton();
        wellcome = new javax.swing.JLabel();
        NomeD = new javax.swing.JLabel();
        apresentacao = new javax.swing.JLabel();
        Dat = new javax.swing.JLabel();
        Dat2 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        jUtilitario = new javax.swing.JPanel();
        jPesquisa = new javax.swing.JPanel();
        jCronograma = new javax.swing.JPanel();
        jLembrete = new javax.swing.JPanel();
        jSobre = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(117, 177, 88));
        setMinimumSize(new java.awt.Dimension(980, 500));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opcoes.setBackground(new java.awt.Color(7, 7, 8));
        opcoes.setMinimumSize(new java.awt.Dimension(180, 510));
        opcoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NomeE.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        NomeE.setForeground(new java.awt.Color(255, 255, 255));
        NomeE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NomeE.setText("NoName");
        opcoes.add(NomeE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 80, -1));

        FotoE.setFont(new java.awt.Font("Gill Sans MT", 0, 11)); // NOI18N
        FotoE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconUsuarioPVd.jpg"))); // NOI18N
        FotoE.setOpaque(true);
        opcoes.add(FotoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 50, 50));

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
        opcoes.add(Sobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 180, 30));

        Inicio.setBackground(null);
        Inicio.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Inicio.setForeground(new java.awt.Color(255, 255, 255));
        Inicio.setText("I N I C I O");
        Inicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Inicio.setContentAreaFilled(false);
        Inicio.setFocusCycleRoot(true);
        Inicio.setFocusPainted(false);
        Inicio.setFocusable(false);
        Inicio.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Inicio.setRolloverEnabled(false);
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        opcoes.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 180, 40));

        Pesquisa.setBackground(null);
        Pesquisa.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Pesquisa.setForeground(new java.awt.Color(255, 255, 255));
        Pesquisa.setText("P E S Q U I S A");
        Pesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Pesquisa.setContentAreaFilled(false);
        Pesquisa.setFocusable(false);
        Pesquisa.setRequestFocusEnabled(false);
        Pesquisa.setRolloverEnabled(false);
        Pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisaActionPerformed(evt);
            }
        });
        opcoes.add(Pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 180, 40));

        Utilitario.setBackground(null);
        Utilitario.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Utilitario.setForeground(new java.awt.Color(255, 255, 255));
        Utilitario.setText("I N T E R A T I V O S");
        Utilitario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Utilitario.setContentAreaFilled(false);
        Utilitario.setFocusable(false);
        Utilitario.setRequestFocusEnabled(false);
        Utilitario.setRolloverEnabled(false);
        Utilitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UtilitarioActionPerformed(evt);
            }
        });
        opcoes.add(Utilitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 180, 40));

        Configuracao.setBackground(null);
        Configuracao.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        Configuracao.setForeground(new java.awt.Color(255, 255, 255));
        Configuracao.setText("Configuração");
        Configuracao.setBorder(null);
        Configuracao.setBorderPainted(false);
        Configuracao.setContentAreaFilled(false);
        Configuracao.setFocusPainted(false);
        Configuracao.setRequestFocusEnabled(false);
        Configuracao.setRolloverEnabled(false);
        Configuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguracaoActionPerformed(evt);
            }
        });
        opcoes.add(Configuracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 180, 30));

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
        opcoes.add(Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 60, 50, 18));

        Lembrete.setBackground(new java.awt.Color(51, 51, 51));
        Lembrete.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Lembrete.setForeground(new java.awt.Color(255, 255, 255));
        Lembrete.setText("A N O T A Ç Õ E S");
        Lembrete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Lembrete.setContentAreaFilled(false);
        Lembrete.setFocusCycleRoot(true);
        Lembrete.setFocusPainted(false);
        Lembrete.setFocusable(false);
        Lembrete.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Lembrete.setRolloverEnabled(false);
        Lembrete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LembreteActionPerformed(evt);
            }
        });
        opcoes.add(Lembrete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 180, 40));

        getContentPane().add(opcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 178, 500));

        frames.setBackground(new java.awt.Color(117, 177, 88));
        frames.setMaximumSize(new java.awt.Dimension(800, 500));
        frames.setLayout(new java.awt.CardLayout());

        jConfig.setBackground(new java.awt.Color(117, 177, 88));
        jConfig.setMaximumSize(new java.awt.Dimension(800, 500));
        jConfig.setMinimumSize(new java.awt.Dimension(800, 500));
        jConfig.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInicio.setBackground(new java.awt.Color(255, 255, 255));
        jInicio.setMaximumSize(new java.awt.Dimension(800, 500));
        jInicio.setMinimumSize(new java.awt.Dimension(800, 510));
        jInicio.setPreferredSize(new java.awt.Dimension(800, 500));
        jInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTING.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconEUA.jpg"))); // NOI18N
        BTING.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTINGActionPerformed(evt);
            }
        });
        jInicio.add(BTING, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 40, 30));

        BTBR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconBrasil.jpg"))); // NOI18N
        BTBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTBRActionPerformed(evt);
            }
        });
        jInicio.add(BTBR, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 40, 30));

        wellcome.setFont(new java.awt.Font("Courier New", 0, 33)); // NOI18N
        wellcome.setForeground(new java.awt.Color(255, 255, 255));
        wellcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wellcome.setText("B E M    V I N D O!");
        wellcome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jInicio.add(wellcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 790, -1));

        NomeD.setBackground(new java.awt.Color(0, 0, 0));
        NomeD.setFont(new java.awt.Font("Courier New", 3, 30)); // NOI18N
        NomeD.setForeground(new java.awt.Color(255, 255, 255));
        NomeD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NomeD.setText("Nome");
        NomeD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jInicio.add(NomeD, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 190, -1));
        NomeD.getAccessibleContext().setAccessibleName("");

        apresentacao.setBackground(new java.awt.Color(0, 0, 0));
        apresentacao.setFont(new java.awt.Font("Courier New", 0, 22)); // NOI18N
        apresentacao.setForeground(new java.awt.Color(255, 255, 255));
        apresentacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apresentacao.setText("<html> <p>\tOlá! Eu sou VIMO, seu <i>Assistente Pessoal.</p>  </html>");
        jInicio.add(apresentacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 800, -1));
        apresentacao.getAccessibleContext().setAccessibleName("<html>\n<p>Fui desenvolvido para auxilia-lo(a) em seu cotidiano, e, com diversas funcionalidades posso desde organiazr suas tarefas a gui-lo(a) dentro de sua própria máquina.</p>\n</html>");

        Dat.setBackground(new java.awt.Color(0, 0, 0));
        Dat.setFont(new java.awt.Font("Gill Sans MT", 0, 22)); // NOI18N
        Dat.setForeground(new java.awt.Color(255, 255, 255));
        Dat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dat.setText("07 / 08 / 2017");
        jInicio.add(Dat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        Dat2.setBackground(new java.awt.Color(0, 0, 0));
        Dat2.setFont(new java.awt.Font("Gill Sans MT", 0, 22)); // NOI18N
        Dat2.setForeground(new java.awt.Color(255, 255, 255));
        Dat2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dat2.setText("15:00");
        jInicio.add(Dat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 150, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/green.jpg"))); // NOI18N
        jInicio.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        jConfig.add(jInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        frames.add(jConfig, "card3");

        jUtilitario.setBackground(new java.awt.Color(111, 177, 88));

        javax.swing.GroupLayout jUtilitarioLayout = new javax.swing.GroupLayout(jUtilitario);
        jUtilitario.setLayout(jUtilitarioLayout);
        jUtilitarioLayout.setHorizontalGroup(
            jUtilitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jUtilitarioLayout.setVerticalGroup(
            jUtilitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        frames.add(jUtilitario, "card6");

        jPesquisa.setBackground(new java.awt.Color(111, 177, 88));

        javax.swing.GroupLayout jPesquisaLayout = new javax.swing.GroupLayout(jPesquisa);
        jPesquisa.setLayout(jPesquisaLayout);
        jPesquisaLayout.setHorizontalGroup(
            jPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPesquisaLayout.setVerticalGroup(
            jPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        frames.add(jPesquisa, "card8");

        jCronograma.setBackground(new java.awt.Color(111, 177, 88));

        javax.swing.GroupLayout jCronogramaLayout = new javax.swing.GroupLayout(jCronograma);
        jCronograma.setLayout(jCronogramaLayout);
        jCronogramaLayout.setHorizontalGroup(
            jCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jCronogramaLayout.setVerticalGroup(
            jCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        frames.add(jCronograma, "card7");

        jLembrete.setBackground(new java.awt.Color(111, 177, 88));

        javax.swing.GroupLayout jLembreteLayout = new javax.swing.GroupLayout(jLembrete);
        jLembrete.setLayout(jLembreteLayout);
        jLembreteLayout.setHorizontalGroup(
            jLembreteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jLembreteLayout.setVerticalGroup(
            jLembreteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        frames.add(jLembrete, "card5");

        jSobre.setBackground(new java.awt.Color(111, 177, 88));

        javax.swing.GroupLayout jSobreLayout = new javax.swing.GroupLayout(jSobre);
        jSobre.setLayout(jSobreLayout);
        jSobreLayout.setHorizontalGroup(
            jSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jSobreLayout.setVerticalGroup(
            jSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        frames.add(jSobre, "card4");

        getContentPane().add(frames, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void UtilitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UtilitarioActionPerformed
        Interativos interativos = new Interativos();
        frames.removeAll();
        frames.add(interativos);
        frames.repaint();
        frames.revalidate();
    }//GEN-LAST:event_UtilitarioActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        Login login = new Login();
        login.setVisible(true);
        login.setResizable(false);
        login.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void ConfiguracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguracaoActionPerformed
        Config configPanel = new Config();
        frames.removeAll();
        frames.add(configPanel);
        configPanel.getInfo(usuario);
        frames.repaint();
        frames.revalidate();
         //Check the Language's buttom clicked in the past, to change the idiom
        if ("USA".equals(this.idiom)) {
          configPanel.Ing();
        } else if ("BRA".equals(this.idiom)) {
          configPanel.BR();
        }
    }//GEN-LAST:event_ConfiguracaoActionPerformed

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed
        Sobre sobre = new Sobre();
        Bancos.BancoDeDados bd = new Bancos.BancoDeDados();
        frames.removeAll();
        frames.add(sobre);
        frames.repaint();
        frames.revalidate();
         //Check the Language's buttom clicked in the past, to change the idiom
        if ("USA".equals(this.idiom)) {
        sobre.en();
      } else if ("BRA".equals(this.idiom)) {
        sobre.br();
      }
    }//GEN-LAST:event_SobreActionPerformed

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        frames.removeAll();
        frames.add(jInicio);
        frames.repaint();
        frames.revalidate();
    }//GEN-LAST:event_InicioActionPerformed

    private void LembreteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LembreteActionPerformed
        Anotacoes lembrete = new Anotacoes();
        lembrete.setUsuario(this.usuario);
        frames.removeAll();
        frames.add(lembrete);
        frames.repaint();
        frames.revalidate();
    }//GEN-LAST:event_LembreteActionPerformed

    private void PesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisaActionPerformed
        Query pesquisa = new Query();
        frames.removeAll();
        frames.add(pesquisa);
        frames.repaint();
        frames.revalidate();
        //Check the Language's buttom clicked in the past, to change the idiom
        if ("USA".equals(this.idiom)) {
        pesquisa.en();
      } else if ("BRA".equals(this.idiom)) {
        pesquisa.br();
      }
    }//GEN-LAST:event_PesquisaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //To put the date of the day 
        Date data = new Date();
        SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy");
        Dat.setText(formato.format(data));
        //To put the hour in real time
        Timer horario = new Timer(1000, new hora());
        horario.start();

    }//GEN-LAST:event_formWindowOpened

    private void BTINGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTINGActionPerformed
        Bancos.BancoDeDados bd = new Bancos.BancoDeDados();
        User usuario = new User();
        this.idiom = "USA";
        en();
    }//GEN-LAST:event_BTINGActionPerformed

    private void BTBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTBRActionPerformed
        Bancos.BancoDeDados bd = new Bancos.BancoDeDados();
        User usuario = new User();
        this.idiom = "BRA";
        br();
    }//GEN-LAST:event_BTBRActionPerformed

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
            java.util.logging.Logger.getLogger(TelaI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaI TA = new TelaI();
                TA.setVisible(true);
                TA.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTBR;
    private javax.swing.JButton BTING;
    private javax.swing.JLabel Background;
    private javax.swing.JButton Configuracao;
    private javax.swing.JLabel Dat;
    private javax.swing.JLabel Dat2;
    private javax.swing.JLabel FotoE;
    private javax.swing.JButton Inicio;
    private javax.swing.JButton Lembrete;
    private javax.swing.JLabel NomeD;
    private javax.swing.JLabel NomeE;
    private javax.swing.JButton Pesquisa;
    private javax.swing.JButton Sair;
    private javax.swing.JButton Sobre;
    private javax.swing.JButton Utilitario;
    private javax.swing.JLabel apresentacao;
    private javax.swing.JPanel frames;
    private javax.swing.JPanel jConfig;
    private javax.swing.JPanel jCronograma;
    private javax.swing.JPanel jInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jLembrete;
    private javax.swing.JPanel jPesquisa;
    private javax.swing.JPanel jSobre;
    private javax.swing.JPanel jUtilitario;
    private javax.swing.JPanel opcoes;
    private javax.swing.JLabel wellcome;
    // End of variables declaration//GEN-END:variables

    class hora implements ActionListener   {
        @Override
        public void actionPerformed(ActionEvent e) {
        Calendar agora = Calendar.getInstance();
        Dat2.setText(String.format("%1$tH:%1$tM:%1$tS",agora));
    }
}
}
