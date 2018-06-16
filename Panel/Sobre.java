package Panel;
import Bancos.*;
public class Sobre extends javax.swing.JPanel {
    public Sobre() {
        initComponents();
    }
    // Change to English Idiom
 public void en(){
     Idioma idioma = new Idioma();
     idioma.English();
     Text1.setText(idioma.getText1());
     Text2.setText(idioma.getText2());
     Text3.setText(idioma.getText3());
     Text4.setText(idioma.getText4());
     Text5.setText(idioma.getText5());
     Text6.setText(idioma.getText6());
     Text7.setText(idioma.getText7());
     Text8.setText(idioma.getText8());
     Text9.setText(idioma.getText9());
 }
   // Change to Portuguese Idiom
 public void br(){
     Idioma idioma = new Idioma();
     idioma.ptbr();
     Text1.setText(idioma.getText1());
     Text2.setText(idioma.getText2());
     Text3.setText(idioma.getText3());
     Text4.setText(idioma.getText4());
     Text5.setText(idioma.getText5());
     Text6.setText(idioma.getText6());
     Text7.setText(idioma.getText7());
     Text8.setText(idioma.getText8());
     Text9.setText(idioma.getText9());
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        Text4 = new javax.swing.JLabel();
        Text5 = new javax.swing.JLabel();
        Text6 = new javax.swing.JLabel();
        Text7 = new javax.swing.JLabel();
        Text8 = new javax.swing.JLabel();
        Text9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(1, 50, 33));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(null);
        Titulo.setFont(new java.awt.Font("Courier New", 2, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("<html> <p>V I M O</p>  </html>");
        Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, -1));

        Text1.setBackground(null);
        Text1.setFont(new java.awt.Font("Courier New", 0, 17)); // NOI18N
        Text1.setForeground(new java.awt.Color(255, 255, 255));
        Text1.setText("<html> <p> Olá, meu nome é V.I.M.O, ou, VIva o Mundo Organizadamente. Sou um projeto desenvolvido por quatro estudantes de informática para dar suporte a todos, e em casos mais extremos, àqueles desleixados.</p>  </html>");
        Text1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 770, 80));
        Text1.getAccessibleContext().setAccessibleName("<html> <p>Olá, meu nome é V.I.M.O, ou, VIva o Mundo Organizadamente, sou um projeto desenvolvido por quatro estudantes de informática para dar suporte a todos, e em casos mais extremos, àqueles mais desleixados.</p>  </html>");

        Text2.setBackground(null);
        Text2.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        Text2.setForeground(new java.awt.Color(255, 255, 255));
        Text2.setText("<html> <p>Auxiliarei-o em funcionalidades como:</p>  </html>");
        add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 530, -1));

        Text3.setBackground(null);
        Text3.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        Text3.setForeground(new java.awt.Color(255, 255, 255));
        Text3.setText("<html> <p> - Blocos de anotações.</p>  </html>");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 470, -1));

        Text4.setBackground(null);
        Text4.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        Text4.setForeground(new java.awt.Color(255, 255, 255));
        Text4.setText("<html> <p> - Criações de cronogramas.</p>  </html>");
        add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 560, -1));

        Text5.setBackground(null);
        Text5.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        Text5.setForeground(new java.awt.Color(255, 255, 255));
        Text5.setText("<html> <p>- Obtenção de dados através de pesquisas online.</p>  </html>");
        add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 560, -1));

        Text6.setBackground(null);
        Text6.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        Text6.setForeground(new java.awt.Color(255, 255, 255));
        Text6.setText("<html> <p> - Com passatempos e melhoria de performace da sua máquina.</p>  </html>");
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 31));

        Text7.setBackground(null);
        Text7.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        Text7.setForeground(new java.awt.Color(255, 255, 255));
        Text7.setText("<html> <p> Trabalharemos juntos para acabar com seus problemas e organizar todas suas pendencias.</p>  </html>");
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 740, 60));

        Text8.setBackground(null);
        Text8.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        Text8.setForeground(new java.awt.Color(255, 255, 255));
        Text8.setText("<html> <p>Sem mais atrasos, agora so depende de vocês <i>VIMORS!</i></p>  </html>");
        add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 580, -1));

        Text9.setBackground(null);
        Text9.setFont(new java.awt.Font("Courier New", 0, 17)); // NOI18N
        Text9.setForeground(new java.awt.Color(255, 255, 255));
        Text9.setText("<html> <p>\tDesenvolvedores: Almir Melo, João Henrique, Nelson Cunha e Paulo Francisco.</p>  </html>");
        add(Text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 760, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/green.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel Text9;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
