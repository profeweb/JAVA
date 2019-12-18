
package array15b;


public class Array15b {


    public static void main(String[] args) {
        
        double [] a = {100,50,4,25,30,30,15,24,200, 10};
        
        double discount = 0.3;
        
        for(int i=0;i<a.length; i++){
            a[i]=a[i]*(1-discount);
        }
        
        System.out.println("ARRAY : ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+", ");
        }
    }

}
