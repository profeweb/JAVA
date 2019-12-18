
package array02;

public class Array02 {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        
        int index = a.length-1;
        while(index>=0){
            System.out.println(a[index]);
            index = index - 1;
        }
    }
    
}
