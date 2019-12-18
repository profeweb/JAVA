
package algo21b;

import java.util.Scanner;

public class Algo21b {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter X value: ");
        int x = input.nextInt();
        
        System.out.print("Enter N value: ");
        int n = input.nextInt();
        
        int value = 1;
        for(int index = 1;index<= n; index++){
            System.out.println(value);
            value = -1*x*value;
        }
    }
    
}
