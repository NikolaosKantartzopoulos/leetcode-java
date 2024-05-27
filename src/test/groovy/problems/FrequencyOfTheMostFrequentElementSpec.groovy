package problems


import spock.lang.Specification

class FrequencyOfTheMostFrequentElementSpec extends Specification{
    def "Frequency of the Most Frequent Element" (){
        expect:
            FrequencyOfTheMostFrequentElement.maxFrequency(nums,k) == res

        where:
            nums                 | k | res
            [1,2,4]     as int[] | 5 | 3
//            [1,4,8,13]  as int[] | 5 | 2
//            [3,9,6]     as int[] | 2 | 1

    }
}
