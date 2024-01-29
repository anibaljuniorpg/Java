package aula05;

public class ContaBanco {
    //Atributos
    private int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //Metodos Personalizados
    public void situacao(){
        System.out.println("-----------------------------------");
        System.out.println("Conta:" + getNumConta());
        System.out.println("Dono: " + getDono());
        System.out.println("Tpo: " + getTipo());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("conta em depito");
        } else {
            System.out.println("Conta fechada com sucesso!");
            this.setStatus(false);
        }
    }
    public void depositar(int v){
        if (this.getStatus()){
            System.out.println("deposito realizado com sucesso!");
            setSaldo(getSaldo() + v);
        }
    }
    public void sacar(int v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                System.out.println("SAque realizado com sucesso!");
                this.setSaldo(this.getSaldo() + v);
            }
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso!");
        }
    }
    //Metodos Especiais

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
