import org.junit.Test
import RubixColor.*
import junit.framework.Assert.assertEquals

class CubeTest {

    @Test
    fun testRotateRightDown() {
        assertEquals(Cube(rotateRightDown).toString(), rotateRightDownCalc.toString())
        assertEquals(Cube(afterRotateRightDown).toString(), Cube(beforeRotateRightDown).rotateRightDown().toString())
    }

    @Test
    fun testRotateTopLeft() {
        assertEquals(Cube(rotateTopLeft).toString(), rotateTopLeftCalc.toString())
        assertEquals(Cube(afterRotateTopLeft).toString(), Cube(beforeRotateTopLeft).rotateTopLeft().toString())
    }

    @Test
    fun testRotateFrontCW() {
        assertEquals(Cube(rotateFrontCW1).toString(), rotateFrontCwCalc1.toString())
        assertEquals(Cube(rotateFrontCW2).toString(), rotateFrontCwCalc2.toString())
    }

}

val beforeRotateRightDown = arrayListOf(
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Yellow, Yellow, EMPTY),
        arrayListOf(EMPTY, White, Red, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Blue, Blue, EMPTY),
        arrayListOf(Red, EMPTY, EMPTY, Purple),
        arrayListOf(Blue, EMPTY, EMPTY, Green),
        arrayListOf(EMPTY, Purple, White, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Purple, Green, EMPTY),
        arrayListOf(Green, EMPTY, EMPTY, Yellow),
        arrayListOf(Blue, EMPTY, EMPTY, Purple),
        arrayListOf(EMPTY, Red, Green, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Yellow, Red, EMPTY),
        arrayListOf(EMPTY, White, White, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    )
)

val afterRotateRightDown = arrayListOf(
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Yellow, Green, EMPTY),
        arrayListOf(EMPTY, White, Blue, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Blue, Red, EMPTY),
        arrayListOf(Red, EMPTY, EMPTY, Yellow),
        arrayListOf(Blue, EMPTY, EMPTY, Purple),
        arrayListOf(EMPTY, Purple, Yellow, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Purple, White, EMPTY),
        arrayListOf(Green, EMPTY, EMPTY, Purple),
        arrayListOf(Blue, EMPTY, EMPTY, Green),
        arrayListOf(EMPTY, Red, Red, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Yellow, Green, EMPTY),
        arrayListOf(EMPTY, White, White, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    )
)

val beforeRotateTopLeft = arrayListOf(
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Yellow, Yellow, EMPTY),
        arrayListOf(EMPTY, White, Red, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Blue, Blue, EMPTY),
        arrayListOf(Red, EMPTY, EMPTY, Purple),
        arrayListOf(Blue, EMPTY, EMPTY, Green),
        arrayListOf(EMPTY, Purple, White, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Purple, Green, EMPTY),
        arrayListOf(Green, EMPTY, EMPTY, Yellow),
        arrayListOf(Blue, EMPTY, EMPTY, Purple),
        arrayListOf(EMPTY, Red, Green, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Yellow, Red, EMPTY),
        arrayListOf(EMPTY, White, White, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    )
)

val afterRotateTopLeft = arrayListOf(
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Purple, Yellow, EMPTY),
        arrayListOf(EMPTY, White, Red, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Blue, Green, EMPTY),
        arrayListOf(Yellow, EMPTY, EMPTY, Red),
        arrayListOf(Blue, EMPTY, EMPTY, Green),
        arrayListOf(EMPTY, Purple, White, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Blue, Purple, EMPTY),
        arrayListOf(Yellow, EMPTY, EMPTY, Yellow),
        arrayListOf(Blue, EMPTY, EMPTY, Purple),
        arrayListOf(EMPTY, Red, Green, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Red, Green, EMPTY),
        arrayListOf(EMPTY, White, White, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    )
)

val rotateRightDown = arrayListOf(
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Red, Blue, EMPTY),
        arrayListOf(EMPTY, Red, Blue, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Blue, Purple, EMPTY),
        arrayListOf(White, EMPTY, EMPTY, Yellow),
        arrayListOf(White, EMPTY, EMPTY, Yellow),
        arrayListOf(EMPTY, Green, Red, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Blue, Purple, EMPTY),
        arrayListOf(White, EMPTY, EMPTY, Yellow),
        arrayListOf(White, EMPTY, EMPTY, Yellow),
        arrayListOf(EMPTY, Green, Red, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Purple, Green, EMPTY),
        arrayListOf(EMPTY, Purple, Green, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    )
)
val rotateRightDownCalc = Cube(solvedState).rotateRightDown()

val rotateTopLeft = arrayListOf(
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Yellow, Yellow, EMPTY),
        arrayListOf(EMPTY, Red, Red, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Blue, Blue, EMPTY),
        arrayListOf(Red, EMPTY, EMPTY, Purple),
        arrayListOf(White, EMPTY, EMPTY, Yellow),
        arrayListOf(EMPTY, Green, Green, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Blue, Blue, EMPTY),
        arrayListOf(Red, EMPTY, EMPTY, Purple),
        arrayListOf(White, EMPTY, EMPTY, Yellow),
        arrayListOf(EMPTY, Green, Green, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, White, White, EMPTY),
        arrayListOf(EMPTY, Purple, Purple, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    )
)
val rotateTopLeftCalc = Cube(solvedState).rotateTopLeft()

val rotateFrontCW1 = arrayListOf(
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Red, Red, EMPTY),
        arrayListOf(EMPTY, Red, Red, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, White, White, EMPTY),
        arrayListOf(Green, EMPTY, EMPTY, Blue),
        arrayListOf(Green, EMPTY, EMPTY, Blue),
        arrayListOf(EMPTY, Yellow, Yellow, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Blue, Blue, EMPTY),
        arrayListOf(White, EMPTY, EMPTY, Yellow),
        arrayListOf(White, EMPTY, EMPTY, Yellow),
        arrayListOf(EMPTY, Green, Green, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Purple, Purple, EMPTY),
        arrayListOf(EMPTY, Purple, Purple, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    )
)
val rotateFrontCwCalc1 = Cube(solvedState).rotateFrontCW()

val rotateFrontCW2 = arrayListOf(
        arrayListOf(
            arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
            arrayListOf(EMPTY, White, Yellow, EMPTY),
            arrayListOf(EMPTY, Red, Yellow, EMPTY),
            arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
        ),
        arrayListOf(
            arrayListOf(EMPTY, Blue, Red, EMPTY),
            arrayListOf(Purple, EMPTY, EMPTY, Blue),
            arrayListOf(White, EMPTY, EMPTY, Blue),
            arrayListOf(EMPTY, Green, Purple, EMPTY)
        ),
        arrayListOf(
            arrayListOf(EMPTY, Purple, Green, EMPTY),
            arrayListOf(Green, EMPTY, EMPTY, Yellow),
            arrayListOf(Blue, EMPTY, EMPTY, Purple),
            arrayListOf(EMPTY, Red, Green, EMPTY)
        ),
        arrayListOf(
            arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
            arrayListOf(EMPTY, Yellow, Red, EMPTY),
            arrayListOf(EMPTY, White, White, EMPTY),
            arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
        )
    )
val rotateFrontCwCalc2 = Cube(
    arrayListOf(
        arrayListOf(
            arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
            arrayListOf(EMPTY, Yellow, Yellow, EMPTY),
            arrayListOf(EMPTY, White, Red, EMPTY),
            arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
        ),
        arrayListOf(
            arrayListOf(EMPTY, Blue, Blue, EMPTY),
            arrayListOf(Red, EMPTY, EMPTY, Purple),
            arrayListOf(Blue, EMPTY, EMPTY, Green),
            arrayListOf(EMPTY, Purple, White, EMPTY)
        ),
        arrayListOf(
            arrayListOf(EMPTY, Purple, Green, EMPTY),
            arrayListOf(Green, EMPTY, EMPTY, Yellow),
            arrayListOf(Blue, EMPTY, EMPTY, Purple),
            arrayListOf(EMPTY, Red, Green, EMPTY)
        ),
        arrayListOf(
            arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
            arrayListOf(EMPTY, Yellow, Red, EMPTY),
            arrayListOf(EMPTY, White, White, EMPTY),
            arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
        )
    )
).rotateFrontCW()
