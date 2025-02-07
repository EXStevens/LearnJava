public class MyClas {
    public int a = 0;
    public MyClas() {}
}

public class MyClass extends MyClas {
    int instanceVariable;
    public int a = 5;

    // Constructor to initialize aa using super class field
    public MyClass(int i, int a) {
        super();  // Calls the superclass constructor (if any)
        this.instanceVariable = i;
        a = a;
        
    }
    public void main() {
        System.out.println(a);
    }
    
}
