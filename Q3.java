import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("__Digite uma letra: ");
        String letra = scan.next().toUpperCase();

        if(letra.equals("A")){
            System.out.println("Alfa");
        } else if (letra.equals("B")){
            System.out.println("Beta");
        } else if (letra.equals("G")){
            System.out.println("Gama");
        } else {
            System.out.println("Entrada Incorreta");
        }
    }
}
