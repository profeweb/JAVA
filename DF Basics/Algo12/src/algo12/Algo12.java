
package algo12;

import java.util.Scanner;


public class Algo12 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter N value (1-100): ");
        int n = input.nextInt();
        
        int bottom = 1;
        int top = 100;
        int m = (bottom+top)/2;
        
        while(n!=m){
            if(n<m){
                top = m;
                System.out.println("The number is smaller than "+m);
            }
            else {
                bottom = m;
                System.out.println("The number is bigger than "+m);
            }
            m = (bottom+top)/2;
        }
        
        System.out.println("The number N is "+m);
    }
    
}
