package Question1_2_Test

/**
 * Created by juanito on 7/28/2019.
 */
import Question1_2.ArrayAsMap
import Question1_2.NoExtraDataStructures
import Question1_2.Solution
import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    val solList = listOf(ArrayAsMap(), NoExtraDataStructures())
    @Test fun shouldReturnTrueForEmptyString() {
        assert("", "", true)
    }

    @Test fun shouldReturnTrue() {
        assert("aabc", "cbaa", true)
    }

    @Test fun shouldReturnFalse() {
        assert("aaabcp", "aaabca", false)
    }

    private fun assert(a: String, b: String, expected: Boolean) {
        for (sol in solList)
            assertEquals(expected, sol.checkPermutation(a, b))
    }

}