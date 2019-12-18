
package array03b;

public class Array03b {


    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        
        int sum = 0;
        
        for(int index = 0;index<a.length; index++){
            sum = sum + a[index];
        }
        
        System.out.println("SUM: "+sum);
    }

}
