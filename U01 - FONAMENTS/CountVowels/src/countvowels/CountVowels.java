
package countvowels;

import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int numVowels = 0;
        
        for(int i=0; i<10; i++){
            System.out.print("Introdueix una lletra: ");
            char c = input.next().charAt(0);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                numVowels ++;
            }
        }
        System.out.println("Num Vowels: "+numVowels);
        
    }

}
