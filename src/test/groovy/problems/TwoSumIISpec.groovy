package problems


import spock.lang.Specification

class TwoSumIISpec extends Specification{
    def"Two Sum II"(){
        expect:
            TwoSumII.twoSum(numbers, target) == findResult
        where:
            numbers     | target | findResult
            [2,7,11,15] as int [] | 9 as int | [1,2] as int[]
            [2,3,4]     as int [] | 6 as int | [1,3] as int[]
            [-1,0]      as int [] | -1 as int | [1,2] as int[]
    }
}
