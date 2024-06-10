package problems

import spock.lang.Specification

class FindMinInRotatedSortedArraySpec extends Specification {
    def "test findMin"() {
        setup:
            FindMinInRotatedSortedArray solution = new FindMinInRotatedSortedArray()

        expect:
            solution.findMin(nums as int[]) == result

        where:
            nums                    || result
            [3, 4, 5, 1, 2]         as int[]|| 1
            [4, 5, 6, 7, 0, 1, 2]   as int[]|| 0
            [11, 13, 15, 17]        as int[]|| 11
    }
}
