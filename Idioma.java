package Bancos;
public class Idioma {
    //Login's Screen
    private String apelidoLogin;
    private String EntrarDLogin;
    private String SenhaLogin;
    private String SairLogin;
    private String EntrarELogin;
    private String CadastroELogin;
    private String Sobre;
    public String getApelidoLogin() {
        return apelidoLogin;
    }
    public String getEntrarDLogin() {
        return EntrarDLogin;
    }
    public String getSenhaLogin() {
        return SenhaLogin;
    }
    public String getSairLogin() {
        return SairLogin;
    }
    public String getEntrarELogin() {
        return EntrarELogin;
    }
    public String getCadastroELogin() {
        return CadastroELogin;
    }
    public String getSobre() {
        return Sobre;
    }
    //Principal's Screen
    private String wellcomeTP;   
    private String TextTP;
    private String sairTP;
    private String InicioTP;
    private String LembreteTP;
    private String CronogramaTP;
    private String UtilitarioTP;
    private String PesquisaTP;
    private String ConfiguracaoTP;
    public String getWellcomeTP() {
        return wellcomeTP;
    }
    public String getTextTP() {
        return TextTP;
    }
    public String getSairTP() {
        return sairTP;
    }
    public String getInicioTP() {
        return InicioTP;
    }
    public String getLembreteTP() {
        return LembreteTP;
    }
    public String getCronogramaTP() {
        return CronogramaTP;
    }
    public String getUtilitarioTP() {
        return UtilitarioTP;
    }
    public String getConfiguracaoTP() {
        return ConfiguracaoTP;
    }
    public String getPesquisaTP(){
        return this.PesquisaTP;
    }  
    //Configuration's Screen
    private String NomeC;
    private String SenhaC;
    private String SexoC;
    private String masculinoc;
    private String femininoc;
    private String EmailC;
    private String AltFotoC;    
    private String Remover;
    private String Mudanças;

    public String getNomeC() {
        return NomeC;
    }

    public String getSenhaC() {
        return SenhaC;
    }

    public String getSexoC() {
        return SexoC;
    }

    public String getMasculinoc() {
        return masculinoc;
    }

    public String getFemininoc() {
        return femininoc;
    }

    public String getEmailC() {
        return EmailC;
    }

    public String getAltFotoC() {
        return AltFotoC;
    }

    public String getRemover() {
        return Remover;
    }

    public String getMudanças() {
        return Mudanças;
    }
    //Query's Screen
    private String PesqGoogle;
    private String PesqYoutube;
    
    public String getPesqGoogle() {
        return PesqGoogle;
    }

    public String getPesqYoutube() {
        return PesqYoutube;
    }
    // About's Screen 
    private String Text1;
    private String Text2;
    private String Text3;
    private String Text4;
    private String Text5;
    private String Text6;
    private String Text7;
    private String Text8;
    private String Text9;

    public String getText1() {
        return Text1;
    }

    public String getText2() {
        return Text2;
    }

    public String getText3() {
        return Text3;
    }

    public String getText4() {
        return Text4;
    }

    public String getText5() {
        return Text5;
    }

    public String getText6() {
        return Text6;
    }

    public String getText7() {
        return Text7;
    }

    public String getText8() {
        return Text8;
    }

    public String getText9() {
        return Text9;
    }

    public void English(){
    //Login
    this.apelidoLogin = "N I C K";
    this.EntrarDLogin = "L O G I N";
    this.SenhaLogin = "P A S S W O R D";
    this.SairLogin = "E X I T";
    this.EntrarELogin = "L O G I N";
    this.CadastroELogin = "R E G I S T E R";
    this.Sobre = "About  us";
    //Principal
    this.wellcomeTP = "Welcome!";   
    this.TextTP = "Hello! I'm VIMO, your personal assistant";
    this.sairTP = "Log Out";
    this.InicioTP = "H O M E";
    this.LembreteTP = "N O T E";
    this.CronogramaTP = "S C H E D U L E";
    this.UtilitarioTP = "O U T T O O L";
    this.PesquisaTP = "S E A R C H";
    this.ConfiguracaoTP = "Configuration";
    //Configuration
    this.NomeC = "N I C K";
    this.SenhaC = "P A S S W O R D";
    this.SexoC = "G E N D E R";
    this.masculinoc= "Male";
    this.femininoc = "Female";
    this.EmailC = "E - M A I L";
    this.AltFotoC = "S E L E C T  P I C T U R E";
    this.Remover = "R E M O V E R   U S E R";
    this.Mudanças = "S A V E   C H A N G E S";
    //Query
    this.PesqGoogle = "S E A R C H";
    this.PesqYoutube = "S E A R C H";
    //About
    this.Text1 = "<html><p>Hey, you can call me VIMO, or, Viva o mundo Organizadamente (Live a organized world). I'm a project developed by four IT students to give support for everyone, in extreme cases, to those sloppy ones.</P></html>";
    this.Text2 = "I'll help you with features like:";
    this.Text3 = "- Notepad";
    this.Text4 = "- Creating schedules";
    this.Text5 = "- Getting dates through Online Researches" ;
    this.Text6 = "- To kill time and to offer the best performance to your device";
    this.Text7 = "We'll work together to end your issue and organize all your pendencies";
    this.Text8 = "No more delay, now it's up to you VIMORS!";
    this.Text9 = "Developers: Almir Melo, João Henrique, Nelson Cunha e Paulo Francisco.";
        
    }
    
    public void ptbr(){
    //Login
    this.apelidoLogin = "A P E L I D O";
    this.EntrarDLogin = "E N T R A R";
    this.SenhaLogin = "S E N H A";
    this.SairLogin = "S A I R";
    this.EntrarELogin = "E N T R A R";
    this.CadastroELogin = "C A D A S T R A R";
    this.Sobre = "Sobre";
    //Principal
    this.wellcomeTP = "Bem Vindo!";   
    this.TextTP = "Olá! Eu sou VIMO, Seu Assistente Pessoal";
    this.sairTP = "Sair";
    this.InicioTP = "I N I C I O";
    this.LembreteTP = "A N O T A Ç Õ E S";
    this.CronogramaTP = "C R O N O G R A M A";
    this.UtilitarioTP = "I N T E R A T I V O";
    this.PesquisaTP = "P E S Q U I S A";
    this.ConfiguracaoTP = "Configuração";
    //Configuration
    this.NomeC = "A P E L I D O";
    this.SenhaC = "S E N H A";
    this.SexoC = "S E X O";
    this.masculinoc = "masculino";
    this.femininoc = "feminino";
    this.EmailC = "E - M A I L";
    this.AltFotoC = "A L T E R A R  I M A G E M";
    this.Remover = "R E M O V E R  U S U Á R I O";
    this.Mudanças = "S A L V A R  A L T E R A Ç Õ E S";
    //Query
    this.PesqGoogle = "P E S Q U I S A R";
    this.PesqYoutube = "P E S Q U I S A R";
    //About
    this.Text1 = "<html> <p> Olá, meu nome é V.I.M.O, ou, VIva o Mundo Organizadamente. Sou um projeto desenvolvido por quatro estudantes de informática para dar suporte a todos, e em casos mais extremos, àqueles desleixados.</p>  </html>";
    this.Text2 = "auxiliarei-o com funcionalidades como:";
    this.Text3 = "- Blocos de anotações.";
    this.Text4 = "- Criações de cronogramas.";
    this.Text5 = "- Obtenção de dados através de pesquisas online." ;
    this.Text6 = "- Com passatempos e melhoria de performance da sua máquina.";
    this.Text7 = "Trabalharemos juntos para acabar com seus problemas e organizar todas suas pendencias.";
    this.Text8 = "Sem mais atrasos, agora so depende de vocês VIMORS!";
    this.Text9 = "Desenvolvedores: Almir Melo, João Henrique, Nelson Cunha e Paulo Francisco.";
    }
    
    }
