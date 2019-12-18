package array09;


public class Array09 {


    public static void main(String[] args) {
        int[] a = {6,22,-4,5,3,0,14,-7,49,8};
        
        int even = 0;
        
        int index = 0;
        while(index<a.length){
            if(a[index]%2==0){
                even = even + 1;
            }
            index = index + 1;
        }
        
        System.out.println("EVEN: "+even);
        System.out.println("ODD: "+(a.length - even));
    }

}
