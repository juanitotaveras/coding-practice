package Question1_1

class ArrayAsMap : Solution {
    /* Write a function that determines if a string has all unique characters. */
    override fun allUniqueCharacters(str: String): Boolean {
        val map: IntArray = IntArray(256) // assuming ASCII
        for (ch in str) {
            val idx = (ch - 'a').toInt()
            map[idx]++
            if (map[idx] > 1)
                return false
        }
        return true
    }
}