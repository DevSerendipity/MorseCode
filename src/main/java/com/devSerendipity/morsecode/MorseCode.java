package com.devSerendipity.morsecode;

import java.util.Map;

public enum MorseCode {

    A( ".-"),
    B( "-..."),
    C( "-.-."),
    D( "-.."),
    E( "."),
    F( "..-."),
    G( "--."),
    H("...."),
    I(".."),
    J(".---"),
    K("-.-"),
    L(".-.."),
    M("--"),
    N("-."),
    O("---"),
    P(".--."),
    Q("--.-"),
    R(".-."),
    S("..."),
    T("-"),
    U("..-"),
    V("...-"),
    W(".--"),
    X("-..-"),
    Y("-.--"),
    Z("--.."),
    ONE(".----"),
    TWO("..---"),
    THREE("...--"),
    FOUR("....-"),
    FIVE("....."),
    SIX("-...."),
    SEVEN("--..."),
    EIGHT("---.."),
    NINE("----."),
    ZERO("-----"),
    AND(".-...");
    private static final Map<String, String> letterToMorseCode = Map.ofEntries(Map.entry("1", "ONE"),
                                                                               Map.entry("2", "TWO"),
                                                                               Map.entry("3", "THREE"),
                                                                               Map.entry("4", "FOUR"),
                                                                               Map.entry("5", "FIVE"),
                                                                               Map.entry("6", "SIX"),
                                                                               Map.entry("7", "SEVEN"),
                                                                               Map.entry("8", "EIGHT"),
                                                                               Map.entry("9", "NINE"),
                                                                               Map.entry("0", "ZERO"),
                                                                               Map.entry("&", "AND"));

    private final String morseCode;


    MorseCode(String morseCode) {
        this.morseCode = morseCode;
    }

    public static MorseCode getEnum(String s) {
        if ( letterToMorseCode.containsKey(s) ) {
            return valueOf(letterToMorseCode.get(s));
        }
        return valueOf(s);
    }
    public String getMorseCode() {
        return morseCode;
    }
}

