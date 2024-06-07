package basic_algorithms

import spock.lang.Specification

class BinarySearchSpec extends Specification {

    def "test contains_number method"() {
        expect:
            BinarySearch.contains_number(nums, target) == result

        where:
            nums                        | target | result
            [1, 2, 3, 4, 5] as int[]    | 3      | true
            [1, 2, 3, 4, 5] as int[]    | 6      | false
            [] as int[]                 | 1      | false
            null                        | 1      | false
            [1, 3, 5, 7, 9, 11] as int[]| 5      | true
            [1, 3, 5, 7, 9, 11] as int[]| 8      | false
    }

    def "test binary_search_num method"() {
        expect:
            BinarySearch.binary_search_num(nums, target) == result

        where:
            nums                        | target | result
            [1, 2, 3, 4, 5] as int[]    | 3      | 2
            [1, 2, 3, 4, 5] as int[]    | 6      | -1
            [] as int[]                 | 1      | -1
            null                        | 1      | -1
            [1, 3, 5, 7, 9, 11] as int[]| 5      | 2
            [1, 3, 5, 7, 9, 11] as int[]| 8      | -1
    }
}
