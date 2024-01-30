package projetoyoutube;

public class Vizualizacao {
    //Atributos com objeto da Classe Video e Gafanhoto
    private Video filma;
    private Gafanhoto telespectador;
    //Metodo construtor adicionando viws no video e totAssistido no gafanhoto
    public Vizualizacao(Gafanhoto telespectador,Video filma) {
        this.filma = filma;
        this.telespectador = telespectador;
        this.telespectador.setTotAssistido(this.telespectador.getTotAssistido() + 1);
        this.filma.setViews(this.filma.getViews() + 1);
    }
    //Metodo Avaliar com Assinaturas diferentes
    public void avaliar(){
        this.filma.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filma.setAvaliacao(nota);
    }

    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20){
            //this.filma.setAvaliacao(2);
            tot = 2;
        } else if (porc <=50) {
            //this.filma.setAvaliacao(5);
            tot = 5;
        } else if (porc <= 90) {
            //this.filma.setAvaliacao(8);
            tot = 8;
        } else {
            //this.filma.setAvaliacao(10);
            tot = 10;
        }
        this.filma.setAvaliacao(tot);
    }
    //Metodos Gets e Sets
    public Video getFilma() {
        return filma;
    }

    public void setFilma(Video filma) {
        this.filma = filma;
    }

    public Gafanhoto getTelespectador() {
        return telespectador;
    }

    public void setTelespectador(Gafanhoto telespectador) {
        this.telespectador = telespectador;
    }
    //Metodo toString
    @Override
    public String toString() {
        return "Avaliacao{" +
                "filma=" + filma +
                ", telespectador=" + telespectador +
                '}';
    }
}
