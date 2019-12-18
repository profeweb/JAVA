
package algo22;

import java.util.Scanner;


public class Algo22 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter NUM value: ");
        double num = input.nextDouble();
        
        double sum = 0.0;
        double count = 0.0;
        
        while(num!= -1){
            sum = sum + num;
            count = count + 1;
            System.out.print("Enter NUM value: ");
            num = input.nextDouble();
        }
        
        double average = sum / count;
        System.out.println("Average is "+average);
    }
    
}
