package aula12;

public class Ave extends Animal{
    private String corPena;

    public void fazerNinho(){
        System.out.println("fazendo ninho");
    }
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Sementes");
    }

    @Override
    public void emiteSom() {
        System.out.println("Som de ave");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
