package Uni5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Uni5Exe08b {
    /*
     * Descreva um algoritmo que leia um número inteiro n e, dados n números
     * inteiros, descreva um algoritmo que:
     * 
     * escreva o menor valor negativo;
     * escreva a média dos números positivos.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escreva a quantidade de números que deseja informar: ");
        int x = 0;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                x = scan.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número inteiro válido.");
                scan.nextLine(); // Limpa o buffer do scanner
            }
        }
        
        double menor = Double.POSITIVE_INFINITY, media = 0;
        int numPos = 0;

        for (int i = 0; i < x; i++) {
            System.out.print("Informe o valor " + (i + 1) + ": ");
            try {
                int val = scan.nextInt();

                if (val < menor && val < 0) {
                    menor = val;
                } else if (val >= 0) {
                    numPos++;
                    media += val;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número inteiro válido.");
                scan.nextLine(); // Limpa o buffer do scanner
                i--; // Volta uma iteração para que o usuário possa tentar novamente
            }
        }

        if (numPos > 0) {
            System.out.println("Menor valor negativo: " + menor);
            System.out.println("Média dos números positivos: " + (media / numPos));
        } else {
            System.out.println("Não foram fornecidos números positivos.");
        }
        
        scan.close();
    }
}
