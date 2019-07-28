package Question1_1

/**
 * Created by juanito on 7/28/2019.
 */
class BitVectorAsMap: Solution {
    override fun allUniqueCharacters(str: String): Boolean {
        var map = 0
        for (ch in str) {
            val idx = (ch - 'a').toInt()
            val bit = 1 shl(idx)
            // if this bit in map already has a 1, return false
            val prevBit = map and bit
            if (prevBit > 0)
                return false
            map  = bit or map
        }
        return true
    }
}