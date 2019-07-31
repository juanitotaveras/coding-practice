package Question1_6

/**
 * Created by juanito on 7/29/2019.
 */
class Simple : Solution {
    override fun compress(str: String): String {
        if (str.isEmpty())
            return str

        var curChar = str[0]
        var curCount = 1
        val output = StringBuilder()
        for (i in 1 until str.length) {
            if (str[i] != curChar) {
                output.append(curChar).append(curCount)
                curChar = str[i]
                curCount = 1
            } else {
                ++curCount
            }
        }
        output.append(curChar).append(curCount)
        return if (output.length < str.length) output.toString() else str
    }
}