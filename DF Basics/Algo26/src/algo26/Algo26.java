
package algo26;

import java.util.Scanner;


public class Algo26 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A value: ");
        int a = input.nextInt();
        
        System.out.print("Enter B value: ");
        int b = input.nextInt();
        
        int small, big;
        
        if(a < b){
            small = a;
            big = b;
        }
        else {
            small = b;
            big = a;
        }
        
        while(small<big){
            big = big - 1;
            small = small + 1;
        }
        
        if(small == big){
            System.out.println("MIDDLE is "+big);
        }
        else {
            System.out.println("MIDDLE is "+(big+0.5));
        }
    }
    
}
