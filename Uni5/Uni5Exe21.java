package Uni5;

public class Uni5Exe21 {
    public static void main(String[] args) {
        double altChico = 1.50, altZe = 1.10;
        int contAnos = 0;

        while (altChico >= altZe){
            altChico = altChico + 0.02;
            altZe = altZe + 0.03;
            contAnos++;
        }
        System.out.println(contAnos);
    }
}
