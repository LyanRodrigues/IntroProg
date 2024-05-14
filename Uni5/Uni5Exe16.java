package Uni5;

import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double altura, mediaAlturaMulheres = 0, mediaAlturaGrupo = 0;
        int i = 0, j = 0;
        System.out.print("Insira a altura: ");
        altura = scan.nextDouble();

        while (altura != 0){
            
            System.out.print("Insira o genero: (O/F/M) ");
            char genero = scan.next().toUpperCase().charAt(0);
            if (genero == 'O'||genero == 'F'|| genero == 'M'){
                if(genero == 'F'){
                    mediaAlturaMulheres += altura;
                    j++;
                }
                mediaAlturaGrupo += altura;
                System.out.print("Insira a altura: ");
                i++;
                altura = scan.nextDouble();
            }
        }
        System.out.println("\nMEDIA DE ALTURA DO GRUPO: " + (mediaAlturaGrupo/i) + "\nMEDIA DE ALTURA DAS MULHERES: " + (mediaAlturaMulheres/j));
        scan.close();
    }
}

