package com.morseCode;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputHandler {
    // when it enters input handler it initializes all the fields again
    // key and values for morse code
    // stores keys and values for the morse code
    private final Map<String, String> letterToMorseCode = Map.ofEntries(
            Map.entry("A", ".-"),
            Map.entry("B", "-..."),
            Map.entry("C", "-.-."),
            Map.entry("D", "-.."),
            Map.entry("E", "."),
            Map.entry("F", "..-."),
            Map.entry("G", "--."),
            Map.entry("H", "...."),
            Map.entry("I", ".."),
            Map.entry("J", ".---"),
            Map.entry("K", "-.-"),
            Map.entry("L", ".-.."),
            Map.entry("M", "--"),
            Map.entry("N", "-."),
            Map.entry("O", "---"),
            Map.entry("P", ".--."),
            Map.entry("Q", "--.-"),
            Map.entry("R", ".-."),
            Map.entry("S", "..."),
            Map.entry("T", "-"),
            Map.entry("U", "..-"),
            Map.entry("V", "...-"),
            Map.entry("W", ".--"),
            Map.entry("X", "-..-"),
            Map.entry("Y", "-.--"),
            Map.entry("Z", "--.."));

    // handles input
    // matches correct letter key with correct values
    // creates a path for the audio with the key
    void loopTroughInput() {
        AudioHandler audioHandler = new AudioHandler();

        // all things it does
        // propmts for input and gets the input
        // than it goes letters to morse code with both characters but with i, as the index of 0, which initializes an map of key and values
        // then with the input again enters the path for audio and gives the index also there
        // gets the user input ,assigns the value to first variable,
        // loops trough the user input, as a whole OK

    Scanner input = new Scanner(System.in);
    String userInput = input.nextLine().toUpperCase();
        Matcher matcher = Pattern.compile("([a-zA-Z])").matcher(userInput);
            while (matcher.find()) {
                letterToMorseCode(matcher.group(1));
                audioHandler.pathForAudio(matcher.group(1));
        }
            // maybe it needs to handle it here if it is not a letter add different things for
        // audio handler that would be
    }


    // mathes the correct letter with the correct key from the input
    private void letterToMorseCode(String morse) {
        // goes trough the key and values, filter the map for keys that match the index of the char, gets and prints the matching values , prints it before the
        letterToMorseCode.entrySet().stream().filter(map -> map.getKey().equals(morse)).map(Map.Entry::getValue).forEach(System.out::print);
    }
}
