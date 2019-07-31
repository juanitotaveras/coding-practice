package Question1_3_Test

import Question1_3.InPlace
import Question1_3.Solution
import org.junit.Assert
import org.junit.Test

/**
 * Created by juanito on 7/28/2019.
 */
class SolutionTest {
    val solList = listOf(InPlace())
    @Test fun shouldUrlify() {
        assert("Mr John Smith    ", 13, "Mr%20John%20Smith")
    }

    @Test fun shouldUrlify2() {
        assert("   ", 1, "%20")
    }

    @Test fun shouldNotUrlifyBlank() {
        assert("", 0, "")
    }
    private fun assert(str: String, len: Int, expected: String) {
        for (sol in solList) {
            val output = sol.urlify(str, len)
//            Assert.assertEquals(output.length, str.length)
            Assert.assertEquals(expected, sol.urlify(str, len))
        }
    }

}