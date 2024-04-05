package demo.sudokugame.computationlogic;

import demo.sudokugame.problemdomain.SudokuGame;

public class SudokuUtilities {

    /**
     * Copy the values from one sudoku grid into another
     * Note: O(n²) Runtime Complexity (n is the grid size)
     * Iterates over every grid in the cell once
     */
    public static void copySudokuArrayValues(int[][] oldArray, int[][] newArray) {
        for (int xIndex = 0; xIndex < SudokuGame.GRID_BOUNDARY; xIndex++) {
            for (int yIndex = 0; yIndex < SudokuGame.GRID_BOUNDARY; yIndex++) {
                newArray[xIndex][yIndex] = oldArray[xIndex][yIndex];
            }
        }
    }

    /**
     * Creates and returns a new array with the same values as the inputted Array
     */
    public static int[][] copyToNewArray(int[][] oldArray) {
        int[][] newArray = new int[SudokuGame.GRID_BOUNDARY][SudokuGame.GRID_BOUNDARY];
        for (int xIndex = 0; xIndex < SudokuGame.GRID_BOUNDARY; xIndex++) {
            for (int yIndex = 0; yIndex < SudokuGame.GRID_BOUNDARY; yIndex++) {
                newArray[xIndex][yIndex] = oldArray[xIndex][yIndex];
            }
        }
        return newArray;
    }
}
