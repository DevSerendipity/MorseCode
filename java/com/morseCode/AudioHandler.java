package com.morseCode;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class AudioHandler {
    void pathForAudio(String morse) {
        ThreadHandler threadManager = new ThreadHandler();
        // checks if the characters is not white space at the index, and creates a path with that character
        // than it goes to adui set up with the path
        // than it sleeps a bit before doing the same for the other character
            String filePath = "src/main/resources/" + morse + ".wav";
            audioSetUp(filePath);
            threadManager.sleepConditions();

    }
    // playing the audio and handling it also
    private void audioSetUp(String filePath) {
        // than it comes here with already having the path and making the path in the AIS, than it gets the clip and starts the audio
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
