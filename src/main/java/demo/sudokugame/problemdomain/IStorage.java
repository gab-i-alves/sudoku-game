package demo.sudokugame.problemdomain;

import java.io.IOException;

/**
 * Interfaces are great for keeping concerns for the back and front ends separate.
 * This interface defines the contract for classes responsible for storing and retrieving Sudoku game data.
 * Classes that implement this interface will need to provide concrete implementations for these methods according
 * to their storage mechanism (e.g., file system, database, etc.).
 */
public class IStorage {
    public void updateGameData(SudokuGame game) throws IOException {

    }

    public SudokuGame getGameData() throws IOException {
        return null;
    }
}
