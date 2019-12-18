/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array08b;


public class Array08b {


    public static void main(String[] args) {
        int[] a = {6,22,-1,5,3,0,14,-7,49,8};
        
        int neg = 0;
        
        for(int index = 0;index<a.length; index++){
            if(a[index]<0){
                neg = neg + 1;
            }
        }
        
        System.out.println("NEGATIVE: "+neg);
        System.out.println("POSITIVE: "+(a.length - neg));
    }

}
