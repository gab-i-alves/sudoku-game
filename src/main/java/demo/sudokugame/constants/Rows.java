package demo.sudokugame.constants;

/**
 * This enum exists to provide better legibility for the logic required to check if each Square in the sudoku puzzle
 * contains a valid value. See GameLogic.java for usage.
 * <p>
 * Top, Middle, and Bottom rows for each square (a square is comprised of 3x3 "titles", with 9 squares total in a
 * sudoku puzzle).
 * <p>
 * The values represent the Y coordinates of each title.
 */
public enum Rows {
    TOP,
    MIDDLE,
    BOTTOM
}
