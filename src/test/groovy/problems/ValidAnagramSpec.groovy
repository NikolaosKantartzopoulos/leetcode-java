package problems

import spock.lang.Specification

class ValidAnagramSpec extends Specification{
    def "Valid Anagram"(){
        expect:
            ValidAnagram.isAnagram(s,t) == result;

        where:
            s | t | result
            "anagram" | "nagaram" | true
            "rat" | "car" | false
    }
}
