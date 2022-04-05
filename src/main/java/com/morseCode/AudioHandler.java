package com.morseCode;

import javax.sound.sampled.*;
import java.io.IOException;
import java.nio.file.Paths;

public class AudioHandler {

    void pathForAudio(String character) {
        String filePath = "src/main/resources/" + character + ".wav";
        audioSetUp(filePath);
        breakBetweenLetters();
    }

    private void breakBetweenLetters() {
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
        }
    }

    private void audioSetUp(String filePath) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(Paths.get(filePath).toFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
        }
    }
}