
package array11b;


public class Array11b {


    public static void main(String[] args) {
        int[] a = {6,22,1,5,3,0,14,7,49,8};
        int[] b = {6, 5,1,4,0,3,14,8,49,2};
        
        int rep = 0;
        for(int index = 0;index < a.length - 1; index++){
            if(a[index]==b[index]){
                rep = rep + 1;
            }
        }
                
        System.out.println("REPEATED: "+rep);
    }

}
