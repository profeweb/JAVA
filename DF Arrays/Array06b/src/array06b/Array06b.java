/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array06b;


public class Array06b {


    public static void main(String[] args) {
        int[] a = {6,2,1,5,3,4,4,7,9,8};
        
        double sum = 0;
        
        for(int index = 0;index<a.length; index++){
            sum = sum + a[index];
        }
        
        double average = sum / a.length;
        System.out.println("AVERAGE: "+average);
    }

}
