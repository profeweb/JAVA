
package algo24b;

public class Algo24b {


    public static void main(String[] args) {
        for(int n = 1;n <= 10; n++) {
            for(int index = 1;index <= 10; index++) {
                int value = index * n;
                System.out.println(n + "x" + index + "=" + value);
            }
            System.out.println(" -------------------- ");
        }
    }
    
}
