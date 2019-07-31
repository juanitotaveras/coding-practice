package Question1_5_Test

import Question1_5.Simple
import Question1_5.Solution
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by juanito on 7/28/2019.
 */
class SolutionTest {
    val solList = listOf(Simple())
    @Test fun shouldReturnTrue() {
        assert(true, "pale", "ple")
    }
    @Test fun shouldReturnTrue2() {
        assert(true, "pales", "pale")
    }
    @Test fun shouldReturnTrue3() {
        assert(true, "pale", "bale")
    }
    @Test fun shouldReturnFalse() {
        assert(false, "pale", "bake")
    }
    @Test fun shouldReturnFalse2() {
        assert(false, "paale", "bake")
    }

    private fun assert(expected: Boolean, a: String, b: String) {
        for (sol in solList) {
            assertEquals(expected, sol.oneAway(a, b))
        }
    }
}