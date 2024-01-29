package aula13;

public class Mamifero extends Animal{
    protected String corPele;
    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }
}
