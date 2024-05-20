package Uni5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int diaAtual = 0, diasMes = 0;
        boolean validInput = false;

        // Input for the starting day of the week
        while (!validInput) {
            try {
                System.out.print("Em qual dia da semana começa o mês (1-Domingo, 2-Segunda,..., 7-Sábado)?: ");
                diaAtual = scan.nextInt();
                if (diaAtual < 1 || diaAtual > 7) {
                    throw new IllegalArgumentException("Dia da semana inválido. Por favor, insira um valor entre 1 e 7.");
                }
                validInput = true; // Valid input received, exit the loop
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scan.next(); // Clear the invalid input
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        validInput = false; // Reset for the next input

        // Input for the number of days in the month
        while (!validInput) {
            try {
                System.out.print("Quantos dias tem o mês (28-31)?: ");
                diasMes = scan.nextInt();
                if (diasMes < 28 || diasMes > 31) {
                    throw new IllegalArgumentException("Número de dias do mês inválido. Por favor, insira um valor entre 28 e 31.");
                }
                validInput = true; // Valid input received, exit the loop
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scan.next(); // Clear the invalid input
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        String pulaDiaAtual = "|    ";
        int i = 0, j = 0, dia;

        System.out.println("____________________________________");
        System.out.println("|_DO_|_SE_|_TE_|_QA_|_QI_|_SX_|_SA_|");
        while (i < diaAtual - 1) {
            System.out.print(pulaDiaAtual);
            i++;
        }
        for (dia = 1; dia <= diasMes; dia++) {
            j = dia + diaAtual - 2;
            if (j % 7 == 0) {
                System.out.print("|");
                System.out.println();
            }
            if (dia < 10) {
                System.out.print("| 0" + dia + " ");
            } else {
                System.out.print("| " + dia + " ");
            }
        }
        while (dia >= diasMes && (j % 7 != 0)) {
            System.out.print(pulaDiaAtual);
            j++;
        }
        System.out.println("|"); // Ensure the final row is closed properly
    }
}
