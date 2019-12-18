
package algo19;

import java.util.Scanner;

public class Algo19 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter N value: ");
        int n = input.nextInt();
        
        int index = 1;
        int x = 1;
        
        while(index<= n){
            x = 2*x;
            System.out.println(x);
            index = index + 1;
        }
    }
    
}
