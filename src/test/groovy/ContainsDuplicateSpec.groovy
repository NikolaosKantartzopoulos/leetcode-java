import problems.ContainsDuplicate
import spock.lang.Specification

class ContainsDuplicateSpec extends Specification{
    def "Contains Duplicate"() {
        expect:
            ContainsDuplicate.containsDuplicate(nums) == output

        where:
            nums                           | output
            [1, 2, 3, 1]                   as int[]| true
            [1, 2, 3, 4]                   as int[]| false
            [1, 1, 1, 3, 3, 4, 3, 2, 4, 2] as int[]| true

    }
    }