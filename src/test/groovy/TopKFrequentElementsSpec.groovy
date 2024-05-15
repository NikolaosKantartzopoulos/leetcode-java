import problems.TopKFrequentElements
import spock.lang.Specification

class TopKFrequentElementsSpec extends Specification{
    def "TopKFrequentElements"(){
        expect:
            TopKFrequentElements.topKFrequent(nums,k) == result

        where:
            nums | k | result
            [1,1,1,2,2,3] as int[] | 2 | [1,2]
            [1] as int[]| 1 | [1]
    }
}
