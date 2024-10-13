package july.ex_14072024;

public class Lab016Strinequal {
    public static void main(String[] args) {
        String password = "SHAN@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);
        System.out.println(pass_u.equalsIgnoreCase(password));
        System.out.println(pass_u == password);

        System.out.println(password.substring(0,2));
        System.out.println(password.indexOf('a'));
        System.out.println(password.length());

    }
}
