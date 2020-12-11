import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SetUp extends Audio {

    // creating input and text which gets translated to morse code
    private final Scanner input = new Scanner(System.in);
    private final String morse = input.nextLine().toUpperCase();

// making a constructor that calls startAudio method which starts the program
    public SetUp(){
        startAudio();
    }

    // made of 2 keys methods, which loops trough the alphabet , and another method to initialize
    public void startAudio() {
        loopTroughSounds();
    }
    private void loopTroughSounds(){
        int i = 0;
        // while it loops trough the text , it goes trough the alphabet, and displays text in the console that matches each letter
        while (i < morse.length()) {
            letterPattern(morse, i);
            // and gets called the initialization method which gives the path
            getPathAndAudio(morse, i);
            i++;
        }
    }
    private void letterPattern(String morse, int index) {
        Map<Character, String> morseCode = new HashMap<>();
        morseCode.put('A', ".- ");
        morseCode.put('B', "-... ");
        morseCode.put('C', "-.-. ");
        morseCode.put('D', "-.. ");
        morseCode.put('E', ". ");
        morseCode.put('F', "..-. ");
        morseCode.put('G', "--. ");
        morseCode.put('H', ".... ");
        morseCode.put('I', ".. ");
        morseCode.put('J', ".--- ");
        morseCode.put('K', "-.- ");
        morseCode.put('L', ".-.. ");
        morseCode.put('M', "-- ");
        morseCode.put('N', "-. ");
        morseCode.put('O', "--- ");
        morseCode.put('P', ".--. ");
        morseCode.put('Q', "--.- ");
        morseCode.put('R', ".-. ");
        morseCode.put('S', "... ");
        morseCode.put('T', "- ");
        morseCode.put('U', "..- ");
        morseCode.put('V', "...- ");
        morseCode.put('W', ".-- ");
        morseCode.put('X', "-..- ");
        morseCode.put('Y', "-.-- ");
        morseCode.put('Z', "--.. ");
        morseCode.put(' ', " / ");
        // goes trough the key and values, filter the map for keys that match the index of the char, gets and prints the values
        morseCode.entrySet().stream().filter(map -> map.getKey().equals(morse.charAt(index))).map(Map.Entry::getValue).forEach(System.out::print);
    }
    // sets up to sleep certain
    public static void conditionSleep(int index) throws InterruptedException {
        if (index < 3) Thread.sleep(650 * (2));
        else Thread.sleep(580 * (2));
    }

}
