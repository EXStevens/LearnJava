public class Supplementary {

    private String str0 = "AB";
    private int a = 0;
    
    // Constructor
    public Supplementary(int a, int b) {
        System.out.println(a+b);
        this.a = a; // this.var is ALWAYS addressed at left
    }

    public void main(String[] args) {
        func0(8);
        System.out.println(str0); 
        SubOne SO = new SubOne(1,2,3);
        Supplementary SSub = new SubOne(1,2,3); // Create subclass with superclass reference type
        // MUST NOT switch the order to subc ... = new superc(...);
      //SSub.funcSub(); // Can't pass compiler check bc compiler only checks if it's in the reference type class(Supplementary here)
        SSub.func0("a"); // Will run the func0 of SubOne cos SSub is actually SubOne while running 
        SO.func0("aha"); // This will call the func0(str) in SubClass, Superclass got overriden
    }

    /* Overload
     * SAME: Class, Name
     * DIFF: Parameter list (Order, Type, Number)
    */ 
    public static void func0() {
        System.out.println("1");
    }
    public void func0(String str0) {
        this.str0 = str0; // Specify which str0, NOT available for STATIC class
        System.out.println(str0);
    }
    private void func0(int i) {
        System.out.println(i);
    }
}

class SubOne extends Supplementary { // One public class only in one file
    
    // Constructor
    public SubOne(int a, int b, int c) {
        super(1,2); // Call the superclass constructor with corresponding parameter list
        // Warning! Super must be at the FIRST line of the constructor. 

        super.func0("a"); // Non-static method needs to be called by super, and it's a way to escape override.
        func0("a"); // If no super, execute the method that overrides

        func0(); // Static, call directly
    }
    
    int int0;

    // Override (Only in Subclass) : SAME Name, Parameter list, and Return type
    // So it can pass the compiler check, bc Supplementary.func0(str) looks the same with it for compiler.
    // But SSub.func(str) calls here, cos while running, SSub is a SubOne instance
    public void func0(String overrideStr0) {
        
        System.out.println("You get overriden hahaha!");
    }
    
    public void funcSub(String str0) {

    }
}

