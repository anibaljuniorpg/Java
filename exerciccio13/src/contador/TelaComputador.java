package contador;

import javax.swing.*;
import java.util.Scanner;

public class TelaComputador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o inicio: ");
        int i = teclado.nextInt();
        System.out.print("Digite o final: ");
        int f = teclado.nextInt();
        System.out.print("Digite o passo: ");
        int p = teclado.nextInt();

        DefaultListModel Lista = new DefaultListModel();

        for (int cc = i; cc <= f; cc += p) {
            System.out.println(cc);
            lista.addElement(cc);
        }

        }
    }
