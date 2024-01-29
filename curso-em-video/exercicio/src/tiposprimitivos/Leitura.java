package tiposprimitivos;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite sua nota: ");
        float nota = input.nextFloat();
        System.out.printf("O aluno %s tirou a nota %.2f", nome, nota);

    }
}
