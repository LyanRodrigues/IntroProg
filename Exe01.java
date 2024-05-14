import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        /*
         * int Terra = 15, Marte = 20, Jupiter = 30;
         * int Planetas = (Marte + Jupiter+ Terra)/3;
         * System.out.println(Planetas);
         * 
         * String p1 = "A Terra tem ", p2 = " vezes o tamanho de Marte";
         * int num = 4;
         * String frase = p1 + num + p2;
         * System.out.println(frase);
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("int a: ");
        int a = teclado.nextInt();
        System.out.println("int b: ");
        int b = teclado.nextInt();

        int f1 = (a + b) * (a - b),
                f2 = (a * a) + (2 * a * b) + (b * b),
                f3 = (a * a) - (2 * a * b) + (b * b),
                f4 = (a + b) * ((a * a) - (a * b) + (b * b));

        System.out.println("form1: " + f1
                + "\nform2: " + f2
                + "\nform3: " + f3
                + "\nform4: " + f4);
        teclado.close();
    }
}
