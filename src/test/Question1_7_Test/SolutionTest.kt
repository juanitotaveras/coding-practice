package Question1_7_Test

import Question1_7.InPlace
import Question1_7.Solution
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by juanito on 7/29/2019.
 */
class SolutionTest {
    val solList: List<Solution> = listOf(InPlace())

    @Test fun shouldRotate() {
        // right rotation
        val expected = listOf(
                intArrayOf(10,9,8),
                intArrayOf(7,6,5),
                intArrayOf(4,3,2)
        )
        val input = listOf(
                intArrayOf(8,5,2),
                intArrayOf(9,6,3),
                intArrayOf(10,7,4)
        )
        assert(expected, input)
    }

    private fun assert(expected: List<IntArray>, matrix: List<IntArray>) {
        for (s in solList) {
            val output = s.rotateMatrix(matrix)
            for (i in 0 until expected.count()) {
                for (j in 0 until expected[i].count()) {
                    assertEquals(expected[i][j], output[i][j])
                }
            }
        }
    }
}