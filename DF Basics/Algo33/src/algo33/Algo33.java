
package algo33;

import java.util.Scanner;

public class Algo33 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int min = 100000000;

        System.out.print("Enter NUM value: ");
        int num = input.nextInt();
        
        while(num!=0){
            
            if(num<min){
                min = num;
            }
            
            System.out.print("Enter NUM value: ");
            num = input.nextInt();
        }
        
        System.out.println("MINIMUM is "+min);
    }
    
}
