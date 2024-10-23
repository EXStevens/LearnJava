public class Testpad2 {
    public static void main(String[] args) {
        int[] sc = {9,4,53,3};
        int max = 0;
        boolean ind = true;
        
        for(int j : sc) {
            for(int k : sc) {
                ind = false;
                if(j < k) { ind =true; break;}
            }
            if(ind == true) break;
            max = j;
            break;
        }
        System.out.println(max);

        
    }
    public static int ic() {
        int max =4;
        System.out.println(4);
        return 4;
    }
}
