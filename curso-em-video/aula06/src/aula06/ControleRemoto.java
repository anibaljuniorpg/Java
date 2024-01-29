package aula06;

public class ControleRemoto implements Controlador {
    //Atributos
    public int volume;
    public boolean ligado;
    public boolean tocando;
    //Metodos Especias
    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //Metodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirmenu() {
        System.out.println("Esta ligado? " + getLigado());
        System.out.println("Esta tocando? " + getTocando());
        System.out.print("Volume: " + getVolume());
        for (int i = 0; i <= this.getVolume(); i +=10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharmenu() {
        System.out.println("Fechando o Menu!");
    }

    @Override
    public void maisvolume() {
        if (this.getLigado()){
            this.setVolume(getVolume() + 5);
        }
    }

    @Override
    public void menosvolume() {
        if (getLigado()){
            this.setVolume(getVolume() - 5);
        }
    }

    @Override
    public void ligarmudo() {
        if (getLigado() && getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarmudo() {
        if (getLigado() && getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            setTocando(false);
        }
    }
    //Metodos Abstratos

}
