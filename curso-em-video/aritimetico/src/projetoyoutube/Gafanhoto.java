package projetoyoutube;

public class Gafanhoto extends Pessoa{
    //Atributos
    private String login;
    private int totAssistido;
    //Metodo construtor
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
    }
    //Metodos Get e Set dos Atributos

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    //Metodo toString
    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }
}
