package Question1_1

import java.util.*

/**
 * Created by juanito on 7/28/2019.
 */
class NoExtraDataStructures : Solution {
    override fun allUniqueCharacters(str: String): Boolean {
        val arr = str.toCharArray()
        arr.sort()
        for (i in 0 until arr.count() - 1)
            if (arr[i] == arr[i + 1])
                return false
        return true
    }
}