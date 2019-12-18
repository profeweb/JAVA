
package algo24;

public class Algo24 {

    public static void main(String[] args) {

        int n = 1;
        while(n<=10){
            int index = 1;
            while(index<=10){
                int value = index*n;
                System.out.println(n+"x"+index+"="+value);
                index = index + 1;
            }
            System.out.println(" -------------------- ");
            n = n + 1;
        }
    }
    
}
