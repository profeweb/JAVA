
package algo32;

import java.util.Scanner;

public class Algo32 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int max = 0;

        System.out.print("Enter NUM value: ");
        int num = input.nextInt();
        
        while(num!=0){
            
            if(num>max){
                max = num;
            }
            
            System.out.print("Enter NUM value: ");
            num = input.nextInt();
        }
        
        System.out.println("MAXIMUM is "+max);
    }
    
}
