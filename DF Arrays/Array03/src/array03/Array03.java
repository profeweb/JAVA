
package array03;


public class Array03 {


    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        
        int sum = 0;
        
        int index = 0;
        while(index<a.length){
            sum = sum + a[index];
            index = index + 1;
        }
        
        System.out.println("SUM: "+sum);
    }

}
