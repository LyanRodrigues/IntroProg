package Uni5;

import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        
        System.out.print("massa em kg: ");
        double massaIn = scan.nextDouble(), massaFinal = 0;
        int i = 1;

        massaFinal = massaIn * 1000;

        while (massaFinal > 0.5){
            massaFinal = massaFinal / 2;
            i++;
        }
        System.out.println("massa inicial: " + (massaIn*1000) + " gramas\nmassa final: "+ massaFinal + " gramas\ntempo: " + ((i-1)*50) + " segundos");
        scan.close();
    }   
}
