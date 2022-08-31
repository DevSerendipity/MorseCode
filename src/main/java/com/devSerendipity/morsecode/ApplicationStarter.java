package com.devSerendipity.morsecode;

public class ApplicationStarter {

    public static void main(String[] args) {
        System.out.println("Enter your text to convert to morse code and play it ");
        MorseCodeCharacterHandler morseCodeCharacterHandler = new MorseCodeCharacterHandler();
        morseCodeCharacterHandler.start();
    }
}
