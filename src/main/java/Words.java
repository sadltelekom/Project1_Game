import java.util.concurrent.ThreadLocalRandom;

public class Words {
   static String[] wordsArray = {"Xylophon","stronghold","yachtsman","espionage","exodus","fishhook","fluffiness","kilobyte","President","Carnival","Football","Spiderman","nightclub","puzzling","schnapps","thumbscrew","transgress","jiujitsu","wyvern","curacao"};


    public static String getRandomWord() {
        int randomNumber = ThreadLocalRandom.current().nextInt(0,wordsArray.length);
        String randomWord = wordsArray[randomNumber].toUpperCase();
        return randomWord;
    }

    public static void drawGuessingDashes(String searchWord) {

        //System.out.println(searchWord);

        for (int i = 0;i <= searchWord.length() - 1;i++) {
            System.out.print("_ ");
        }

    }

}
