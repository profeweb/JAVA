
package algo21;

import java.util.Scanner;

public class Algo21 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter X value: ");
        int x = input.nextInt();
        
        System.out.print("Enter N value: ");
        int n = input.nextInt();
        
        int value = 1;
        int index = 1;
        
        while(index<= n){
            System.out.println(value);
            value = -1*x*value;
            index = index + 1;
        }
    }
    
}
