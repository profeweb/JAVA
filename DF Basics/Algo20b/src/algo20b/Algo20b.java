
package algo20b;

import java.util.Scanner;

public class Algo20b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter N value: ");
        int n = input.nextInt();
        
        int a = 0;
        int b = 1;
        for(int index = 2;index<= n; index++){
            int x = a + b;
            a = b;
            b = x;
            System.out.println(x);
        }
    }
    
}
