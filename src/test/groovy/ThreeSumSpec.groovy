import problems.ThreeSum
import spock.lang.Specification

class ThreeSumSpec extends Specification{
    def "ThreeSum" () {
        expect:
            ThreeSum.threeSum(nums) == result
        where:
            nums             | result
            [-1,0,1,2,-1,-4] as int[]| [[-1,-1,2],[-1,0,1]]
            [0,1,1]          as int[]| []
            [0,0,0]          as int[]| [[0,0,0]]
    }
}
