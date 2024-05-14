package Uni5;

import java.util.Scanner;

public class Uni5Exe08a {
    /*
     * Descreva um algoritmo que leia um número inteiro n e, dados n números
     * inteiros, descreva um algoritmo que:
     * 
     * escreva o menor valor negativo;
     * escreva a média dos números positivos.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escreva a quantidade de numeros que deseja informar: ");
        int x = scan.nextInt();
        double menor = Double.POSITIVE_INFINITY, media = 0;
        int numPos = 0;

        for(int i = 0; i <= x - 1; i++){
            System.out.print("informe o valor "+ (i+1) + ": ");
            int val = scan.nextInt();
            
            if (val < menor && val < 0){
                menor = val;
            } else if (val >= 0){
                numPos++;
                media = media + val;
            }
        }
        System.out.println("menor: "+ menor + "\nmédia dos num positivos: " + (media/numPos));
        scan.close();
    }
}
