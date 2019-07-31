package Question1_7

/**
 * Created by juanito on 7/29/2019.
 */
class InPlace : Solution {
    data class Coord(var row: Int, var col: Int)

    enum class Side {
        UP, RIGHT, DOWN, LEFT
    }

    override fun rotateMatrix(image: List<IntArray>): List<IntArray> {
        // up, right, down, left
        // layer num
        // elem position
        // ^ We can translate these params into an x/y coord
        val n = image.count()
        for (layerNum in 0 until n/2) {
            for (i in 0 until image[layerNum].count() - 1) {
                // perform swap 4 times
                val a = getCoord(Side.UP, layerNum, i, n)
                val b = getCoord(Side.RIGHT, layerNum, i, n)
                val c = getCoord(Side.DOWN, layerNum, i, n)
                val d = getCoord(Side.LEFT, layerNum, i, n)
                swap(a, b, image)
                swap(c, a, image)
                swap(a, d, image)
            }
        }
        return image
    }

    private fun swap(a: Coord, b: Coord, matrix: List<IntArray>) {
        val t = matrix[a.row][a.col]
        matrix[a.row][a.col] = matrix[b.row][b.col]
        matrix[b.row][b.col] = t
    }

    private fun getCoord(side: Side, layer: Int, pos: Int, n: Int) : Coord {
        var coord = Coord(0, 0)
        when (side) {
            Side.UP -> {
                coord.row += layer
                coord.col += pos
            }
            Side.RIGHT -> {
                coord.col = n - 1
                coord.col -= layer
                coord.row += pos
            }
            Side.DOWN -> {
                coord.col = n - 1
                coord.col -= pos
                coord.row = n - 1
                coord.row -= layer
            }
            Side.LEFT -> {
                coord.col += layer
                coord.row = n - 1
                coord.row -= pos
            }
        }
        return coord
    }
}