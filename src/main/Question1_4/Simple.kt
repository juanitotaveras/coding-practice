package Question1_4

/**
 * Created by juanito on 7/28/2019.
 */
class Simple : Solution {
    override fun isPalindromePermutation(str: String): Boolean {
        val map = hashMapOf<Int, Int>()
        // all counts must be even, except for one count
        for (ch in str.toLowerCase()) {
            if (ch == ' ')
                continue
            val ascii = ch.toInt()
            map[ascii] = map.getOrDefault(ascii, 0) + 1
        }
        var oneOdd = false
        map.forEach{ (k, v) ->
            if (v % 2 != 0) {
                if (!oneOdd)
                    oneOdd = true
                else
                    return false
            }
        }
        return true
    }
}