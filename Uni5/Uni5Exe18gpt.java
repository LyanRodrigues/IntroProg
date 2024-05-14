package Uni5;

import java.util.Scanner;

public class Uni5Exe18gpt {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        // Inicializar variáveis
        int totalPessoas4 = 0,totalPessoas5 = 0, totalPessoas9 = 0, totalPessoas12 = 0, totalPessoas = 0;

        while (true) {
            // Ler número do canal e número de pessoas
            System.out.print("Digite o número do canal (0 para finalizar): ");
            int canal = scanner.nextInt();
            if (canal == 0) {
                break;
            }

            System.out.print("Digite o número de pessoas assistindo: ");
            int numPessoas = scanner.nextInt();

            // Atualizar contadores baseados no canal informado
            switch (canal) {
                case 4:
                    totalPessoas4 += numPessoas;
                    break;
                case 5:
                    totalPessoas5 += numPessoas;
                    break;
                case 9:
                    totalPessoas9 += numPessoas;
                    break;
                case 12:
                    totalPessoas12 += numPessoas;
                    break;
                default:
                    System.out.println("Canal inválido.");
                    continue;
            }

            // Atualizar o total de pessoas assistindo
            totalPessoas += numPessoas;
        }

        // Calcular percentuais
        double percentual4 = (totalPessoas > 0) ? (totalPessoas4 / (double) totalPessoas) * 100 : 0;
        double percentual5 = (totalPessoas > 0) ? (totalPessoas5 / (double) totalPessoas) * 100 : 0;
        double percentual9 = (totalPessoas > 0) ? (totalPessoas9 / (double) totalPessoas) * 100 : 0;
        double percentual12 = (totalPessoas > 0) ? (totalPessoas12 / (double) totalPessoas) * 100 : 0;

        // Exibir resultados
        System.out.printf("Percentual de audiência do canal 4: %.2f%%\n", percentual4);
        System.out.printf("Percentual de audiência do canal 5: %.2f%%\n", percentual5);
        System.out.printf("Percentual de audiência do canal 9: %.2f%%\n", percentual9);
        System.out.printf("Percentual de audiência do canal 12: %.2f%%\n", percentual12);
    }
}
