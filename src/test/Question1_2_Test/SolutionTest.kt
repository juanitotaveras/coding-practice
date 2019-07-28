package Question1_2_Test

/**
 * Created by juanito on 7/28/2019.
 */
import Question1_2.ArrayAsMap
import Question1_2.Solution
import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    val solList = listOf(ArrayAsMap())
    @Test fun shouldReturnTrueForEmptyString() {
        assert("", "", true, solList)
    }

    @Test fun shouldReturnTrue() {
        assert("aabc", "cbaa", true, solList)
    }

    @Test fun shouldReturnFalse() {
        assert("aaabcp", "aaabca", false, solList)
    }

    private fun assert(a: String, b: String, expected: Boolean, solList: List<Solution>) {
        for (sol in solList)
            assertEquals(expected, sol.checkPermutation(a, b))
    }

}