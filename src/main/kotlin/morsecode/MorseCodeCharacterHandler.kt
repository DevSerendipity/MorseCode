package morsecode
import java.util.regex.Pattern

class MorseCodeCharacterHandler {
    fun start() {
        loopTroughInput()
    }

    private fun loopTroughInput() {
        val audioHandler = AudioHandler()
        val input = readln().uppercase().trim()
        val matcher = Pattern.compile("([A-Z\\d,&])").matcher(input)
        while (matcher.find()) {
            print(MorseCode.getEnum(matcher.group()).morseCode + " ")
            audioHandler.pathForAudio(matcher.group())
        }
    }
}
