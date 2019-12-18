
package algo16;

import java.util.Scanner;


public class Algo16 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter A value: ");
        int a = input.nextInt();
        
        System.out.print("Enter B value: ");
        int b = input.nextInt();
        
        int product = a;
        
        int times = b;
        
        while(times>1){
            product = product + a;
            times = times - 1;
        }
        
        System.out.println("Product is "+product);
    }
    
}
