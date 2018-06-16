package Bancos;
import java.sql.*;
import javax.swing.JOptionPane;
import java.io.File;
import Bancos.User;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import Panel.Cadastro;
public class BancoDeDados {
    private Connection Conex;
    private PreparedStatement Sttm;
    private ResultSet Rsltst;
    private boolean acesso=false;
    private String pathDB = "C:\\Vimo\\Banco.db";
    private File fileDB = new File(pathDB);
    public BancoDeDados(){
    }
//Cmd
    public synchronized static String execCommand() throws IOException {
                String result=null;
		Process p;
		BufferedReader input;
                String comandos[]={
                        "cmd /c chdir C:\\",
                        " cmd/c mkdir Vimo"
                    };
                try {
			p = Runtime.getRuntime().exec(String.join(" & ", comandos));
			input = new BufferedReader(new InputStreamReader(p.getInputStream()));
                        input.readLine();
		} catch (Exception e) {}
		return result;
	}
  public synchronized static String execImage() throws IOException {
      Cadastro cad = new Cadastro();
      String result = null;
      Process p;
      BufferedReader input;
      String comandos = "copy " + cad.Caminho +" C:\\Vimo";
      try {
	p = Runtime.getRuntime().exec(comandos);
	input = new BufferedReader(new InputStreamReader(p.getInputStream()));
        input.readLine();
	} catch (Exception e) {}
		return result;
  }
    // To create the DataBase
    public void CriarBD(){ 
        if(!fileDB.exists()){
        try {
         Class.forName("org.sqlite.JDBC");
         Conex = DriverManager.getConnection("jdbc:sqlite:"+ pathDB);
         String Sql = "CREATE TABLE Cadastro("
                 +"Id INTEGER PRIMARY KEY AUTOINCREMENT,"
                 +"Imagem Varchar(500),"
                 + "Nick VARCHAR(15) NOT NULL, "
                 + "Password VARCHAR(20) NOT NULL, "
                 + "Sexo VARCHAR(3) NOT NULL, "
                 + "Email VARCHAR(50) NOT NULL, "
                 + "Lembrete1 Varchar(500),"
                 + "Lembrete2 Varchar(500),"
                 + "Lembrete3 Varchar(500),"
                 + "Lembrete4 Varchar(500),"
                 + "Lembrete5 Varchar(500),"
                 + "Lembrete6 Varchar(500),"
                 + "Lembrete7 Varchar(500),"
                 + "Lembrete8 Varchar(500),"
                 + "Lembrete9 Varchar(500),"
                 + "Lembrete10 Varchar(500),"
                 + "Lembrete11 Varchar(500),"
                 + "Lembrete12 Varchar(500))";
            Sttm=Conex.prepareStatement(Sql);
            Sttm.execute();
            Sttm.close();
            Conex.close();
        }  catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "DataBase's Error!");
        }
        }
    }
    //Register's Procedure 
    public void Cadastrar(User usuario){
        try {
         if(fileDB.length()<=0){
             fileDB.delete();
         }
         if(!fileDB.exists()){
             try {
                execCommand();
            } catch (IOException ex) {
                Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
            }
         CriarBD();
         }
         Conex = DriverManager.getConnection("jdbc:sqlite:"+ pathDB);
         String Sql = "INSERT INTO Cadastro(Nick, Password, Sexo, Email, Imagem) VALUES (?, ?, ?, ?,?)";
         Sttm = Conex.prepareStatement(Sql);
         Sttm.setString(1,usuario.getUsuario());
         Sttm.setString(2,usuario.getSenha());
         Sttm.setString(3,usuario.getSexo());
         Sttm.setString(4,usuario.getEmail());
         Sttm.setString(5,usuario.getImagem());
            try {
                execImage();
            } catch (IOException ex) {
                Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
            }
         Sttm.execute();
         Sttm.close();
         Conex.close();
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso.");
        }  catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "Error.");
        }
    }
    //Login's Procedure
    public void Login (User usuario){
        try {
        if(fileDB.length()<=0){
             fileDB.delete();
         }
         if(!fileDB.exists()){
         JOptionPane.showMessageDialog(null, "Você não possui o cadastro !");
         CriarBD();
         }
         Conex = DriverManager.getConnection("jdbc:sqlite:" + pathDB);
         String Sql = "SELECT * FROM Cadastro WHERE Nick=? AND Password=?";
         Sttm = Conex.prepareStatement(Sql);
         Sttm.setString(1,usuario.getUsuario());
         Sttm.setString(2,usuario.getSenha());
         Rsltst = Sttm.executeQuery();
         if(Rsltst.next()){
                this.acesso=true;
         }else{
             this.acesso=false;
             JOptionPane.showMessageDialog(null, "Acesso Negado!");
         }
         Sttm.close();
         Conex.close();
        }  catch (HeadlessException | SQLException e) {
            this.acesso=false;
            JOptionPane.showMessageDialog(null, "Erro no código!");
        }
    }
    //Insert Img's Procedure
    public void InsertImg(String caminho, int id){
        try{
         if(fileDB.length()<=0){
             fileDB.delete();
         }
         if(!fileDB.exists()){
             try {
                execCommand();
            } catch (IOException ex) {
                Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
            }
         CriarBD();
         }}
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error ");
        }
        try{
        Conex = DriverManager.getConnection("jdbc:sqlite:" + pathDB);
        String Sql = "UPDATE Cadastro SET Imagem=(?) where Id=(?)";
        Sttm = Conex.prepareStatement(Sql);
        Sttm.setString(1, caminho);
        Sttm.setInt(2, id);
        Sttm.executeUpdate();
        Sttm.close();
        Conex.close();
        } catch (SQLException e){
        JOptionPane.showMessageDialog(null, "Error IMG");
        }
    }
    
    public String getImagem(int id){
        String retorno=null;
        String Sql="SELECT Imagem FROM Cadastro WHERE Id=(?)";
        try{
            Conex = DriverManager.getConnection("jdbc:sqlite:" + pathDB);
            Sttm = Conex.prepareStatement(Sql);
            Sttm.setInt(1, id);
            Rsltst = Sttm.executeQuery();
            while(Rsltst.next()){
                retorno = Rsltst.getString("Imagem");
            }
            if(retorno==null){
                retorno= "C:\\Vimo\\IconUsuarioG.jpg";
            }
            Sttm.close();
            Conex.close();
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erro getImagem");
        }
    return retorno;
    }
    
    //Note's Procedures
    public void SetLembrete (String j, String lemb, String nome){
      try{
      Conex = DriverManager.getConnection("jdbc:sqlite:"+pathDB);
      String Sql= "UPDATE Cadastro SET " + j + " = ? WHERE Nick=?";
      Sttm = Conex.prepareStatement(Sql);
      Sttm.setString(1, lemb);
      Sttm.setString(2, nome);
      Sttm.executeUpdate();
      Sttm.close();
      Conex.close();
    } catch (Exception e){
    JOptionPane.showMessageDialog(null, "You have been hacked !!");
    }    
    }
    public String getLembrete (String indexLembrete, String nomeUsuario){
      String lembrete=null;
      try{
      Conex = DriverManager.getConnection("jdbc:sqlite:"+fileDB);
      String Sql = "SELECT "+indexLembrete+" FROM Cadastro WHERE Nick=?";
      Sttm = Conex.prepareStatement(Sql);
      Sttm.setString(1, nomeUsuario);
      Rsltst=Sttm.executeQuery();
      while(Rsltst.next()){
          lembrete=Rsltst.getString(indexLembrete);
      }
      Sttm.close();
      Conex.close();
    } catch (Exception e){
    JOptionPane.showMessageDialog(null, "You have been hacked !!");
    }    
    return lembrete;
    }
    // Main
    public static void main(){
    System.out.println("Hackeamento inicializado!");
    }
    //Procedure to confirm the acess, if is allowed or denied.
    public boolean acesso(){
        return this.acesso;
    }
    //Procedure to delete the User
    public void DeletarUser(User usuario){
        try{
        Conex = DriverManager.getConnection("jdbc:sqlite:" + pathDB);
        String Sql = "DELETE FROM Cadastro WHERE Nick = ?";
        Sttm = Conex.prepareStatement(Sql);
        Sttm.setString(1,usuario.getUsuario());
        Sttm.execute();
        Sttm.close();
        Conex.close();
        JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        }
        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "You have been hacked !! SE FUDEU!");
        }
    }
    // To search for the User
    public User pesqUsuario(String nomeUsuario){
        User usuario = new User();
        try{
         Conex = DriverManager.getConnection("jdbc:sqlite:"+pathDB);
         String Sql = "SELECT * FROM Cadastro WHERE Nick = ?";
         Sttm = Conex.prepareStatement(Sql);
         Sttm.setString(1,nomeUsuario);
         Rsltst =  Sttm.executeQuery();
         while(Rsltst.next()){
             usuario.setId(Integer.parseInt(Rsltst.getString("Id")));
             usuario.setImagem(Rsltst.getString("Imagem"));
             usuario.setUsuario(Rsltst.getString("Nick"));
             usuario.setSenha(Rsltst.getString("Password"));
             usuario.setEmail(Rsltst.getString("Email"));
             usuario.setSexo(Rsltst.getString("Sexo"));
             usuario.setIdioma(Rsltst.getString("Idioma"));
         }
         Sttm.close();
         Conex.close();
        }
        catch(Exception e){
        }
        return usuario;
    }
    // To Update Informations about the User to transfer to Config
    public void updateInfo(User usuario){
        try{
         Conex = DriverManager.getConnection("jdbc:sqlite:"+pathDB);
         String Sql = "UPDATE Cadastro SET Nick=?, Password=?, Sexo=?, Email=?, Imagem=? WHERE Id=?";
         this.Sttm = this.Conex.prepareStatement(Sql);
         this.Sttm.setString(1,usuario.getUsuario());
         this.Sttm.setString(2,usuario.getSenha());
         this.Sttm.setString(3,usuario.getSexo());
         this.Sttm.setString(4,usuario.getEmail());
         this.Sttm.setString(5,usuario.getImagem());
         this.Sttm.setInt(6,usuario.getId());
         this.Sttm.executeUpdate();
         this.Sttm.close();
         this.Conex.close();
         JOptionPane.showMessageDialog(null, "Salvo com sucesso !");
        }
        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Deu merda");
        }
    }
}