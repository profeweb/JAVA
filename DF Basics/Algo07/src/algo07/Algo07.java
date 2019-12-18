
package algo07;

import java.util.Scanner;


public class Algo07 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter A value: ");
        int a = input.nextInt();
        
        System.out.print("Enter B value: ");
        int b = input.nextInt();
        
        int max = a;
        
        if(a < b){
            max = b;
        }
        
        System.out.println("MAXIMUM: "+max);
    }
    
}
