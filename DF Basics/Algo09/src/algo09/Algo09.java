
package algo09;

import java.util.Scanner;


public class Algo09 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter H value: ");
        int h = input.nextInt();
        
        System.out.print("Enter B value: ");
        int b = input.nextInt();
        
        int area = b * h;
        
        System.out.println("AREA: "+area);
    }
    
}
