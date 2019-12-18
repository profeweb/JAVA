
package array10b;


public class Array10b {


    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5,6,7,8,9,10};
               
        for(int bot = 0, top = a.length - 1; bot < top; bot++, top--){
            int temp = a[bot];
            a[bot] = a[top];
            a[top] = temp;
        }
                
        System.out.println("");
        System.out.print("ARRAY A: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }

}
