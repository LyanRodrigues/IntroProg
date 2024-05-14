package Uni5;

import java.util.Scanner;

public class Uni5Exe07 {
    /*
     * Descreva um algoritmo que leia um número inteiro n e,
     * dados n números reais informe o maior e o menor número.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escreva a quantidade de numeros que deseja informar: ");
        int x = scan.nextInt();
        double menor = Double.POSITIVE_INFINITY, maior = Double.NEGATIVE_INFINITY;

        for(int i = 0; i <= x - 1; i++){
            System.out.print("informe o valor "+ (i+1) + ": ");
            int val = scan.nextInt();
            
            if (val >= maior){
                maior = val;
            } else
            if (val <= menor){
                menor = val;
            }
        }
        System.out.println("maior: " + maior + "\nmenor: "+menor);
        scan.close();
    }
}
