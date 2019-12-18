
package algo28;

import java.util.Scanner;


public class Algo28 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N value: ");
        int n = input.nextInt();
        
        int index = 2;
        boolean prime = true;
        
        while(index < n){
            if(n%index==0){
                prime = false;
                index = n;
            }
            index = index + 1;
        }
        
        if(prime == true){
            System.out.println(n+" és primer.");
        }
        else {
            System.out.println(n+" no és primer.");
        }
    }
    
}
