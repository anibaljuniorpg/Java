package ultraemojicombat;

import java.util.Random;

public class Lutar {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int roudes;
    private boolean aprovado;
    //Funçoes

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2){
            this.aprovado = true;
            this.setDesafiante(l1);
            this.setDesafiado(l2);
        } else {
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar(){
        if (this.aprovado){
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("### RESULTADO DA LUTA ###");
            switch (vencedor){
                case 0: //empate
                    System.out.println("EMPATOU!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //desafiante vence
                    System.out.println("Venceu " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2: //desafiado vence
                    System.out.println("Venceu " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
            }
        }
    }

    //Metodos especias

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRoudes() {
        return roudes;
    }

    public void setRoudes(int roudes) {
        this.roudes = roudes;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
