package Uni5;

public class Uni5Exe02 {
    /*
     * Descreva um algoritmo que calcule e escreva a soma dos
     * números pares e a soma dos números ímpares entre 1 e 100.
     */
    public static void main(String[] args) { 
        
        int num = 1, pares = 0, impares = 0;

        for (int i = 1; i <= 100; i++){
            if ((num % 2) == 0){
                pares = pares + num;
                num++;
            } else {
                impares = impares + num;
                num++;
            }
        }
        System.out.println("pares: " + pares + "\nimpares: " + impares);
    }   
}