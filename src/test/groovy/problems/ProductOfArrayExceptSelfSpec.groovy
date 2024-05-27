package problems


import spock.lang.Specification

class ProductOfArrayExceptSelfSpec extends Specification {
    def "ProductOfArrayExceptSelf"(){
        expect:
            ProductOfArrayExceptSelf.productExceptSelf(nums) == result
        where:
            nums | result
            [1,2,3,4] as int[] | [24,12,8,6]
            [-1,1,0,-3,3] as int[] | [0,0,9,0,0]
    }
}
