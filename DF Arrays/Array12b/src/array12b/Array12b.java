
package array12b;

public class Array12b {


    public static void main(String[] args) {
        
        int[] a = {6,22,1,5,3,0,14,7,49,8};
        int[] b = {6, 5,1,4,0,3,14,8,19,2};
        
        int rep = 0;
        
        for(int i=0;i<a.length; i++){
            for(int j = 0;j<b.length; j++){
                if(a[i]==b[j]){
                    System.out.print(a[i]+ " ");
                    rep = rep + 1;
                }
            }
        }
        
        System.out.println("");
        System.out.println("REPEATED: "+rep);   
    }

}
