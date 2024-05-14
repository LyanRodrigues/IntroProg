package beecrowd;

import java.util.Scanner;

public class exe1001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("INSIRA VALOR DE A:");
        int A = scan.nextInt();
        System.out.print("\nINSIRA VALOR DE B:");
        int B = scan.nextInt();

        int X = A+B;
        System.out.println("X = "+ X);
        scan.close();
    }

}
