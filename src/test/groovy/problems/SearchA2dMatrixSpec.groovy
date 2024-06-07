package problems;
import spock.lang.Specification;

class SearchA2dMatrixSpec extends Specification {
    def "SearchA2dMatrixSpec"(){
        expect:
        ProductOfArrayExceptSelf.productExceptSelf(nums) == result
        where:
        nums | result
            [1,2,3,4] as int[] | [24,12,8,6]
            [-1,1,0,-3,3] as int[] | [0,0,9,0,0]
    }
}
