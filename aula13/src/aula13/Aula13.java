package aula13;

public class Aula13 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.setCorPele("moreno");
        c.reagir("ola");
        c.reagir(true);
        c.reagir(4, 5.4f);
        c.emitirSom();
    }
}
