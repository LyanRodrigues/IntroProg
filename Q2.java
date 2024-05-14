import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double  paciente,
                a1=0, b1=0, c1=0,
                maiorPeso, menorPeso, medioPeso;

        for (int i = 1; i <= 3; i++){
            System.out.println("informe o peso do paciente " + i );
            paciente = scan.nextDouble();
            if (i == 1){
                a1 = paciente;
            } else if (i == 2){
                b1 = paciente;       
            } else {
                c1 = paciente;   
            }
        }
        if (a1 >= b1 && a1 >= c1){
            maiorPeso = a1;
            if (b1 >= c1){
                medioPeso = b1;
                menorPeso = c1;
            } else {
                medioPeso = c1;
                menorPeso = b1;
            }
        } else if (b1 >= a1 && b1 >= c1){
            maiorPeso = b1;
            if (a1 >= c1){
                medioPeso = a1;
                menorPeso = c1;
            } else {
                medioPeso = c1;
                menorPeso = a1;
            }
        } else {
            maiorPeso = c1;
            if (b1 >= a1){
                medioPeso = b1;
                menorPeso = a1;
            } else {
                medioPeso = a1;
                menorPeso = b1;
            }
        }
        System.out.println("_Menu:\n a) Peso do paciente mais magro\n b) Peso do paciente com mais peso\n c) Pesos impressos em ordem decrescente(mais alto para o mais baixo)\n d) Média dos pesos\n \n Sua resposta: ");
        String escolha = scan.next();
        scan.close();
        switch (escolha) {
            case "a":
                System.out.println("___Peso do paciente mais magro: " + menorPeso);
                break;
            case "b":
                System.out.println("___Peso do paciente com mais peso: " + maiorPeso);
                break;
            case "c":
                System.out.println("___Pesos impressos em ordem decrescente: \n" + maiorPeso +" "+ medioPeso +" "+ menorPeso + "");
                break;
            case "d":
                System.out.println("___Media dos pesos: " + ((maiorPeso + medioPeso + menorPeso)/3));
                break;
            default:
                break;
        }
    }
}
