package problems


import spock.lang.Specification

class BestTimeToBuyAndSellStockSpec extends Specification{
    def 'Best Time To Buy And Sell Stock'(){
        expect:
            BestTimeToBuyAndSellStock.maxProfit(prices) == result
        where:
            prices | result
            [7,1,5,3,6,4] as int[] | 5
            [7,6,4,3,1]   as int[] | 0
    }
}
