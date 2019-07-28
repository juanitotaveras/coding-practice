package Question1_3

/**
 * Created by juanito on 7/28/2019.
 */
class InPlace : Solution {
    override fun urlify(str: String, len: Int): String {
        val arr = CharArray(len + 30)
        var idx = 0
        for (i in 0 until str.length) {
            if (str[i] != ' ') {
                arr[idx++] = str[i]
            } else {
                arr[idx++] = '%'
                arr[idx++] = '2'
                arr[idx++] = '0'
            }
        }
        return String(arr).substring(0, idx)
    }
}