package August.ex_04082024OopsConstructor;

public class Lab044 {
    public static void main(String[] args) {

        ATBPerson p1 = new ATBPerson();
        new ATBPerson ();

        ATBPerson p2 = new ATBPerson("Vijay");
        ATBPerson p3 = new ATBPerson("Ramesh");
        ATBPerson p4 = new ATBPerson("Gopal", p2.phone);
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p3.name);
        System.out.println(p4.name);

    }
}