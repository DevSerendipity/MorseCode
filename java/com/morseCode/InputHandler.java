package com.morseCode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputHandler {

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
        MorseCode.stream().filter(map -> map.toString().equals(matchingCharacter)).forEach(morseCode -> System.out.print(morseCode.getMorseCodeValue() + " "));
    }
}