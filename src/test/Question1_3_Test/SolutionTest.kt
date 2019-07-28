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
        assert("Mr John Smith", 13, "Mr%20John%20Smith", solList)
    }
    private fun assert(str: String, len: Int, expected: String, solList: List<Solution>) {
        for (sol in solList)
            Assert.assertEquals(expected, sol.urlify(str, len))
    }

}