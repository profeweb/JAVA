
package algo10;

import java.util.Scanner;


public class Algo10 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter R value: ");
        int r = input.nextInt();
        
        double area = Math.PI*r*r;
     
        System.out.println("AREA: "+area);
    }
    
}
