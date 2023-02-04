package morsecode

enum class MorseCode(val morseCode: String) {
    A(".-"), B("-..."), C("-.-."), D("-.."), E("."), F("..-."), G("--."), H("...."), I(".."), J(".---"), K("-.-"), L(".-.."), M(
        "--"
    ),
    N("-."), O("---"), P(".--."), Q("--.-"), R(".-."), S("..."), T("-"), U("..-"), V("...-"), W(".--"), X("-..-"), Y("-.--"), Z(
        "--.."
    ),
    ONE(".----"), TWO("..---"), THREE("...--"), FOUR("....-"), FIVE("....."), SIX("-...."), SEVEN("--..."), EIGHT("---.."), NINE(
        "----."
    ),
    ZERO("-----"), AND(".-...");

    companion object {
        private val letterToMorseEnum = mapOf(
            "1" to "ONE",
            "2" to "TWO",
            "3" to "THREE",
            "4" to "FOUR",
            "5" to "FIVE",
            "6" to "SIX",
            "7" to "SEVEN",
            "8" to "EIGHT",
            "9" to "NINE",
            "0" to "ZERO",
            "&" to "AND"
        )

        fun getEnum(s: String): MorseCode {
            return if (letterToMorseEnum.containsKey(s)) {
                valueOf(letterToMorseEnum[s]!!)
            } else valueOf(s)
        }
    }
}
