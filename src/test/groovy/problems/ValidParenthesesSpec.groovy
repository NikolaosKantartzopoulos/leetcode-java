package problems

import spock.lang.Specification

class ValidParenthesesSpec extends Specification{
    def "ValidParentheses" (){
        expect:
            ValidParentheses.isValid(s) == result;
        where:
            s           | result
            "()"        | true
            "()[]{}"    | true
            "(]"        | false
            "([])"      | true
            "([)]"      | false
    }
}
