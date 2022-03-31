package com.morseCode;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class AudioHandler {
    void pathForAudio(String morse) {
        ThreadHandler threadManager = new ThreadHandler();
            String filePath = "src/main/resources/" + morse + ".wav";
            audioSetUp(filePath);
            threadManager.sleepConditions();

    }
    private void audioSetUp(String filePath) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }
}
