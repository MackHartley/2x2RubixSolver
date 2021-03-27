import RubixColor.*

class Cube(val state: List<List<List<RubixColor>>>) {
    fun isSolved(): Boolean {
        return isFrontSolved() && isLeftSolved() && isTopSolved()
    }

    fun calculateCubeState(steps: List<Step>): Cube {
        var lastCubeState = this
        for (step in steps) {
            lastCubeState = when (step) {
                Step.RotateFrontCW -> lastCubeState.rotateFrontCW()
                Step.RotateFrontCCW -> lastCubeState.rotateFrontCCW()
                Step.RotateTopLeft -> lastCubeState.rotateTopLeft()
                Step.RotateTopRight -> lastCubeState.rotateTopRight()
                Step.RotateRightUp -> lastCubeState.rotateRightUp()
                Step.RotateRightDown -> lastCubeState.rotateRightDown()
            }
        }
        return lastCubeState
    }

    fun rotateFrontCW(): Cube {
        val firstLayer = arrayListOf(
            arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
            arrayListOf(EMPTY, state[0][2][1], state[0][1][1], EMPTY),
            arrayListOf(EMPTY, state[0][2][2], state[0][1][2], EMPTY),
            arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
        )
        val secondLayer = arrayListOf(
            arrayListOf(EMPTY, state[1][2][0], state[1][1][0], EMPTY),
            arrayListOf(state[1][3][1], EMPTY, EMPTY, state[1][0][1]),
            arrayListOf(state[1][3][2], EMPTY, EMPTY, state[1][0][2]),
            arrayListOf(EMPTY, state[1][2][3], state[1][1][3], EMPTY)
        )
        val thirdLayer = state[2]
        val fourthLayer = state[3]
        return Cube(
            arrayListOf(
                firstLayer,
                secondLayer,
                thirdLayer,
                fourthLayer
            )
        )
    }

    fun rotateFrontCCW(): Cube {
        val firstRot = this.rotateFrontCW()
        val secondRot = firstRot.rotateFrontCW()
        val thirdRot = secondRot.rotateFrontCW()
        return thirdRot
    }

    fun rotateTopLeft(): Cube {
        val data = arrayListOf(
            arrayListOf(
                arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
                arrayListOf(EMPTY, state[1][1][3], state[2][1][3], EMPTY),
                state[0][2],
                state[0][3]
            ),
            arrayListOf(
                arrayListOf(EMPTY, state[1][0][2], state[2][0][2], EMPTY),
                arrayListOf(state[0][1][2], EMPTY, EMPTY, state[3][1][2]),
                state[1][2],
                state[1][3]
            ),
            arrayListOf(
                arrayListOf(EMPTY, state[1][0][1], state[2][0][1], EMPTY),
                arrayListOf(state[0][1][1], EMPTY, EMPTY, state[3][1][1]),
                state[2][2],
                state[2][3]
            ),
            arrayListOf(
                arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
                arrayListOf(EMPTY, state[1][1][0], state[2][1][0], EMPTY),
                state[3][2],
                state[3][3]
            )
        )
        return Cube(data)
    }

    fun rotateTopRight(): Cube {
        val firstRot = this.rotateTopLeft()
        val secondRot = firstRot.rotateTopLeft()
        val thirdRot = secondRot.rotateTopLeft()
        return thirdRot
    }

    fun rotateRightUp(): Cube {
        val data = arrayListOf(
            arrayListOf(
                arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
                arrayListOf(EMPTY, state[0][1][1], state[1][3][2], EMPTY),
                arrayListOf(EMPTY, state[0][2][1], state[2][3][2], EMPTY),
                arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
            ),
            arrayListOf(
                arrayListOf(EMPTY, state[1][0][1], state[0][2][2], EMPTY),
                arrayListOf(state[1][1][0], EMPTY, EMPTY, state[1][2][3]),
                arrayListOf(state[1][2][0], EMPTY, EMPTY, state[2][2][3]),
                arrayListOf(EMPTY, state[1][3][1], state[3][2][2], EMPTY)
            ),
            arrayListOf(
                arrayListOf(EMPTY, state[2][0][1], state[0][1][2], EMPTY),
                arrayListOf(state[2][1][0], EMPTY, EMPTY, state[1][1][3]),
                arrayListOf(state[2][2][0], EMPTY, EMPTY, state[2][1][3]),
                arrayListOf(EMPTY, state[2][3][1], state[3][1][2], EMPTY)
            ),
            arrayListOf(
                arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
                arrayListOf(EMPTY, state[3][1][1], state[1][0][2], EMPTY),
                arrayListOf(EMPTY, state[3][2][1], state[2][0][2], EMPTY),
                arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
            )
        )
        return Cube(data)
    }

    fun rotateRightDown(): Cube {
        val firstRot = this.rotateRightUp()
        val secondRot = firstRot.rotateRightUp()
        val thirdRot = secondRot.rotateRightUp()
        return thirdRot
    }

    private fun isFrontSolved(): Boolean {
        return allSame(state[0][1][1], state[0][1][2], state[0][2][1], state[0][2][2])
    }
    private fun isLeftSolved(): Boolean {
        return allSame(state[1][1][0], state[1][2][0], state[2][1][0], state[2][2][0])
    }
    private fun isTopSolved(): Boolean {
        return allSame(state[1][0][1], state[1][0][2], state[2][0][1], state[2][0][2])
    }

    private fun allSame(first: RubixColor, second: RubixColor, third: RubixColor, fourth: RubixColor): Boolean {
        return (first == second) && (second == third) && (third == fourth)
    }

    override fun toString(): String {
        val str = StringBuilder()
        for (i in state.indices) {
            for (j in state[i].indices) {
                for (k in state[i][j].indices) {
                    str.append(state[i][j][k].ordinal.toString())
                }
            }
        }
        return str.toString()
    }

    fun cubesEqivalent(other: Cube) {

    }



    //    override fun equals(other: Any?): Boolean {
//        return when (other) {
//            is Cube -> {
//                for (i in state.indices) {
//                    val arr = state[i]
//                    for (j in arr.indices) {
//                        val finalArr = arr[j]
//                        for (k in finalArr.indices) {
//                            if (state[i][j][k] != other.state[i][j][k]) return false
//                        }
//                    }
//                }
//                return true
//            }
//            else -> false
//        }
//    }
//
//    override fun hashCode(): Int {
//        return 1
//    }
}