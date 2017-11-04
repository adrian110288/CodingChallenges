package cracking_the_coding_interview

/**
 *
 * Anagram
 *
 * Alice is taking a cryptography class and finding anagrams to be very useful.
 * We consider two strings to be anagrams of each other
 * if the first string's letters can be rearranged to form the second string. In other words, both strings must contain the same exact letters in the same exact frequency For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
 *
 * Alice decides on an encryption scheme involving two large strings where encryption is
 * dependent on the minimum number of character deletions required to make the two strings anagrams. Can you help her find this number?
 *
 * Given two strings, a and b, that may or may not be of the same length,
 * determine the minimum number of character deletions required to make a and b anagrams.
 *
 * Any characters can be deleted from either of the strings.
 */

fun main(args: Array<String>) {

    val first = "fcrxzwscanmligyxyvym"
    val second = "jxwtrhvujlmrpdoqbisbwhmgpmeoke"

    val counts = IntArray(26)
    val a = 'a'

    var charArray = first.toCharArray()

    for (i in charArray.indices) {
        counts[charArray[i] - a]++
    }

    charArray = second.toCharArray()
    for (i in charArray.indices) {
        counts[charArray[i] - a]--
    }

    val sum = counts.indices.sumBy { Math.abs(counts[it]) }

    println(sum)
}