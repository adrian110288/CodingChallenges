package cracking_the_coding_interview

import java.util.*

/**
 *
 * Ransom Note
 *
 * A kidnapper wrote a ransom note but is worried it will be traced back to him.
 * He found a magazine and wants to know if he can cut out whole words from it and
 * use them to create an untraceable replica of his ransom note.
 * The words in his note are case-sensitive and he must use whole words available in the magazine, meaning he cannot use substrings or concatenation to create the words he needs.
 *
 * Given the words in the magazine and the words in the ransom note,
 * print Yes if he can replicate his ransom note exactly using whole words from the magazine;
 * otherwise, print No.
 */

fun main(args: Array<String>) {

    val MAGAZINE = "apgo clm w lxkvg mwz elo bg elo lxkvg elo apgo apgo w elo bg"
    val NOTE = "elo lxkvg bg mwz clm w"

    val magazineMap: MutableMap<String, Int>
    val noteMap: MutableMap<String, Int>

    magazineMap = HashMap()
    noteMap = HashMap()

    val magazineSplit = MAGAZINE.split(" ".toRegex()).dropLastWhile({ it.isEmpty() }).toTypedArray()
    for (word in magazineSplit) {
        magazineMap.put(word, if (magazineMap.containsKey(word)) magazineMap[word]!! + 1 else 1)
    }

    val noteSplit = NOTE.split(" ".toRegex()).dropLastWhile({ it.isEmpty() }).toTypedArray()
    for (word in noteSplit) {
        noteMap.put(word, if (noteMap.containsKey(word)) noteMap[word]!! + 1 else 1)
    }

    var canSolve = true;

    for ((word, count) in noteMap) {
        canSolve = count <= magazineMap[word]!!
    }

    print(if (canSolve) "YES" else "NO")
}