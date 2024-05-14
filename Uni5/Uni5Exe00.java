package Uni5;

import java.util.Scanner;

public class Uni5Exe00 {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner (System.in);

        int i, j = 0;
        double pot = 0, val = 0;
        String linha = "---------------------------------";
        String limpar = "\n\n\n\n\n";
        do{
        System.out.print(limpar+linha + "\na qual valor vc deseja que seja elevado?\nSua resposta: ");
        try {
            val = scan.nextInt();
        } catch (Exception e) {
            System.out.println("escreva um valor com , ou um inteiro");
        }
        System.out.println(linha);

        for( i = 1; i <= 5; i++){
            pot = Math.pow(i, val);
            System.out.println(i + "^"+ val+ " = " + pot);
        }
        System.out.println(linha+"\ncont = "+ i+"\n"+linha);

        System.out.println("deseja elevar outro numero? (s/n)");
        String choice = scan.next().toLowerCase();
        
        if (!choice.equals("s")||!choice.equals("sim")){
            j = 1;
            System.out.println("programa encerrando...");
        } else {
            throw new Exception("escreva N ou S");
        }
        } while ( j == 0);
    }
}