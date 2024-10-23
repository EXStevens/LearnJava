import java.util.ArrayList;
import Test.MyClass;

public class Testpad0 {
    public static void main (String[] args) {
        int[] int0 = {1,3,7};
        ArrayList aL0 = new ArrayList<Integer>();
        aL0.add(3);
        aL0.add(8);
        int[][] x2int = {{1,2,3,4,5},{6,7,8,9,10}};
        int[][] x2int0 = new int[3][3];

        for (int[] intAr : x2int0) {
            for (int intE : intAr) {
                System.out.println(intE);
            }
        }
        System.out.println(x2int0);
        MyClass mycl = new MyClass();
        mycl.main();
    
        System.out.println((int)(0.7));
    }
}