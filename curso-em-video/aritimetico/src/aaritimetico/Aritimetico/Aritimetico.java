package aaritimetico.Aritimetico;

import java.lang.Math;
import java.util.Scanner;

public class Aritimetico {
    public static void main (String[] args) {
        System.out.println("Super calculadora");
        System.out.print("Informe um numero: ");
        Scanner escreve = new Scanner(System.in);
        int num = escreve.nextInt();
        System.out.println("Voce escreu o numero " + num);
        int resto = num % 2;
        int raiz = (int) Math.sqrt(num);
        int cubica = (int) Math.cbrt(num);
        System.out.println(raiz);
        System.out.println(cubica);
    }
}
