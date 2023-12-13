package progetoPessoas;

public class Aluno extends Pessoa{
    private int matre;
    private String curso;
    public void cancelarMatricula(){
        System.out.println("Cancelando matricula");
    }

    public int getMatre() {
        return matre;
    }

    public void setMatre(int matre) {
        this.matre = matre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
