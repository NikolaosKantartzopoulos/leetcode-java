package problems

import spock.lang.Specification

class FindTargetInRotatedSortedArraySpec extends  Specification{
    def "FindTargetInRotatedSortedArray" () {
        expect:
            FindTargetInRotatedSortedArray.search(nums, target) == expected

        where:
            nums                                  | target || expected
            [4, 5, 6, 7, 0, 1, 2]         as int[]| 0      || 4
            [4, 5, 6, 7, 0, 1, 2]         as int[]| 3      || -1
            [1]                           as int[]| 0      || -1
            [1, 3]                        as int[]| 3      || 1
            [3, 1]                        as int[]| 1      || 1
            [4, 5, 6, 7, 8, 9, 1, 2, 3]   as int[]| 6      || 2
            [6, 7, 8, 1, 2, 3, 4, 5]      as int[]| 8      || 2
    }
}
