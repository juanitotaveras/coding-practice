package Question1_4_Test

import Question1_4.Simple
import Question1_4.Solution
import org.junit.Assert
import org.junit.Test

/**
 * Created by juanito on 7/28/2019.
 */
class SolutionTest {
    val solList = listOf(Simple())
    @Test fun shouldReturnTrue() {
        assert("Tact Coa", true)
    }

    @Test fun shouldReturnFalse() {
        assert("xyz0", false)
    }

    @Test fun blankShouldReturnTrue() {
        assert("", true)
    }

    private fun assert(str: String, expected: Boolean) {
        for (sol in solList) {
            Assert.assertEquals(expected, sol.isPalindromePermutation(str))
        }
    }
}