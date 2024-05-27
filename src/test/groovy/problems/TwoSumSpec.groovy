package problems


import spock.lang.Specification

class TwoSumSpec extends Specification {
    def "Two Sum"() {
        expect:
            TwoSum.twoSum(nums, target) == result;

        where:
            nums     | target | result
            [2, 7, 11, 15] as int[] | 9 as int | [0, 1]
            [-1,-2,-3,-4,-5] as int[] | -8 as int | [2, 4]
    }
}
