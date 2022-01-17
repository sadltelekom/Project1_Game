import java.util.Scanner;

public class HangmanGame {
    static Scanner scanner = new Scanner(System.in);
    static int numberOfErrors = 0;
    static String wordToGuess;
    static String alreadyGuessed;

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
    public static void checkWin() {
        // Loose if number of errors >= 7
        // win if userguess matches with word
    }
    public static void drawHangman(int numberOfErrors) {
        if (numberOfErrors == 0) {
            System.out.println("_____ ");
            System.out.println("|    ");
            System.out.println("|    ");
            System.out.println("|       ");
            System.out.println("|    ");
            System.out.println("|      ");
            System.out.println("________");
        } else if (numberOfErrors == 1) {
            System.out.println("_____ ");
            System.out.println("|   |");
            System.out.println("|    ");
            System.out.println("|       ");
            System.out.println("|    ");
            System.out.println("| _/  ");
            System.out.println("________");
        } else if (numberOfErrors == 2) {
            System.out.println("_____ ");
            System.out.println("|   |");
            System.out.println("|    ");
            System.out.println("|       ");
            System.out.println("|    ");
            System.out.println("| _/ \\_");
            System.out.println("________");
        } else if (numberOfErrors == 3) {
            System.out.println("_____ ");
            System.out.println("|   |");
            System.out.println("|    ");
            System.out.println("|       ");
            System.out.println("|   |");
            System.out.println("| _/ \\_");
            System.out.println("________");
        } else if (numberOfErrors == 4) {
            System.out.println("_____ ");
            System.out.println("|   |");
            System.out.println("|    ");
            System.out.println("|   | ");
            System.out.println("|   |");
            System.out.println("| _/ \\_");
            System.out.println("________");
        } else if (numberOfErrors == 5) {
            System.out.println("_____ ");
            System.out.println("|   |");
            System.out.println("|    ");
            System.out.println("|  /|  ");
            System.out.println("|   |");
            System.out.println("| _/ \\_");
            System.out.println("________");
        } else if (numberOfErrors == 6) {
            System.out.println("_____ ");
            System.out.println("|   |");
            System.out.println("|    ");
            System.out.println("|  /|\\ ");
            System.out.println("|   |");
            System.out.println("| _/ \\_");
            System.out.println("________");
        } else if (numberOfErrors == 7) {
            System.out.println("_____ ");
            System.out.println("|   |");
            System.out.println("|   O");
            System.out.println("|  /|\\ ");
            System.out.println("|   |");
            System.out.println("| _/ \\_");
            System.out.println("________");
            System.out.println(" Sorry you lost");
        }
    }

    public static String drawCorrectGuesses(String guess) {
        // For every letter in wordToGuess we need to check if guess is equal and return this String and add it to alreadyGUessed
        // If no match add an Underscore
        // Return the made up strings nd save it to another variable: alreadyGuessed
        for (int i=0;i<wordToGuess.length()-1;i++){
            if (wordToGuess.charAt(i)==guess.charAt(0)){
                alreadyGuessed += guess.charAt(0);

            }else
            {
                alreadyGuessed+= alreadyGuessed.charAt(i);
            }
        }
        return alreadyGuessed;

    }





}
