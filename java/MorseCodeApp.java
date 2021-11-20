public class MorseCodeApp {
    public static void main(String[] args) {
        System.out.println("Enter your text to convert to morse code and play it ");
        LetterMatcher letterMatcher = new LetterMatcher();
        letterMatcher.loopTroughInput();
    }
}