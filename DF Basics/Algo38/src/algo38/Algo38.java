
package algo38;

import java.util.Scanner;

public class Algo38 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter D value (Kilometers): ");
        double d = input.nextDouble();
        
        double m = d / 1.6093;
        
        System.out.println(d+" kilometers are "+m+ " miles.");
    }
    
}
