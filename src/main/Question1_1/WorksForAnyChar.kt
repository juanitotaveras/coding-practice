package Question1_1

/**
 * Created by juanito on 7/28/2019.
 */
class WorksForAnyChar : Solution {
    override fun allUniqueCharacters(str: String): Boolean {
        val map = hashMapOf<Int, Int>()
        for (ch in str) {
            val ascii = ch.toInt()
            map[ascii] = map.getOrDefault(ascii, 0) + 1
            map[ascii]?.let {
                if (it > 1)
                    return false
            }
        }
        return true
    }
}