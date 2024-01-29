package progetoPessoas;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Professor p2 = new Professor();
        Aluno p3  = new Aluno();
        Fucionario p4 = new Fucionario();

        p1.setNome("junior");
        p2.setNome("Anibal");
        p3.setNome("Jose");
        p4.setNome("Adriane");

        p4.setSexo("F");
        p1.setSexo("M");

        p1.toString();
        p2.toString();
        p3.toString();
        p4.toString();
    }
}
