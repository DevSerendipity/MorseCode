package com.devSerendipity.morsecode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MorseCodeCharacterHandler {

    public void start() {
        loopTroughInput();
    }

    void loopTroughInput() {
        AudioHandler audioHandler = new AudioHandler();
        String userInput = getUserInput();
        Matcher matcher = Pattern.compile("([A-Z\\d,&])").matcher(userInput);

        while( matcher.find() ) {
            System.out.println(MorseCode.getEnum(matcher.group(1)));
            audioHandler.pathForAudio(matcher.group(1));
        }
    }

    private String getUserInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine().toUpperCase().strip();
    }

}
