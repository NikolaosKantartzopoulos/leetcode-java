package problems


import spock.lang.Specification

class LongestRepeatingCharacterReplacementSpec extends Specification {
    def "Longest Repeating Character Replacement"() {
        expect:
            LongestRepeatingCharacterReplacement.characterReplacement(s,k) == result
        where:
            s | k | result
            "ABAB" | 2 |  4
            "AABABBA" | 1 |  4
    }
}