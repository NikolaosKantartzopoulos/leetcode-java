package problems

import spock.lang.Specification

class SearchA2dMatrixSpec extends Specification {
    def "test search matrix functionality"() {
        expect:
            SearchA2dMatrix.searchMatrix(matrix, target) == result

        where:
            matrix                                      | target | result
            [[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 60]] as int[][] | 3    | true
            [[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 60]] as int[][] | 13   | false
    }
}
