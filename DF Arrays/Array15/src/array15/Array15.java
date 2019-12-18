
package array15;


public class Array15 {


    public static void main(String[] args) {
        
        double [] a = {100,50,4,25,30,30,15,24,200,10};
        
        double discount = 0.3;
        
        int index = 0;
        while(index<a.length){
            a[index]=a[index]*(1-discount);
            index = index + 1;
        }
        
        System.out.println("ARRAY : ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+", ");
        }
    }

}
