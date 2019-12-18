
package algo35;

import java.util.Scanner;


public class Algo35 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A value: ");
        int a = input.nextInt();
        
        System.out.print("Enter B value: ");
        int b = input.nextInt();
        
        int q = 0;
        int r = a;
        
        while(r>=b){
            r = r - b;
            q = q + 1;
        }
        
        System.out.println("Quocient: "+q+", Reste: "+r);
    }
    
}
