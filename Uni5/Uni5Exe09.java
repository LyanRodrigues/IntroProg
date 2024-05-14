package Uni5;

import java.util.Scanner;

public class Uni5Exe09 {
    /*
     * Descreva um algoritmo que leia um número inteiro n e, dados n números
     * inteiros, descreva um algoritmo que:
     * 
     * escreva o menor valor negativo;
     * escreva a média dos números positivos.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escreva a quantidade de alunos da turma: ");
        int x = scan.nextInt();
        int acimaDe20 = 0;

        for(int i = 0; i <= x - 1; i++){
            System.out.print("informe o nome do aluno "+ (i+1) + ": ");
            String nome = scan.next();
            System.out.print("informe a idade do aluno "+ (i+1) + ": ");
            int idade = scan.nextInt();
            if (idade == 18){
                System.out.println(nome);
            } else if (idade > 20){
                acimaDe20++;
            }
        }
        System.out.println("alunos com idade acima de 20: " + acimaDe20);
        scan.close();
    }
}
