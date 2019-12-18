package array14b;


public class Array14b {


    public static void main(String[] args) {
        
        int[] a = {1,22,4,5,3,3,5,4,22,1};
        
        for(int index=0;index<a.length; index++){
            a[index]=a[index]*index;
        }
        
        System.out.print("ARRAY : ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+", ");
        }
    }

}
