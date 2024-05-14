package Uni5;

import java.util.Scanner;
public class Uni5Exe06 {
    /*
    * Descreva um algoritmo que leia a altura de 20 
    * pessoas e calcule a média de altura das mesmas.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double altura = 0, media = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("insira sua altura");
            altura = scan.nextDouble();

            media += altura;
        }
        System.out.println("media = " + media / 20);
        scan.close();
    }
}
