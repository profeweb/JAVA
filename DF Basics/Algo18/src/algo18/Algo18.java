
package algo18;

import java.util.Scanner;


public class Algo18 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter N value: ");
        int n = input.nextInt();
        
        int index = 1;
        while(index<= n){
            int x = 2*index - 1;
            System.out.println(x);
            index = index + 1;
        }
    }
    
}
