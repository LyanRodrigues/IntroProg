package Uni5;

import java.util.Scanner;

public class Uni5Exe32b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Em qual dia da semana começa o mês?: ");
        int diaAtual = scan.nextInt(), i = 0, j = 0, dia = 0;
        System.out.print("Quantos dias tem o mês?: ");
        int diasMes = scan.nextInt();
        String pulaDiaAtual = "|    ";

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
        while (dia >= diasMes && (j % 7 != 0)){
            System.out.print(pulaDiaAtual);
            j++;
        }
    }
}