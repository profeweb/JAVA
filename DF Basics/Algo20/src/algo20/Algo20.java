
package algo20;

import java.util.Scanner;

public class Algo20 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter N value: ");
        int n = input.nextInt();
        
        int a = 0;
        int b = 1;
        int index = 2;
        
        while(index<= n){
            int x = a + b;
            a = b;
            b = x;
            System.out.println(x);
            index = index + 1;
        }
    }
    
}
