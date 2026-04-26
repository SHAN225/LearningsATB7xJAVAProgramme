package ex_10082024.Super;

public class Lab052 {
}
     class Student extends Person {
    //is a Relation = Inheritance
         @Override
         void message () {
             System.out.println("I am Student Message");

         }
         void display() {
             super.message();

         }

     }

    class Person {
        void message () {
            System.out.println("I am Person Message");

        }
    }



