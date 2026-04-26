package ex_10082024.poly;

//Method Overriding | Runtime Poly
public class Lab050 {
   public static void main(String[] args) {
      Hound h1 = new Hound();
      h1.bark();

      Dog d1 = new Dog();
      d1.bark();

      Dog dog_ref = new Hound();
      dog_ref.bark();

    }
}
