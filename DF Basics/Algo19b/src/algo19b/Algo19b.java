
package algo19b;

import java.util.Scanner;


public class Algo19b {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter N value: ");
        int n = input.nextInt();
        int x = 1;
        
        for(int index = 1;index<= n; index++){
            x = 2*x;
            System.out.println(x);
        }
    }
    
}
