package projetoyoutube;

public class Aula15 {
    public static void main(String[] args) {
        //Exemplo de como usar o pacote projetoyoutube
        //Criando objetos da classe Video
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        v[2].play();
        v[0].play();
        v[0].like();
        v[0].like();
        // criando objetos da classe Gafanhoto
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Junior", 19, "Macho", "juninplay@gmail.com");
        g[1] = new Gafanhoto("Joao Matheus", 25, "Menino", "joaomatheus@gmail.com");
        //Criando objetos da classe Vizualizacao
        Vizualizacao vis[] = new Vizualizacao[5];
        vis[0] = new Vizualizacao(g[0], v[1]); //Junior assiti Aula 12 de PHP
        vis[0].avaliar(5);
        System.out.println(vis[0].toString());

        vis[1] = new Vizualizacao(g[1], v[0]);
        vis[1].avaliar(15.43f);


        System.out.println(vis[1].toString());

    }
}
