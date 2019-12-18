package array13;


public class Array13 {


    public static void main(String[] args) {
        
        int[] a = {1,22,4,5,3,3,5,4,22,1};

        boolean palindrome = true;
        
        int bot=0;
        int top = a.length - 1;
        
        while(bot<top){
            if(a[bot]!=a[top]){
                palindrome = false;
            }
            bot = bot + 1;
            top = top - 1;
        }
        
        System.out.println("PALINDROME: "+palindrome);
    }

}
