/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array10;


public class Array10 {


    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        
        int bot = 0;
        int top = a.length - 1;
        
        while(bot < top){
            
            int temp = a[bot];
            a[bot] = a[top];
            a[top] = temp;
            
            bot = bot + 1;
            top = top - 1;
        }
        
        
        System.out.println("");
        System.out.print("ARRAY A: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }

}
