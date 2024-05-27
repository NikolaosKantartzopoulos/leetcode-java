package data_structures

import spock.lang.Specification

class LinkedListSpec extends Specification {

    def "Test appending elements to LinkedList"() {
        given:
            LinkedList<Integer> list = new LinkedList<>(1)

        when:
            list.append(2)
            list.append(3)

        then:
            list.size() == 3
            list.getTail().value == 3
    }

    def "Test getting value at specific index"() {
        given:
            LinkedList<String> list = new LinkedList<>("A")
            list.append("B")
            list.append("C")

        expect:
            list.getValueAt(0) == "A"
            list.getValueAt(1) == "B"
            list.getValueAt(2) == "C"
    }

    def "Test getting head of LinkedList"() {
        given:
            LinkedList<Character> list = new LinkedList<>('A')
            list.append('B')
            list.append('C')

        expect:
            list.getHead().value == 'A'
    }

    def "Test LinkedList toString method"() {
        given:
            LinkedList<Integer> list = new LinkedList<>(1)
            list.append(2)
            list.append(3)

        expect:
            list.toString() == "1 -> 2 -> 3 -> null"
    }

    def "Test removing node at specific index"() {
        given:
            LinkedList<Integer> list = new LinkedList<>(1)
            list.append(2)
            list.append(3)

        when:
            LinkedListNode<Integer> removedNode = list.removeAt(1)

        then:
            list.size() == 2
            list.getHead().value == 1
            list.getTail().value == 3
            removedNode.value == 2
    }

    def "Test getNodeAt method"() {
        given:
            LinkedList<String> list = new LinkedList<>("A")
            list.append("B")
            list.append("C")

        expect:
            list.getNodeAt(0).value == "A"
            list.getNodeAt(1).value == "B"
            list.getNodeAt(2).value == "C"
            list.getNodeAt(3) == null // Index out of bounds
            list.getNodeAt(-1) == null // Index out of bounds
    }
}
