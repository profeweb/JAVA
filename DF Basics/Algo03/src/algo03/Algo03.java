
package algo03;

import java.util.Scanner;


public class Algo03 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter A value: ");
        int a = input.nextInt();
        
        System.out.print("Enter B value: ");
        int b = input.nextInt();
        
        System.out.print("Enter C value: ");
        int c = input.nextInt();
        
        int d = b - 4*a*c;
        
        if(d>=0){
            
            double r1 = (-b+Math.sqrt(d))/(2*a);
            double r2 = (-b-Math.sqrt(d))/(2*a);
            
            System.out.println("R1: "+r1);
            System.out.println("R2: "+r2);
        }
        else {
            System.out.println("No real solutions!!");
        }
    }
    
}
