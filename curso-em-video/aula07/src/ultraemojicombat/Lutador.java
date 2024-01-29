package ultraemojicombat;

public class  Lutador implements Controlador {
    //Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    //Funçoes
    @Override
    public void apresentar() {
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome() +
                "\nDiretamente de " + this.getNacionalidade() +
                "\nCom " + this.getIdade() + "anos e" + this.getAltura() + "de altura" +
                "\nPesando " + this.getPeso() + "Kg\n" +
                this.getVitorias() + " Vitorias\n" +
                this.getDerrotas() + " Derrotas\n" +
                this.getEmpates() + " Empates");
    }

    @Override
    public void status() {
        System.out.println(this.getNome() + " é um peso " + this.categoria +
        "\nGanhou " + this.getVitorias() + " vezes" +
        "\nPerdeu " + this.getDerrotas() + " vezes" +
        "\nEmpatou " + this.getEmpates() + " vezes");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    public Lutador(String no, String na, float pe, float al, int id, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.vitorias = vi;
        this.empates = em;
        this.setPeso(pe);
        this.altura = al;
    }
    //Metodos Especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso() > 52.2) {
            this.categoria = "Invalido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() <=83.9) {
            this.categoria = "Medio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
}
