package Question1_6_Test

/**
 * Created by juanito on 7/29/2019.
 */
import Question1_6.Simple
import org.junit.Assert.assertEquals
import org.junit.Test

class SolutionTest {
    val solList = listOf(Simple())

    @Test fun shouldCompress() {
        assert("a2b1c5a3", "aabcccccaaa")
    }

    @Test fun shouldCompress2() {
        assert("a10", "aaaaaaaaaa")
    }

    private fun assert(expected: String, str: String) {
        for (s in solList) {
            assertEquals(expected, s.compress(str))
        }
    }
}