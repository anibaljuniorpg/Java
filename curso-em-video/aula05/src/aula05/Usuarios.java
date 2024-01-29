package aula05;

public class Usuarios {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.abrirConta("CP");
        p1.setDono("Junior");
        p1.setNumConta(2132);
        p1.depositar(60);
        p1.situacao();
    }
}
