
package algo23;

import java.util.Scanner;

public class Algo23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter N value: ");
        int n = input.nextInt();
        
        int index = 1;
        while(index<=10){
            int value = index*n;
            System.out.println(n+"x"+index+"="+value);
            index = index + 1;
        }
    }
    
}
