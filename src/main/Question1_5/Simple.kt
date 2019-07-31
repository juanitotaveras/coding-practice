package Question1_5

/**
 * Created by juanito on 7/28/2019.
 */
class Simple : Solution {
    override fun oneAway(a: String, b: String): Boolean {
        // check if they are one insert, remove, or replace away
        return if (Math.abs(a.length - b.length) > 1) false
            else (oneReplaceAway(a, b) || oneInsertOrDeleteAway(a, b))
    }

    fun oneReplaceAway(a: String, b: String) : Boolean {
        if (a.length != b.length)
            return false
        var mismatches = 0
        for (i in 0 until a.length) {
            if (a[i] != b[i]) {
                if (mismatches > 0)
                    return false
                ++mismatches
            }
        }
        return mismatches < 2
    }

    fun oneInsertOrDeleteAway(a: String, b: String) : Boolean {
        // make sure a is longest
        val ast: String
        val bst: String
        if (a.length < b.length) {
            ast = b
            bst = a
        } else {
            ast = a
            bst = b
        }
        for (i in 0 until ast.length) {
            if (i >= bst.length) // a has extra char at end
                return true
            if (ast[i] != bst[i]) {
                // make sure everything else matches
                return ast.substring(i+1) == b.substring(i)
            }
        }
        return false
    }
}