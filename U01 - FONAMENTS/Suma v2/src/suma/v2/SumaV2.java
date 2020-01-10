
package suma.v2;

import java.util.Scanner;

public class SumaV2 {

    public static void main(String[] args) {
        
        boolean sortir = false;
        
        while(sortir==false){
            
            System.out.println("SUMANT");
            
            int a = inputOperand("A");
            int b = inputOperand("B");
            
            int resultat = a + b;
            System.out.println("Resultat de la SUMA : "+resultat);
            
            sortir = seguirSumant();
               
        }
    }
    
    public static int inputOperand(String nomOperand){
        Scanner input = new Scanner(System.in);
        System.out.print("Valor de "+nomOperand+": ");
        int n = input.nextInt();
        return n;
    }
    
    public static boolean seguirSumant(){
        Scanner input = new Scanner(System.in);
        System.out.println("Vols calcular més sumes?");
        System.out.println(" 0) No.");
        System.out.println(" 1) Sí.");
        System.out.print("Introdueix una opció (0 o 1): ");
        int n = input.nextInt();
        if(n==0){
            return true;
        }
        else {
            return false;
        }
    }

}
