
package array09b;


public class Array09b {


    public static void main(String[] args) {
        int[] a = {6,22,-4,5,3,0,14,-7,49,8};
        
        int even = 0;
        
        for(int index = 0;index<a.length; index++){
            if(a[index]%2==0){
                even = even + 1;
            }
        }
        
        System.out.println("EVEN: "+even);
        System.out.println("ODD: "+(a.length - even));
    }

}
