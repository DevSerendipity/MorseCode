package com.morseCode;

import java.util.stream.Stream;

public enum MorseCode {
    A(".-"),
    B("-..."),
    C("-.-."),
    D("-.."),
    E("."),
    F("..-."),
    G("--."),
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
    Z("--..");

    private final String morseCodeValue;

    MorseCode(String label) {
        this.morseCodeValue = label;
    }

    public String getMorseCodeValue() {
        return morseCodeValue;
    }

    public static Stream<MorseCode> stream() {
        return Stream.of(MorseCode.values());
    }
}
