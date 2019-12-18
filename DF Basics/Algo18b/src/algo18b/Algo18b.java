
package algo18b;

import java.util.Scanner;

public class Algo18b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter N value: ");
        int n = input.nextInt();
        
        for(int index = 1; index <= n; index++){
            int x = 2*index - 1;
            System.out.println(x);
        }
    }
    
}
