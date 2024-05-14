package Uni5;

public class Uni5Exe04 {
    /*
     * Descreva um algoritmo para calcular o valor de S dado por:
     * 
     * S = 3/2 + 5/6 + 7/12 + 9/20 + 11/30 + ...
     * 
     * Considere os 20 primeiros termos da série.
     */
    public static void main(String[] args) {
        double nom = 3, den = 2, aux = 4, S = 0;
        for (int i = 1; i <= 20; i++){
            nom += 2.0;
            den += aux;
            aux += 2.0;

            S += (nom/den);
        }
        System.out.println(S);
    }
}
