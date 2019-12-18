
package algo14;

import java.util.Scanner;


public class Algo14 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Temperature value (ºF): ");
        double tempF = input.nextDouble();
        
        double tempC = (5.0/9.0)*(tempF - 32.0);
        
        System.out.println("Temperature in ºC is "+tempC);
    }
    
}
