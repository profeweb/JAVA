
package array06;


public class Array06 {


    public static void main(String[] args) {
        
        int[] a = {6,2,1,5,3,4,4,7,9,8};
        
        double sum = 0;
        
        int index = 0;
        while(index<a.length){
            sum = sum + a[index];
            index = index + 1;
        }
        
        double average = sum / a.length;
        System.out.println("AVERAGE: "+average);
    }

}
