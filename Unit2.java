public class Unit2 {
    @SuppressWarnings("unused")
    public static void main (String[] args) {
        String str0 = "Romance";
        String strO = new String("Romance"); // Object-style creation and assignment, no reuse but a brand new obj
        String nullString; // Null, only a reference, even no memory allocated
        // System.out.println(nullString); Unsolved compilation problem
        String emptyString = new String(); // Empty, length = 0
        String str1 = "Bad";
        
        // Concatenation
        String strSum = str0 + str1;
        strSum = str0.concat(str1);
        System.out.println(strSum);

        str1 += str0;
        System.out.println(str1);

        int int0 = 5;
        System.out.println((int0 + 8 + str0 + int0)); // The things AFTER string will be output as concatenatied strings
        System.out.println((str0 + (int0 + 3))); // Or isolate arithmetic operations
        // String is immutable, a new obj is referenced when a change is made

        // Equal or !equal
        String strCompare0 = "Rip";
        String strCompare1 = "rip";
        System.out.println(strCompare0.equals(strCompare1)); // Equal true
        System.out.println(!strCompare0.equals(strCompare1)); // Not Equal true
        // == is not applicable, it only judges if they're referencing the same object

        // compareTo - compares Unicode till a difference is found
        System.out.println(strCompare0.compareTo(strCompare0)); // 0
        System.out.println(strCompare0.compareTo("Sip")); // R comes before S lexicographically (Unicode of S is higher), Negative
        System.out.println(strCompare0.compareTo(strCompare1)); // Uppercase comes before Lowercase (Lowercase has greater Unicode), Negative
        System.out.println(strCompare0.compareTo("Ripper")); // The longer one is considered greater if they' re the same in shorter's length, Negative

        // nullString.length(); NullPointerException
        
        System.out.println(str0.indexOf("man")); // Counts from 0, to exactly the desired (first) letter, if no, return -1
        System.out.println(str0.indexOf("man",2));
        
        System.out.println(str0.substring(0)); // Capture starts at index 0, till end
        System.out.println(str0.substring(0, 5)); // Stops BEFORE endIndex (So endIndex can be string.length())
        System.out.println(
            str0.substring(str0.indexOf("m",2), str0.indexOf("c")) // Nesting
            );
        // Nonsense index leads to StringIndexOutOfBoundsException
        // If valid beginIndex == endIndex, empty string is captured
        // Lengths count from 1 while index count from 0

        // Escape Sequences for String
        String str2 = "\"Awk\\ward\nWriting And\t<- Tab here\"";
        System.out.println(str2);

        // Math
        double float0 = Math.pow(Math.sqrt(49),2); // pow, sqrt always return double
        int int2 = Math.abs(int0); // abs supports both int and double 
        System.out.println(float0 + int2 + Math.PI); // Math.PI is double, of course
        double ranD = Math.random(); // Generates double ranging on [0.0, 1.0)
        // To generate Random Integers
            // Limiting range on [0,num-1]
            int num = 9; 
            int ranI = (int)(Math.random() * num);
            System.out.println(ranI);
            
            // Range on [lowNum,HighNum]
            int lowNum = 5, highNum = 16;
            ranI = (int)(Math.random() * (highNum - lowNum + 1)) + lowNum; // Math.random()*RANGE+lowNum // We plus 1 cos start point ain't 0
            System.out.println(ranI);
        
        Integer intObj0 = int0; // Autoboxed as an object by compiler
        Double floObj0 = 0.1;
        double flo0 = floObj0; // Unboxed to primitive by compiler
        
    }
}
