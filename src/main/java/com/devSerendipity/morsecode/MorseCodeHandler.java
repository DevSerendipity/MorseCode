package com.devSerendipity.morsecode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MorseCodeHandler {

    public void start() {
        loopTroughInput();
    }

    void loopTroughInput() {
        AudioHandler audioHandler = new AudioHandler();
        String userInput = getUserInput();
        Matcher matcher = Pattern.compile("([A-Z0-9,&])").matcher(userInput);

        while( matcher.find() ) {
            getMatchingValue(matcher.group(1));
            audioHandler.pathForAudio(matcher.group(1));
        }
    }

    private String getUserInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine().toUpperCase().strip();
    }

    private void getMatchingValue(String matchingCharacter) {
        System.out.print(MorseCode.getEnum(matchingCharacter).getMorseCode() + " ");
    }
}
