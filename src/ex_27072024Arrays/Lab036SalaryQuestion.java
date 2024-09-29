package ex_27072024Arrays;

public class Lab036SalaryQuestion {
    public static void main(String[] args) {
        // Find Min and Max salary by Array Function(Salary)

        int [ ] salaries = {8,10,17,5,25,15,31};
        int max = salaries[0];
        int min = salaries[0];
        for (int i = 0; i < salaries.length ; i++) {
            if( salaries[i] > max){
                max = salaries[i];
            }
            if(min > salaries[i]){
                min = salaries[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
