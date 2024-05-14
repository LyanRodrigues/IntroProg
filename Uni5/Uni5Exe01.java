package Uni5;

import java.util.Scanner;
public class Uni5Exe01 {
    /*
     * Descreva um algoritmo que leia 20 números inteiros e escreva,
     * para cada número lido, se o mesmo é par ou ímpar. 
     */
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        
        int num = 0;

        for (int i = 0; i <= 20; i++){
            num = scan.nextInt();
            if ((num % 2) == 0){
                System.out.println("numero par");
            } else {
                System.out.println("numero impar");
            }
        }
        scan.close();
    }   
}