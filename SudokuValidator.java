package com.company;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println(SquareValidation(sudoku));
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

            int[] verticalArray = ListToArray(temp);

            if (!Validation(verticalArray)) {
                return false;
            }
            temp.clear();
        }

        return true;
    }


    public static int[] ListToArray(List<Integer> inputList) {
        int[] ret = new int[inputList.size()];

        for (int k = 0; k < ret.length; k++)
        {
            ret[k] = inputList.get(k).intValue();
        }

        return ret;
    }

    public static boolean SquareValidation(int[][] sudoku) {

        if (!Validation(BuildSquare(new Pair<>(0,0), sudoku))) {
            return false;
        }
        if (!Validation(BuildSquare(new Pair<>(0,3), sudoku))) {
            return false;
        }
        if (!Validation(BuildSquare(new Pair<>(0,6), sudoku))) {
            return false;
        }
        if (!Validation(BuildSquare(new Pair<>(3,0), sudoku))) {
            return false;
        }
        if (!Validation(BuildSquare(new Pair<>(3,3), sudoku))) {
            return false;
        }
        if (!Validation(BuildSquare(new Pair<>(3,6), sudoku))) {
            return false;
        }
        if (!Validation(BuildSquare(new Pair<>(6,0), sudoku))) {
            return false;
        }
        if (!Validation(BuildSquare(new Pair<>(6,3), sudoku))) {
            return false;
        }
        if (!Validation(BuildSquare(new Pair<>(6,6), sudoku))) {
            return false;
        }


        return true;
    }

    // Takes the top left co-ordinate of a square and return the rest of the co-ordinates
    public static int[] BuildSquare(Pair<Integer, Integer> coordinate, int[][] sudoku) {
        ArrayList<Integer> square = new ArrayList<>();

        int xcoord = coordinate.getKey();
        int ycoord = coordinate.getValue();

        for (int i = xcoord; i < xcoord + 3; i++) {
            for (int j = ycoord; j < ycoord + 3; j++) {
                square.add(sudoku[i][j]);
            }
        }

        int[] squareArray = ListToArray(square);

        return squareArray;
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
