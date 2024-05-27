package problems


import spock.lang.Specification

class LongestSubstringWithoutRepeatingCharactersSpec extends Specification{
    def "Longest Substring Without Repeating Characters" () {
        expect:
            LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s) == result
        where:
            s           | result
//            "abcabcbb"  | 3
            "bbbbb"     | 1
//            "pwwkew"    | 3
    }
}
