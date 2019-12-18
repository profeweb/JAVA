
package algo31;

import java.util.Scanner;

public class Algo31 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A value: ");
        int a = input.nextInt();
        
        System.out.print("Enter B value: ");
        int b = input.nextInt();
        
        int up = a;
        int down = b;
        
        while(up<=down){
            System.out.println(up);
            System.out.println(down);
            up = up + 1;
            down = down -1;
        }
    }
    
}
