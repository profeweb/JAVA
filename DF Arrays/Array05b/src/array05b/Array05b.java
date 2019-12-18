
package array05b;


public class Array05b {


    public static void main(String[] args) {
        int[] a = {6,2,1,5,3,0,4,7,9,8};
        
        int min = a[0];
        
        for(int index = 0;index<a.length; index++){
            if( a[index]<min){
                min = a[index];
            }
        }
        
        System.out.println("MINIMUM: "+min);
    }

}
