package morsecode

import java.nio.file.Paths
import javax.sound.sampled.AudioInputStream
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.Clip
import javax.sound.sampled.UnsupportedAudioFileException


class AudioHandler {


    fun pathForAudio(character: String){
        val filePath = "src/main/resources/$character.wav"
        audioSetUp(filePath)
        breakBetweenCharacters()
    }

    private fun breakBetweenCharacters(){
        try {
            Thread.sleep(1100)
        }catch (e: InterruptedException){
            println(e.message)
            println(e.localizedMessage)
        }
    }

    private fun audioSetUp(filePath: String){
        try{
            val audioInputStream: AudioInputStream = AudioSystem.getAudioInputStream(Paths.get(filePath).toFile())
            val clip: Clip = AudioSystem.getClip()
            clip.open(audioInputStream)
            clip.start()
        }catch (e: UnsupportedAudioFileException ){
            println(e.message)
            println(e.localizedMessage)
        }
    }
}
