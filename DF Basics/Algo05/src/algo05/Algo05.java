
package algo05;

import java.util.Scanner;


public class Algo05 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter NUM tickets: ");
        int num = input.nextInt();
        
        int p;
        
        if(num<5){
            p = 5;
        }
        else {
            if(num<10){
                p = 4;
            }
            else {
                p = 3;
            }
        }
        int price = p * num;
        System.out.println("TOTAL PRICE: "+price);
    }
    
}
