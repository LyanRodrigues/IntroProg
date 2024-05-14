package Uni5;

import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont4 = 0, cont5 = 0, cont9 = 0, cont12 = 0, totPessoas = 0;

        System.out.print("Digite o número do canal (0 para finalizar): ");
        int canal = scan.nextInt();

        while (canal != 0) {
            System.out.print("Digite o número de pessoas assistindo: ");
            int numPessoas = scan.nextInt();

            if (canal == 4) {
                cont4 += numPessoas;
                totPessoas += numPessoas;
            } else if (canal == 5) {
                cont5 += numPessoas;
                totPessoas += numPessoas;
            } else if (canal == 9) {
                cont9 += numPessoas;
                totPessoas += numPessoas;
            } else if (canal == 12) {
                cont12 += numPessoas;
                totPessoas += numPessoas;
            } else {
                System.out.println("Canal inválido.");
            }
            

            System.out.print("Digite o número do canal (0 para finalizar): ");
            canal = scan.nextInt();
        }
        double perc4 = (totPessoas > 0) ? (cont4 / (double) totPessoas) * 100 : 0;
        double perc5 = (totPessoas > 0) ? (cont5 / (double) totPessoas) * 100 : 0;
        double perc9 = (totPessoas > 0) ? (cont9 / (double) totPessoas) * 100 : 0;
        double perc12 = (totPessoas > 0) ? (cont12 / (double) totPessoas) * 100 : 0;

        // Exibir resultados
        System.out.printf("Percentual de audiência do canal 4: %.2f%%\n", perc4);
        System.out.printf("Percentual de audiência do canal 5: %.2f%%\n", perc5);
        System.out.printf("Percentual de audiência do canal 9: %.2f%%\n", perc9);
        System.out.printf("Percentual de audiência do canal 12: %.2f%%\n", perc12);

        scan.close();
    }
}
