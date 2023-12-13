package atitimeticos.Operadores;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner escreve = new Scanner(System.in);
        System.out.print("Seu ano de nascimento: ");
        int ano = escreve.nextInt();
        int idade = 2023 - ano;
        String r;
        r = ((idade >+ 16 && idade <= 18 ) || (idade>70))?"È opcioal": "Naõ é opcional";
        System.out.println(r);

    }
}
