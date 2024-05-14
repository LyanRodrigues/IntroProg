package Uni5;

import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String alunoNome = "null";
        double n1, n2;
        
        System.out.print("\n-------------------------\nNome do aluno: "); 
        alunoNome = scan.next();

        while (!alunoNome.equals("fim")){

            System.out.print("Nota 1: ");
            n1 = scan.nextDouble();
            System.out.print("Nota 2: ");
            n2 = scan.nextDouble();
            System.out.print("---------------------------\nMédia: " + (n1 + n2)/2.0);

            System.out.print("\n-------------------------\nNome do aluno: ");
            alunoNome = scan.next();
        }
        scan.close();
    }
}
