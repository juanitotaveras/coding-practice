package Question1_1_Test

import Question1_1.*
import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    val solList = listOf(ArrayAsMap(), BitVectorAsMap(), WorksForAnyChar(), NoExtraDataStructures())
    @Test fun shouldReturnTrueForEmptyString() {
        assert("", true)
    }

    @Test fun shouldReturnFalse() {
        assert("aabc", false)
    }

    @Test fun shouldReturnFalse2() {
        assert("aabcaaa", false)
    }

    @Test fun shouldReturnTrue() {
        assert("abc", true)
    }

    private fun assert(str: String, expected: Boolean) {
        for (sol in solList)
            assertEquals(expected, sol.allUniqueCharacters(str))
    }

}