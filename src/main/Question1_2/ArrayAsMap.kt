package Question1_2

/**
 * Created by juanito on 7/28/2019.
 */
class ArrayAsMap : Solution {
    // should return true if they have same char map
    override fun checkPermutation(a: String, b: String): Boolean {
        val map = IntArray(256)
        for (ch in a) {
            val idx = (ch - 'a').toInt()
            map[idx]++
        }
        for (ch in b) {
            val idx = (ch - 'a').toInt()
            map[idx]--
            if (map[idx] < 0)
                return false
        }
        map.forEach {
            if (it != 0)
                return false
        }
        return true
    }
}