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

    val input = Scanner(System.`in`)

    val arraySize = input.nextInt()
    val rotation = input.nextInt()

    val inputArray = IntArray(arraySize) { input.nextInt() }
    val outputArray = IntArray(arraySize)

    inputArray.forEachIndexed { index, i ->
        outputArray[(index - rotation + arraySize) % arraySize] = i
    }

    outputArray.forEach {
        print(it)
        print(" ")
    }


//    println(Arrays.toString(outputArray))
}
