package Bancos;
import java.sql.*;
import javax.swing.JOptionPane;
public class teste {
    private Connection Conex;
    private PreparedStatement Sttm;
    private ResultSet Rsltst;
    private boolean acesso=false;
    private String pathDB = "C:\\Vimo\\Banco.db";
    public void teste(){
        String lembrete=null;
        try{
          Conex = DriverManager.getConnection("jdbc:sqlite:"+pathDB);
          String Sql = "SELECT * FROM Cadastro";
        Sttm = Conex.prepareStatement(Sql);
        Rsltst=Sttm.executeQuery();
        for(int i=0; i<=5;i++){
        while(Rsltst.next()){
            System.out.println(Rsltst.getString("Id"));
            System.out.println(Rsltst.getString("Nick"));
            System.out.println(Rsltst.getString("Imagem"));
            System.out.println("-------");
      }}
      Sttm.close();
      Conex.close();
    } catch (Exception e){
    JOptionPane.showMessageDialog(null, "You have been hacked !!");
    }    
    }
}
