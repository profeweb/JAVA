package array14;


public class Array14 {


    public static void main(String[] args) {
        
        int[] a = {1,22,4,5,3,3,5,4,22,1};
        
        int index=0;
        
        while(index<a.length){
            a[index]=a[index]*index;
            index = index + 1;
        }
        
        System.out.print("ARRAY : ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+", ");
        }
    }

}
