package ex_10082024.Super;

public class Lab053 {
}

  class Person1 {
      Person1() {
          System.out.println("Person - DC");
      }


      Person1(String a, int a1) {
          System.out.println("Person - PC A1");
      }
  }

  class Student1 extends Person1 {
      Student1(String s) {
          System.out.println("PC - Student");
      }

      //Below is the Default Constraint. It is calling Default Constraint of Parent

      Student1() {
          super();
      }
  }