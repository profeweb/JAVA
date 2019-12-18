
package algo15;

import java.util.Scanner;


public class Algo15 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Temperature value (ºC): ");
        double tempC = input.nextDouble();
        
        double tempF = ((5.0/9.0)*tempC) + 32.0;
        
        System.out.println("Temperature in ºF is "+tempF);
    }
    
}
