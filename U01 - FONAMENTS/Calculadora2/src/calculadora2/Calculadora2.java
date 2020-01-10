
package calculadora2;

import java.util.Scanner;

public class Calculadora2 {

    public static void main(String[] args) {
              
        boolean sortir = false;
        
        while(sortir==false){
            
            menuOpcions();
            int operacio = inputOperacio();
            
            if(operacio==0){
                sortir = true;
            }
            else {
                int a = inputOperand("A");
                int b = inputOperand("B");
                int resultat = calcular(operacio, a, b);
                System.out.println("Resultat és: "+resultat);
            }
        }
    }
    
    
    public static void menuOpcions(){
        System.out.println("Quina operació vols realitzar?");
        System.out.println(" 0) Sortir.");
        System.out.println(" 1) Sumar.");
        System.out.println(" 2) Restar.");
        System.out.println(" 3) Multiplicar.");
        System.out.println(" 4) Dividir.");
    }
    
    public static int inputOperacio(){
        Scanner input = new Scanner(System.in);
        System.out.print("Introdueix una opció (0,1,2,3,o 4): ");
        int operacio = input.nextInt();
        return operacio;
    }
    
    public static int inputOperand(String nomOperand){
        Scanner input = new Scanner(System.in);
        System.out.print("Valor de "+nomOperand+": ");
        int operand = input.nextInt();
        return operand;
    }
    
    public static int calcular(int operacio, int a, int b){
        int resultat=0;
        if (operacio == 1) {
            resultat = a + b;
        } else if (operacio == 2) {
            resultat = a - b;
        } else if (operacio == 3) {
            resultat = a * b;
        } else if (operacio == 4) {
            resultat = a / b;
        }
        return resultat;
    }

}

