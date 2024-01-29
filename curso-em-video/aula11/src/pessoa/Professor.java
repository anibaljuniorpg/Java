package pessoa;

public class Professor extends Pessoa{
    private String cargo;
    private float salario;

    public void receberAumento(float valor){
        this.salario += valor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
