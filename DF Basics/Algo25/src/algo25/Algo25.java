
package algo25;

import java.util.Scanner;

public class Algo25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter N value: ");
        int n = input.nextInt();
        
        int index = 1;
        int value = 1;
        
        while(index<=n){
            value = index*value;
            index = index + 1;
        }
        
        System.out.println("Factorial of "+n+" is "+value);
    }
    
}
