package july.ex_27072024Arrays;

public class Lab037ArrayFunction {
    private static int j;

    public static void main(String[] args) {

        int[][] array_2d = {
                {35, 5},
                {18, 8},
                {24, 4}
        };

        int row = array_2d.length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < array_2d[i].length; j++) ;
            System.out.print(array_2d[i][j]);
            System.out.println("\t");
            }
             System.out.println("");
        }


    }

