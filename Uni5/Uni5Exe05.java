package Uni5;

import java.util.Scanner;

public class Uni5Exe05 {
    /*
     * Descreva um algoritmo que escreva os n primeiros 
     * termos da seguinte sequência de números:
     * 
     * 8, 10, 16, 18, 32, 34, 64, ...
     * 
     * O valor n deve ser lido e deve ser maior do que 2.
     */
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("insira o valor de n");
        int limite = scan.nextInt();
        int a = 8, b = 0, i = 0;
        System.out.print(a + ", ");
        for ( i = 1; i <= limite-1;){ 
            b = a;
            i++;
            System.out.print((a += 2) + ", ");
            b = b * 2;
            i++;
            System.out.print(b + ", ");
            a = b;
        }
        System.out.println("...");
        scan.close();
    }
    
}
