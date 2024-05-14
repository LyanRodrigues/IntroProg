package Uni5;

import java.util.Scanner;

public class Uni5Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero, n1, n2, n3, n4, aux, primeira, segunda, soma, calculo;

        numero = scanner.nextInt();

        n1 = numero / 1000;
        aux = numero % 1000;
        n2 = aux / 100;
        aux = aux % 100;
        n3 = aux / 10;
        n4 = aux % 10;

        primeira = (n1 * 10) + n2;
        segunda = (n3 * 10) + n4;
        soma = primeira + segunda;
        calculo = (int) Math.pow(soma, 2);

        if (calculo == numero) {
            System.out.println("O NUMERO POSSUI TAL CARACTERISTICA");
        } else {
            System.out.println("O NUMERO NAO POSSUI TAL CARACTERISTICA");
        }

        scanner.close();
    }
}
