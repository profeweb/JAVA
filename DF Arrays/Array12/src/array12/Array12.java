
package array12;


public class Array12 {


    public static void main(String[] args) {
        
        int[] a = {6,22,1,5,3,0,14,7,49,8};
        int[] b = {6, 5,1,4,0,3,14,8,19,2};
        
        int rep = 0;
        
        int i=0;
        while(i<a.length){
            int j = 0;
            while(j<b.length){
                if(a[i]==b[j]){
                    System.out.print(a[i]+ " ");
                    rep = rep + 1;
                }
                j = j + 1;
            }
            i = i + 1;
        }
        
        System.out.println("");
        System.out.println("REPEATED: "+rep);    

        
    }

}
