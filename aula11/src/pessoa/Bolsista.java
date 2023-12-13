package pessoa;

public final class Bolsista extends Aluno {
    private float bolsa;
    @Override
    public void pagarMensal(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }
}
