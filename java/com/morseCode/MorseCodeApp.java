package com.morseCode;

//TODO Move everything in one class
//TODO make sure it works
//TODO Improve the naming
// Name your variables based on the terms of the subject area, so that the variable name clearly describes its purpose.
// consider what is the responsibility of that piece of code.
// the name needs to suggest the purpose of the variable, but not its possible values.
// This implies that the rule of naming things at one level of abstraction higher than its content concerns is applicable to methods and variables, but not to classes.
// Methods and variables should be named at one level of abstraction higher than its body, but naming classes is a different story.
// todo class
// Try to use nouns because a class is normally representing something in the real world:
// noun is a person,place,thing or idea that are performing the action of the sentence subjects
// The name of a class should be based on its current assumptions of what it does
// todo methods
// Use verbs to describe what the method does:
// verbs are indicating or describing the action happening in a sentence
// todo variables
// The names should represent what the value of the variable represents:
//TODO
//TODO
//TODO
//TODO
//TODO learn to improve my architecture
public class MorseCodeApp {

    public static void main(String[] args) {
        // displays the message than enters method
        System.out.println("Enter your text to convert to morse code and play it ");
        InputHandler inputHandler = new InputHandler();
        inputHandler.loopTroughInput();
    }

    // gets the index of the letter than gives that index and creates a path for the audio
    // so handling the audio, and the thread


}