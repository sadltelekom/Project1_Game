public class HangmanGame {
    int numberOfErrors = 0;

    public static void startGame() {
        // get word from Words Class and drawGuessingDashes
    }
    public static void runGame() {
        // ask user for input ? If correct input showLetters.
        // if input wrong -> increase numberOfErrors and draw hangman
    }
    public static void getUserInput() {
        // get input and check it.
        // ask for letter or solution to word.
    }
    public static void checkWinOrLoose() {
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


}
