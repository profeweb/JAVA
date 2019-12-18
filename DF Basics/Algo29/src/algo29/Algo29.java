
package algo29;

import java.util.Scanner;


public class Algo29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N value: ");
        int n = input.nextInt();
        
        int total = 0;
        int num = 2;
        
        while(total<n){
            
            int index = 2;
            boolean prime = true;

            while(index < num){
                if(num%index==0){
                    prime = false;
                    index = n;
                }
                index = index + 1;
            }

            if(prime == true){
                System.out.println(num);
                total = total + 1;
            }
            num = num + 1;
        }
    }
    
}
