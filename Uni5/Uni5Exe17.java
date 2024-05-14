package Uni5;

import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numInsc = 0, numInscMax = 0, numInscMin = 0, i = 0;
        double altura = 0, alturaMax = 0, alturaMin = 999, mediaAltura = 0;
    
        System.out.print("--------------------\nInsira o numero de inscrição: ");
        numInsc = scan.nextInt();

        while (numInsc != 0){
            System.out.print("Insira a altura: ");
            altura = scan.nextDouble();

            if (altura >= alturaMax){
                alturaMax = altura;
                numInscMax = numInsc;
            }
            if (altura <= alturaMin){
                alturaMin = altura;
                numInscMin = numInsc;
            }

            mediaAltura += altura;
            System.out.print("--------------------\nInsira o numero de inscrição: ");
            i++;
            numInsc = scan.nextInt();
        }
        System.out.println("------------------------\n<<<ATLETA MAIS ALTO>>> \nNUMERO DE INSCRIÇÃO: " + numInscMax + "\nALTURA: " + alturaMax + "\n---------------------------------\n<<<ATLETA MAIS BAIXO>>>" + "\nNUMERO DE INSCRIÇÃO: "+ numInscMin + "\nALTURA: " + alturaMin + "\n--------------------------\nMEDIA DE ALTURA DO GRUPO: " + (mediaAltura/i));
        scan.close();
    }
}
