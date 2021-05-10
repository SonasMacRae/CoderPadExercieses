import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int [][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}};

        System.out.println(HorizontalValidation(sudoku));
        System.out.println(VerticalValidation(sudoku));
    }

    public static boolean HorizontalValidation(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
             if (!Validation(sudoku[i])) {
                 return false;
             }
        }

        return true;
    }

    public static boolean VerticalValidation(int[][] sudoku) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                temp.add(sudoku[j][i]);
            }

            int[] ret = new int[temp.size()];
            for (int k = 0; k < ret.length; k++)
            {
                ret[k] = temp.get(k).intValue();
            }

            if (!Validation(ret)) {
                return false;
            }
            temp.clear();
        }

        return true;
    }

    public static boolean SquareValidation(int[][] Sudoku) {


        return true;
    }

    public static boolean Validation(int[] inputArray) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < inputArray.length; i++) {
            if (!temp.contains(inputArray[i])) {
                temp.add(inputArray[i]);
            }
        }

        if (temp.size() == 9) {
            return true;
        }

        return false;
    }

}
