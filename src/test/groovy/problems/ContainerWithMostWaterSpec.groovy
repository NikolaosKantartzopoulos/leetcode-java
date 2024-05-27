package problems


import spock.lang.Specification

class ContainerWithMostWaterSpec extends Specification{
    def "Container with most water"(){

    expect:
        ContainerWithMostWater.maxArea(height) == result
    where:
        height | result
        [1,8,6,2,5,4,8,3,7] as int[]| 49
        [1,1]as int[] | 1
    }
}
