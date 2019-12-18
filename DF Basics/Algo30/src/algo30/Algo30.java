
package algo30;

import java.util.Scanner;

public class Algo30 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N value: ");
        int n = input.nextInt();
        
        int factor = 2;
        int resta = n;
        
        System.out.print(n+" = ");
        
        while(resta>factor){
            if(resta%factor==0){
                resta = resta / factor;
                System.out.print(factor+"*");
            }
            else {
                factor = factor + 1;
            }
        }
        
        System.out.print(factor);
    }
    
}
