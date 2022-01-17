import java.util.Scanner;

public class HangmanGame {
    static Scanner scanner = new Scanner(System.in);
    static int numberOfErrors = 0;
    static String wordToGuess;

    public static void startGame() {
        // Print Intro
        // get word from Words Class and drawGuessingDashes
        System.out.println("Hello fellow User.");
        System.out.println("Welcome to our (Bojan, Szymon and Sebastian) Hangman Game");
        System.out.println("7 tries will determine if you live or die ... ");
        System.out.println("So choose wise.");
        wordToGuess = Words.getRandomWord();
        Words.drawGuessingDashes(wordToGuess);
        System.out.println();
        runGame();

    }
    public static void runGame() {
        // ask user for input ? If correct input showLetters.
        // if input wrong -> increase numberOfErrors and draw hangman
        getUserInput();

    }
    public static void getUserInput() {
        // get input and check it.
        // ask for letter or solution to word.
        String guess = "";
        try {
            System.out.print("Give Word or Letter to check ");
            guess = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Wrong input");
            getUserInput();
        }

        if (wordToGuess.toUpperCase().contains(guess.toUpperCase())) {
            // method to draw right guesses
        }
        else {
            System.out.printf("%s not correct try again", guess);
            numberOfErrors++;
        }
    }
    public static void checkWinOrLoose() {
        // Loose if number of errors >= 7
        // win if userguess matches with word
    }
    public static void drawHangman(int numberOfErrors) {
        // Draw Hangman according to number of errors.
    }




}
