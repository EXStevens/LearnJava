class Animal { // Superclass (parent)
    public void animalSound() {
      int int0 =2;
      System.out.println("The animal makes a sound" + int0);
    }
  private int a, b;
  
  public Animal(int va, int vb) {
    a=va;
    b=vb;
  }

  public Animal() {
    a=0;
    b=0;
  }
}

  class Dog extends Animal { // Subclass (child)
    public void animalSound() {
      super.animalSound(); // Call the superclass method
      System.out.println("The dog says: bow wow");
    }
  }
  

  public class Main {
    public static void main(String args[]) {
      Animal myDog = new Dog(); // Create a Dog object
      myDog.animalSound(); // Call the method on the Dog object
      Animal AniHa = new Animal();
      // AniHa.a =3 ;
    }
  }