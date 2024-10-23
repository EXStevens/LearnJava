public class Unit1 {
    public static void main (String[] args) {
        final int int0 = 9;
        int int1 = 0;
        int[] nums = {3, 6, 1, 0, 1, 4, 2};
        double flo0 = 5.5;
        double flo1 = -5.0, flo2 = 0.0;

        int1 = (int)(int0 * flo0); // Cast double to int: Cut the decimals
        double sum = int0 - int1; // Good to go as Java automatically wides integer, but cast at least one for AP CSA

        System.out.println(int1);
        System.out.println(sum);

        System.out.println(flo1 / flo2); // double divided by 0 - +/-Infinity

        try {
            System.out.println(int0 / 0); // int / 0 - ArithmeticException
        } catch (Exception e) {
            System.out.println("int / 0 leads to ArithmeticException");
        }
        
        System.out.println(mystery(nums));
        System.out.println(nums.length);

        // double comparison that ignores rounding bias
        double tolerance = 0.000001; // Choose a favorable one
        double reference = 5;
        double simulatedResult = 5.001;
        boolean closeEnough = Math.abs(simulatedResult - reference) <= tolerance;
        System.out.println(closeEnough);
    }

    public static int mystery(int[] arr)
    {
        int x = 0;
        for (int k = 0; k < arr.length; k = k + 2) 
        x = x + arr[k];
        return x;
    }
}
