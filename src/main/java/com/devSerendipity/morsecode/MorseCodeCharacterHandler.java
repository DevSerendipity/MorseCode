package com.devSerendipity.morsecode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MorseCodeCharacterHandler {

    private final Scanner scanner = new Scanner(System.in);
    private final String input = scanner.nextLine().toUpperCase().strip();

    public void start() {
        loopTroughInput();
    }

    void loopTroughInput() {
        AudioHandler audioHandler = new AudioHandler();
        Matcher matcher = Pattern.compile("([A-Z\\d,&])").matcher(input);
        while( matcher.find() ) {
            System.out.print(MorseCode.getEnum(matcher.group()).getMorseCode() + " ");
            audioHandler.pathForAudio(matcher.group());
        }
    }

}
