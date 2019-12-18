
package array05;


public class Array05 {


    public static void main(String[] args) {
        
        int[] a = {6,2,1,5,3,0,4,7,9,8};
        
        int min = a[0];
        
        int index = 0;
        while(index<a.length){
            if( a[index]<min){
                min = a[index];
            }
            index = index + 1;
        }
        
        System.out.println("MINIMUM: "+min);
    }

}
