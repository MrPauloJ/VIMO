package Bancos;
public class User {
    private String usuario;
    private String senha;
    private String sexo;
    private String Email;
    private int id;
    private String Idioma;
    private String Imagem;
    //Construct method
    public User(){
    }
    public User(String user, String senha, String sexo, String email, int id, String idioma, String imagem){
        this.usuario= user;
        this.senha = senha;
        this.sexo = sexo;
        this.Email = email;
        this.id = id;
        this.Idioma = idioma;
        this.Imagem = imagem;
    }
    public String getIdioma() {
        return Idioma;
    }
    public void setIdioma(String Idioma) {
        if(this.usuario.isEmpty()){
            this.usuario="geral";
        }
        this.Idioma = Idioma;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    //Getters and Setters Methods
    public String getUsuario() {
        return this.usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getEmail() {
        return this.Email;
    }
    public void setEmail(String email) {
        this.Email = email;
    }

    public String getImagem() {
        return Imagem;
    }

    public void setImagem(String imagem) {
        this.Imagem = imagem;
    }
}