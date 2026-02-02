import java.util.*;

public class HangmanGame {
  
    // Word Dictionary
    private static final String[] WORDS = {
        "computer",
        "science",
        "java",
        "programming",
        "algorithm",
        "developer",
        "keyboard",
        "network",
        "database"
    };

    // Game State Variables
    private String secretWord;
    private Set<Character> guessedLetters;
    private int remainingLives;

    // Constructor
    public HangmanGame() {
        // TODO: Initialize game state
    }

    // Game Setup
    public void startGame() {
        // TODO: Select random word
        // TODO: Reset guessed letters
        // TODO: Set number of lives
        // TODO: Display welcome message
    }

    // Input Handling
    public void getPlayerGuess() {
        // TODO: Ask player for a letter
        // TODO: Validate input
    }

    // Game Logic Hooks
    public void processGuess(char guess) {
        // TODO: Check if letter is in secret word
        // TODO: Update guessed letters
        // TODO: Reduce lives if incorrect
    }


    // Game End Checks
    public boolean isGameWon() {
        // TODO: Check if all letters guessed
        return false;
    }

    public boolean isGameLost() {
        // TODO: Check if lives are 0
        return false;
    }

    // Main Loop
    public void run() {

    }
}
