package Question1_3

/**
 * Created by juanito on 7/28/2019.
 */
class InPlace : Solution {
    override fun urlify(str: String, len: Int): String {
        // first need to count spaces
        val arr = CharArray(str.length)
        var idx = 0
        for (i in 0 until len) {
            if (str[i] != ' ') {
                arr[idx++] = str[i]
            } else {
                arr[idx++] = '%'
                arr[idx++] = '2'
                arr[idx++] = '0'
            }
        }
        return String(arr)
    }
}