
package algo34;

import java.util.Scanner;


public class Algo34 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A value: ");
        int a = input.nextInt();
        
        System.out.print("Enter B value: ");
        int b = input.nextInt();
        
        int n = a;
        int k = 0;
        
        while(n<=b){
            int index = a + k;
            while(index<=n){
                System.out.print(index+" ");
                index = index + 2;
            }
            k = (k + 1)%2;
            n = n + 1;
            System.out.println("");
        }
    }
    
}
