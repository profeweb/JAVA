
package algo37;

import java.util.Scanner;

public class Algo37 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter D value (Miles): ");
        double d = input.nextDouble();
        
        double q = d * 1.6093;
        
        System.out.println(d+" miles are "+q+ " kilometers.");
    }
    
}
