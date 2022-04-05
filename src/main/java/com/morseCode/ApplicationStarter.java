package com.morseCode;

public class ApplicationStarter {

    public static void main(String[] args) {
        System.out.println("Enter your text to convert to morse code and play it ");
        InputHandler inputHandler = new InputHandler();
        inputHandler.loopTroughInput();
    }
}