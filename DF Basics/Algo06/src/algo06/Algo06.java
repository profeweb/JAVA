
package algo06;

import java.util.Scanner;


public class Algo06 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter A value: ");
        int a = input.nextInt();
        
        System.out.print("Enter B value: ");
        int b = input.nextInt();
        
        int min = a;
        
        if(a > b){
            min = b;
        }
        
        System.out.println("MINIM: "+min);
    }
    
}
