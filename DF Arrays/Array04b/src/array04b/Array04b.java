
package array04b;


public class Array04b {


    public static void main(String[] args) {
        int[] a = {6,2,1,5,3,0,4,7,9,8};
        
        int max = a[0];
        
        for(int index = 0;index<a.length; index++){
            if( a[index]>max){
                max = a[index];
            }
        }
        
        System.out.println("MAXIMUM: "+max);
    }

}
