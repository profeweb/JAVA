
package algo27;

import java.util.Scanner;


public class Algo27 {


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
        
        int dist = 0;
        
        while(small<big){
            dist = dist + 1;
            small = small + 1;
        }
        
        System.out.println("DISTANCE is "+dist);
        
        
    }
    
}
