import problems.TwoSum
import spock.lang.Specification

class TwoSumIISpec extends Specification{
    def"Two Sum II"(){
        expect:
            TwoSum.twoSum(numbers, target) == findResult
        where:
            numbers     | target | result
            [2,7,11,15] | 9      | [1,2]
            [2,3,4]     | 6      | [1,3]
            [-1,0]      | 1      | [1,2]
    }
}
