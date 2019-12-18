/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array07b;


public class Array07b {


    public static void main(String[] args) {
        int[] a = {6,22,-1,5,3,0,14,-7,49,8};
        
        int pos = 0;
        
        for(int index = 0;index<a.length; index++){
            if(a[index]>=0){
                pos = pos + 1;
            }
        }
        
        System.out.println("POSITIVE: "+pos);
        System.out.println("NEGATIVE: "+(a.length - pos));
    }

}
