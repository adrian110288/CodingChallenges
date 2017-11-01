package cracking_the_coding_interview

import java.util.*

/**
 *
 * Arrays: Left Rotation
 *
 * A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left.
 * For example, if 2 left rotations are performed on array [1,2,3,4,5],
 * then the array would become [3,4,5,1,2].
 *
 * Given an array of n integers and a number, d, perform  left rotations on the array.
 * Then print the updated array as a single line of space-separated integers.
 *
 */

fun main(args: Array<String>) {

    val rotation = 4

    val inputArray: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val outputArray = IntArray(inputArray.size)

    inputArray.forEachIndexed { index, i ->
        outputArray[(index - rotation + inputArray.size) % inputArray.size] = i
    }

    println(Arrays.toString(outputArray))
}