package problems


import spock.lang.Specification

class GroupAnagramsSpec extends Specification {

    static List<List<String>> sortLists(List<List<String>> lists) {
        lists.collect { it.sort() }.sort()
    }

    def "Group Anagrams"() {
        expect:
            sortLists(GroupAnagrams.groupAnagrams(strs)) == sortLists(output)

        where:
            strs                    | output
            ["eat","tea","tan","ate","nat","bat"] as String[] | [["bat"],["nat","tan"],["ate","eat","tea"]]
            [""] as String[]                                | [[""]]
            ["a"] as String[]                               | [["a"]]


    }
}
