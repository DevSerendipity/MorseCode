import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterMatcher {


    protected void loopTroughInput(){
        String sampleMorseCodeInput = getSampleMorseCodeInput();
        AudioInitialization audioInitialization = new AudioInitialization();
        for (int i = 0; i < sampleMorseCodeInput.length(); i++){
            letterToMorseCode(sampleMorseCodeInput, i);
            audioInitialization.pathForAudio(sampleMorseCodeInput, i);
        }
    }
    @NotNull
    private String getSampleMorseCodeInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine().toUpperCase();
    }
    private void letterToMorseCode(String morse, int index) {
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
        // goes trough the key and values, filter the map for keys that match the index of the char, gets and prints the values
        morseCode.entrySet().stream().filter(map -> map.getKey().equals(morse.charAt(index))).map(Map.Entry::getValue).forEach(System.out::print);
    }
}
