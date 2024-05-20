package Uni5;

import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contTrecho = 0, contPedAbusivo = 0, contDistancia = 0;
        double dist = 0, valorPedagio;

        System.out.print("\n===============================================\nDigite o valor do pedagio: ");
        valorPedagio = scan.nextDouble();

        while (valorPedagio >= 0) {
            System.out.print("Digite a distancia do trecho: ");
            dist = scan.nextDouble();
            contTrecho++;

            if (valorPedagio > 7.00) {
                contPedAbusivo++;
            }
            if (dist > 150.0) {
                contDistancia++;
            }

            System.out.print("--------------------------------------------\nDigite o valor do pedagio: ");
            valorPedagio = scan.nextDouble();
        }
        System.out.println("===============================================\n-----------------<<Relatório>>----------------- \nQuantidade de pedágios abusivos: " + contPedAbusivo + "\nQuantidade de trechos: " + contTrecho + "\nDistancia: " + contDistancia + "\n===============================================\n" );
    }
}
