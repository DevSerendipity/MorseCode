package com.morseCode;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputHandler {

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

    void loopTroughInput() {
        AudioHandler audioHandler = new AudioHandler();
        String userInput = getUserInput();
        Matcher matcher = Pattern.compile("([A-Z])").matcher(userInput);

        while (matcher.find()) {
            getMatchingValue(matcher.group(1));
            audioHandler.pathForAudio(matcher.group(1));
        }
    }

    private String getUserInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine().toUpperCase().strip();
    }

    private void getMatchingValue(String matchingCharacter) {
        // TODO figure out a way to print a word normally and separate where there is space
        System.out.print(letterToMorseCode.get(matchingCharacter) + " ");
    }
}