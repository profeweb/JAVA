

package array16;


public class Array16 {


    public static void main(String[] args) {
        
        double [] a = {100,150,4,25,300,30,15,24,200, 10};
        
        double discountA = 0.1;
        double discountB = 0.5;
        double discount;
        
        for(int i=0;i<a.length; i++){
            if(a[i]<100){
                discount = discountA;
            }
            else {
                discount = discountB;
            }
            a[i]=a[i]*(1-discount);
        }
        
        System.out.println("ARRAY : ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+", ");
        }
    }

}
