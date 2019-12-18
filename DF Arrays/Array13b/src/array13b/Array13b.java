package array13b;

public class Array13b {

    public static void main(String[] args) {
        
        int[] a = {1,22,4,5,3,3,5,4,22,1};

        boolean palindrome = true;
        
        for(int bot=0,top=a.length-1; bot<top; bot++,top--){
            if(a[bot]!=a[top]){
                palindrome = false;
            }
        }
        
        System.out.println("PALINDROME: "+palindrome);
    }

}
