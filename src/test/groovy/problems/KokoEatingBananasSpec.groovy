package problems

import spock.lang.Specification


class KokoEatingBananasSpec extends Specification {

    def "Koko loves to eat bananas"() {
        expect:
            KokoEatingBananas.minEatingSpeed(piles as int[], h) == result

        where:
        piles                | h  || result
        [3, 6, 7, 11]        | 8  || 4
        [30, 11, 23, 4, 20]  | 5  || 30
        [30, 11, 23, 4, 20]  | 6  || 23
    }
}
