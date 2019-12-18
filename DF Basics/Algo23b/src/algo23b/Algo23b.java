
package algo23b;

import java.util.Scanner;

public class Algo23b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter N value: ");
        int n = input.nextInt();
        
        for(int index = 1;index<=10; index++){
            int value = index*n;
            System.out.println(n+"x"+index+"="+value);
        }
    }
    
}
