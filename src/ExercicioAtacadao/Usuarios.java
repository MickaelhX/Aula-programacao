package ExercicioAtacadao;

public class Usuarios {
    private String login;
    private String senha;

//Metodo construtor
    public Usuarios(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    public boolean Verificacao(String senha){
        return this.senha.equals(senha);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
