import org.jetbrains.annotations.NotNull;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.io.File;
import java.io.IOException;

public class Audio{
    private Clip clip;
    private String filePath;
    // method for giving the path to the audio and playing the file
    private void pathAndAudio(@NotNull String morse, int index) {
        try {
            if (Character.isWhitespace(morse.charAt(index))) {
                Thread.sleep(700);
            } else {
                filePath = "C:\\Users\\{...}\\OneDrive\\Documents\\NewOne\\morseCode\\src\\" + morse.charAt(index) + ".wav";
                initialize();
                play();
                SetUp.conditionSleep(index);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    // method for setting up the clip for playing the file, without the clip the file won't start
    private void initialize()  {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());

            // create clip reference
            clip = AudioSystem.getClip();
            // open audioInputStream to the clip
            clip.open(audioInputStream);
        }catch (IOException | UnsupportedAudioFileException | LineUnavailableException ex){
            ex.printStackTrace();
        }
    }
    // Method to play the audio
    private void play() {
        //start the clip
        clip.start();
    }
    public void getPathAndAudio(String morse, int index){
        this.pathAndAudio(morse,index);
    }

}
