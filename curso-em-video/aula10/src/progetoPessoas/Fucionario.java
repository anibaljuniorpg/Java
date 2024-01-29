package progetoPessoas;

public class Fucionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    public void mudarSetor(String cargo){
        this.setSetor(cargo);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
