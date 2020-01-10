
package calculadora;

import java.util.Scanner;


public class Calculadora {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int operacio;
        int resultat = 0;
        boolean sortir = false;
        
        while(sortir==false){
            System.out.println("Quina operació vols realitzar?");
            System.out.println(" 0) Sortir.");
            System.out.println(" 1) Sumar.");
            System.out.println(" 2) Restar.");
            System.out.println(" 3) Multiplicar.");
            System.out.println(" 4) Dividir.");
            System.out.print(" Introdueix una opció (0,1,2,3,o 4): ");
            operacio = input.nextInt();
            
            if(operacio==0){
                sortir = true;
            }
            else {
                System.out.print("Valor de A: ");
                int a = input.nextInt();
            
                System.out.print("Valor de B: ");
                int b = input.nextInt();
            
                if(operacio==1){
                    resultat = a + b;
                }
                else if(operacio==2){
                    resultat = a - b;
                }
                else if(operacio==3){
                    resultat = a*b;
                }
                else if(operacio==4){
                    resultat = a / b;
                }
                System.out.println("Resultat és: "+resultat);
            }
               
        }
        
    }

}
