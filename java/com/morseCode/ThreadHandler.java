package com.morseCode;

public class ThreadHandler extends InputHandler{
    void sleepConditions() {
        try {
            // Thread sleep based on word lenth
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}