
package array04;


public class Array04 {


    public static void main(String[] args) {
        int[] a = {6,2,1,5,3,0,4,7,9,8};
        
        int max = a[0];
        
        int index = 0;
        while(index<a.length){
            if( a[index]>max){
                max = a[index];
            }
            index = index + 1;
        }
        
        System.out.println("MAXIMUM: "+max);
    }

}
