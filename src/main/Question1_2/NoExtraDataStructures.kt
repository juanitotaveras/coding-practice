package Question1_2

/**
 * Created by juanito on 7/28/2019.
 */
class NoExtraDataStructures : Solution {
    override fun checkPermutation(a: String, b: String): Boolean {
        return sort(a) == sort(b)
    }

    private fun sort(str: String) : String {
        val arr = str.toCharArray()
        arr.sort()
        return String(arr)
    }
}