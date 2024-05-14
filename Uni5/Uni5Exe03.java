package Uni5;

public class Uni5Exe03 {
    /*
     * Descreva um algoritmo que calcule e escreva a soma da
     * seguinte série de 100 termos:
     * 
     *  1/1 + 1/2 + 1/3 + 1/4 + ... + 1/100
     */
    public static void main(String[] args) {
        double soma = 0;
        for (int i = 1; i <= 100; i++){
            soma += (1.0 / i);
        }
        System.out.println("Soma = " + soma);
    }
}
