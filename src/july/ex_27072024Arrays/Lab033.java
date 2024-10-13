package july.ex_27072024Arrays;

public class Lab033 {
    public static void main(String[] args) {

        int[ ] marks = new int[3];

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        marks[0] = 90;
        marks[1] = 91;
        marks[2] = 95;
        marks[3] = 97;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        for (int i = 0; i < marks.length  ; i++) {
            System.out.println(i + " -> " + marks[i]);
        }

        String Weekdays[] = {"Sunday", "Monday", "Tuesday", "Wednesday"};
        for (int i = 0; i <= Weekdays.length; i++) {
            System.out.println(Weekdays[i]);
        }
    }
}
