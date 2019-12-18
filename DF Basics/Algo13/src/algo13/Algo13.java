
package algo13;

import java.util.Scanner;

public class Algo13 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter H value: ");
        int h = input.nextInt();
        
        System.out.print("Enter B value: ");
        int b = input.nextInt();
        
        int perimeter = 2*b + 2*h;
        
        System.out.println("PERIMETER: "+ perimeter);
    }
    
}
