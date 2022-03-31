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

    Scanner input = new Scanner(System.in);
    String userInput = input.nextLine().toUpperCase();
        Matcher matcher = Pattern.compile("([a-zA-Z])").matcher(userInput);
            while (matcher.find()) {
                letterToMorseCode(matcher.group(1));
                audioHandler.pathForAudio(matcher.group(1));
        }
    }


    private void letterToMorseCode(String morse) {
        letterToMorseCode.entrySet().stream().filter(map -> map.getKey().equals(morse)).map(Map.Entry::getValue).forEach(System.out::print);
    }
}
