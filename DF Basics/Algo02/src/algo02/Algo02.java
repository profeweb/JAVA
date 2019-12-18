
package algo02;

import java.util.Scanner;


public class Algo02 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        while(num!=-1){
            sum = sum + num;
            System.out.print("Enter a number: ");
            num = input.nextInt();
        }
        
        System.out.println("SUM: "+sum);
        
    }
    
}
