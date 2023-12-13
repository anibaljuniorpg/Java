package aula12;

public class Cachorro extends Mamifero {
    public void enterrarOsso(){
        System.out.println("Enterrando Osso");
    }
    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }

    @Override
    public void emiteSom(){
        System.out.println("AU AU AU");
    }
}
