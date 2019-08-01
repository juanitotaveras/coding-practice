package Question1_8_Test

import Question1_8.Simple
import org.junit.Assert
import org.junit.Test

/**
 * Created by juanito on 7/29/2019.
 */
class SolutionTest {
    private val solList = listOf(Simple())

    @Test fun shouldZeroOutMatrix() {
        val input = listOf(
                intArrayOf(4, 5, 6),
                intArrayOf(7,8,9),
                intArrayOf(10,0,12)
        )
        val expected = listOf(
                intArrayOf(4,0,6),
                intArrayOf(7,0,9),
                intArrayOf(0,0,0)
        )
        assert(expected, input)
    }

    private fun assert(expected: List<IntArray>, matrix: List<IntArray>) {
        for (s in solList) {
            val output = s.zeroMatrix(matrix)
            for (i in 0 until expected.count()) {
                for (j in 0 until expected[i].count()) {
                    Assert.assertEquals(expected[i][j], output[i][j])
                }
            }
        }
    }
}