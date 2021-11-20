import javax.sound.sampled.*;

import java.io.File;
import java.io.IOException;

public class AudioInitialization {

    public void pathForAudio(String text, int index) {
        if (!(Character.isWhitespace(text.charAt(index)))){
            String filePath = "src/main/resources/" + text.charAt(index) + ".wav";
            audioSetUp(filePath);
            sleepConditions(text, index);
        }else{
            System.out.print(" / ");
        }
    }

    private void audioSetUp(String filePath)  {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }

    private void sleepConditions(String morse, int index) {
        try {
            if (Character.isWhitespace(morse.charAt(index)) || Character.isTitleCase('\'') || Character.isTitleCase(',')) {
                Thread.sleep(700);
            } else if(Character.isLetter(morse.charAt(index))){
                indexConditions(index);
            }else{
                throw new IllegalArgumentException();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void indexConditions(int index) throws InterruptedException {
        if (index < 3) Thread.sleep(1300);
        else Thread.sleep(1000);
    }
}