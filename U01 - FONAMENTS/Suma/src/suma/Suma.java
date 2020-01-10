
package suma;

import java.util.Scanner;


public class Suma {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        boolean sortir = false;
        
        while(sortir==false){
            
            System.out.println("SUMANT");
           
            System.out.print("Valor de A: ");
            int a = input.nextInt();
            
            System.out.print("Valor de B: ");
            int b = input.nextInt();
            
            int resultat = a + b;
            System.out.println("Resultat de la SUMA : "+resultat);
            
            System.out.println("Vols calcular més sumes?");
            System.out.println(" 0) No.");
            System.out.println(" 1) Sí.");
            System.out.print("Introdueix una opció (0 o 1): ");
            int n = input.nextInt();
            if(n==0){
                sortir = true;
            }
               
        }
    }

}
