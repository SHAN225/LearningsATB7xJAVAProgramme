package August.ex_04082024OopsConstructor;

public class ATBPerson {

    String name;
    long phone;

    ATBPerson() {
        System.out.println("Object is created");

    }

    ATBPerson(String nameGiven) {
        this.name = nameGiven;
    }

    ATBPerson(String nameGiven, long phoneNumber) {
        this.name = nameGiven;
        this.phone = phoneNumber;
    }
}
