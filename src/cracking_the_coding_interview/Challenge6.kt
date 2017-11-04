package cracking_the_coding_interview

import java.util.*

/**
 *  A Tale of Two Stacks
 *
 * A queue is an abstract data type that maintains the order in which elements were added to it,
 * allowing the oldest elements to be removed from the front and new elements to be added to the rear.
 * This is called a First-In-First-Out (FIFO) data structure because the first element added to the queue (i.e., the one that has been waiting the longest)
 * is always the first one to be removed.
 *
 * A basic queue has the following operations:
 * Enqueue: add a new element to the end of the queue.
 * Dequeue: remove the element from the front of the queue and return it.
 *
 */

fun main(args: Array<String>) {

    val stackNewestOnTop = Stack<Int>()
    val stackOldestOnTop = Stack<Int>()

    fun enqueue(value: Int) {
        stackNewestOnTop.push(value)
    }

    fun peek(): Int {

        if (stackOldestOnTop.isEmpty()) {
            while (!stackNewestOnTop.isEmpty()) {
                stackOldestOnTop.push(stackNewestOnTop.pop())
            }
        }

        return stackOldestOnTop.peek()
    }

    fun dequeue(): Int {
        if (stackOldestOnTop.isEmpty()) {
            while (!stackNewestOnTop.isEmpty()) {
                stackOldestOnTop.push(stackNewestOnTop.pop())
            }
        }

        return stackOldestOnTop.pop()
    }
}