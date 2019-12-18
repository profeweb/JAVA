
package algo36;

import java.util.Scanner;

public class Algo36 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int pos = 0, neg = 0, odd = 0, even = 0;

        System.out.print("Enter N value: ");
        int n = input.nextInt();
                
        while(n!=0){
            
            if(n>=0){
                pos = pos + 1;
            }
            else {
                neg = neg + 1;
            }
            
            if(n%2==0){
                even = even + 1;
            }
            else {
                odd = odd + 1;
            }
            
            System.out.print("Enter N value: ");
            n = input.nextInt();
            
        }
        
        System.out.println("Positive: "+pos);
        System.out.println("Negative: "+neg);
        System.out.println("Odd: "+odd);
        System.out.println("Even: "+even);
    
    }
    
}
