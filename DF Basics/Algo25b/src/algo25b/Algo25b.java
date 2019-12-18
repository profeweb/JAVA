
package algo25b;

import java.util.Scanner;

public class Algo25b {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N value: ");
        int n = input.nextInt();

        int value = 1;
        for(int index = 1;index <= n; index++) {
            value = index * value;
        }

        System.out.println("Factorial of " + n + " is " + value);
    }
    
}
