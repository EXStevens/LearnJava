// They both intend to hide something from user.

// Interface
interface Animal0 {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
  }
  
  // Pig "implements" the Animal0 interface
  class Pig0 implements Animal0 {
    public void animalSound() {
      // The body of animalSound() is provided here
      System.out.println("The pig says: wee wee");
    }
    public void sleep() {
      // The body of sleep() is provided here
      System.out.println("Zzz");
    }
  }
  
  class Main0 {
    public static void main(String[] args) {
      Pig0 myPig = new Pig0();  // Create a Pig object
      myPig.animalSound();
      myPig.sleep();
    }
  }

  // Abstract class - Can't create objects, only use it in inheritance
abstract class Animal1 {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
      System.out.println("Zzz");
    }
  }
  
  // Subclass (inherit from Animal)
  class Pig1 extends Animal1 {
    public void animalSound() {
      // The body of animalSound() is provided here
      System.out.println("The pig says: wee wee");
    }
  }
  
  class Main1 {
    public static void main(String[] args) {
      Pig1 myPig = new Pig1(); // Create a Pig object
      myPig.animalSound();
      myPig.sleep();
    }
  }