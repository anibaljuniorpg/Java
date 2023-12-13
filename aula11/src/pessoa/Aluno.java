package pessoa;

public class Aluno extends Pessoa {
    private String curso;
    private boolean matricula;

    public void pagarMensal(){
        System.out.println("Mensaalidade paga com sucesso! ");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }
}
