package cracking_the_coding_interview

/**
 *
 * Detect a Cycle
 *
 * A linked list is said to contain a cycle if any node is visited more than once while traversing the list.
 * Complete the function provided in the editor below.
 * It has one parameter: a pointer to a Node object named that points to the head of a linked list.
 * Your function must return a boolean denoting whether or not there is a cycle in the list.
 *
 * If there is a cycle, return true; otherwise, return false.
 *
 * https://www.youtube.com/watch?v=kSryp033xLA
 *
 */

fun main(args: Array<String>) {

    val head: Node? = null

    fun hasCycle(head: Node?): Boolean {
        if (head == null) return false

        var turtle: Node = head
        var hare: Node = head

        while (hare.next != null && hare.next?.next != null) {
            turtle = turtle.next!!
            hare = hare.next!!.next!!

            if (turtle === hare) return true
        }

        return false
    }
}

class Node {
    var next: Node? = null
}