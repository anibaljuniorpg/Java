package aula12;

public class Peixe extends Animal{
    private String corEscama;

    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Substancias");
    }

    @Override
    public void emiteSom() {
        System.out.println("peixe não tem som");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
