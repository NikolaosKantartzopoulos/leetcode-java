import problems.ValidPalindrome
import spock.lang.Specification

class ValidPalindromeSpec extends  Specification{
    def "isPalindrome"(){
        expect:
            ValidPalindrome.isPalindrome(s) == result
        where:
            s | result
        "A man, a plan, a canal: Panama" | true
        "race a car" | false
        " " | true

    }
}
