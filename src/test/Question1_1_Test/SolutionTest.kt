package Question1_1_Test

import Question1_1.ArrayAsMap
import Question1_1.BitVectorAsMap
import Question1_1.Solution
import Question1_1.WorksForAnyChar
import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    val solList = listOf(ArrayAsMap(), BitVectorAsMap(), WorksForAnyChar())
    @Test fun shouldReturnTrueForEmptyString() {
        assert("", true, solList)
    }

    @Test fun shouldReturnFalse() {
        assert("aabc", false, solList)
    }

    @Test fun shouldReturnFalse2() {
        assert("aabcaaa", false, solList)
    }

    @Test fun shouldReturnTrue() {
        assert("abc", true, solList)
    }

    private fun assert(str: String, expected: Boolean, solList: List<Solution>) {
        for (sol in solList)
            assertEquals(expected, sol.allUniqueCharacters(str))
    }

}