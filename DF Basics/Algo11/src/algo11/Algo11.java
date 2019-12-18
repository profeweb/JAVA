
package algo11;

import java.util.Scanner;

public class Algo11 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter AGE value: ");
        int age = input.nextInt();
      
        
        if(age > 17){
            System.out.println("Welcome!!");
        }
        else {
            System.out.println("Sorry. Not allowed");
        }
        
    }
    
}
