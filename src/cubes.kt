import RubixColor.*

val theOriginalState = arrayListOf(
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Blue, White, EMPTY),
        arrayListOf(EMPTY, Purple, Red, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Yellow, Green, EMPTY),
        arrayListOf(Purple, EMPTY, EMPTY, Purple),
        arrayListOf(White, EMPTY, EMPTY, Blue),
        arrayListOf(EMPTY, Blue, Yellow, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Blue, Green, EMPTY),
        arrayListOf(Red, EMPTY, EMPTY, Purple),
        arrayListOf(Green, EMPTY, EMPTY, Green),
        arrayListOf(EMPTY, White, Yellow, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, White, Yellow, EMPTY),
        arrayListOf(EMPTY, Red, Red, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    )
)

val solvedState = arrayListOf(
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Red, Red, EMPTY),
        arrayListOf(EMPTY, Red, Red, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Blue, Blue, EMPTY),
        arrayListOf(White, EMPTY, EMPTY, Yellow),
        arrayListOf(White, EMPTY, EMPTY, Yellow),
        arrayListOf(EMPTY, Green, Green, EMPTY)
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

val empty = arrayListOf(
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    )
)

val theOriginalCube = Cube(solvedState)
    .rotateRightDown()
    .rotateRightDown()
    .rotateTopRight()
    .rotateRightDown()
    .rotateRightDown()
    .rotateTopRight()
    .rotateRightDown()
    .rotateRightDown() // Newest algo could get to here
//    .rotateTopLeft()
//        .rotateTopLeft()
//        .rotateFrontCCW()


val randomCube2 = arrayListOf(
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, White, Yellow, EMPTY),
        arrayListOf(EMPTY, White, White, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Green, Green, EMPTY),
        arrayListOf(Red, EMPTY, EMPTY, Red),
        arrayListOf(Blue, EMPTY, EMPTY, Green),
        arrayListOf(EMPTY, Purple, Purple, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Red, White, EMPTY),
        arrayListOf(Blue, EMPTY, EMPTY, Red),
        arrayListOf(Green, EMPTY, EMPTY, Yellow),
        arrayListOf(EMPTY, Yellow, Purple, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Yellow, Blue, EMPTY),
        arrayListOf(EMPTY, Purple, Blue, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    )
)

val randomCube3 = arrayListOf(
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Purple, White, EMPTY),
        arrayListOf(EMPTY, Red, Blue, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Yellow, Green, EMPTY),
        arrayListOf(Green, EMPTY, EMPTY, Purple),
        arrayListOf(Green, EMPTY, EMPTY, Yellow),
        arrayListOf(EMPTY, Yellow, Red, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, White, White, EMPTY),
        arrayListOf(Red, EMPTY, EMPTY, Blue),
        arrayListOf(Blue, EMPTY, EMPTY, Yellow),
        arrayListOf(EMPTY, Red, Purple, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Green, Purple, EMPTY),
        arrayListOf(EMPTY, White, Blue, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    )
)

val rand4 = arrayListOf(
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Purple, White, EMPTY),
        arrayListOf(EMPTY, Green, Red, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Blue, Purple, EMPTY),
        arrayListOf(Yellow, EMPTY, EMPTY, Blue),
        arrayListOf(White, EMPTY, EMPTY, Yellow),
        arrayListOf(EMPTY, Purple, Green, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Red, Yellow, EMPTY),
        arrayListOf(Blue, EMPTY, EMPTY, Green),
        arrayListOf(White, EMPTY, EMPTY, White),
        arrayListOf(EMPTY, Red, Red, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Yellow, Purple, EMPTY),
        arrayListOf(EMPTY, Green, Blue, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    )
)

val rand5 = arrayListOf(
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, White, Purple, EMPTY),
        arrayListOf(EMPTY, Purple, Purple, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Green, Yellow, EMPTY),
        arrayListOf(Red, EMPTY, EMPTY, Blue),
        arrayListOf(Yellow, EMPTY, EMPTY, White),
        arrayListOf(EMPTY, Green, Green, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Blue, White, EMPTY),
        arrayListOf(Red, EMPTY, EMPTY, Blue),
        arrayListOf(Blue, EMPTY, EMPTY, Green),
        arrayListOf(EMPTY, Yellow, Yellow, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, White, Purple, EMPTY),
        arrayListOf(EMPTY, Red, Red, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    )
)

val theRealDeal = arrayListOf(
    arrayListOf(
    arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
    arrayListOf(EMPTY, Yellow, White, EMPTY),
    arrayListOf(EMPTY, White, Red, EMPTY),
    arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
    arrayListOf(EMPTY, Green, Purple, EMPTY),
    arrayListOf(Purple, EMPTY, EMPTY, Blue),
    arrayListOf(Purple, EMPTY, EMPTY, White),
    arrayListOf(EMPTY, Green, Blue, EMPTY)
    ),
    arrayListOf(
    arrayListOf(EMPTY, Purple, Red, EMPTY),
    arrayListOf(Yellow, EMPTY, EMPTY, White),
    arrayListOf(Red, EMPTY, EMPTY, Yellow),
    arrayListOf(EMPTY, Blue, Red, EMPTY)
    ),
    arrayListOf(
    arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
    arrayListOf(EMPTY, Blue, Green, EMPTY),
    arrayListOf(EMPTY, Yellow, Green, EMPTY),
    arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    )
)
val realDealAlso = Cube(solvedState)
    .rotateFrontCW()
    .rotateRightDown()
    .rotateRightDown()
    .rotateFrontCCW()
    .rotateFrontCCW()
    .rotateTopLeft()
    .rotateTopLeft()
    .rotateFrontCCW()
    .rotateTopRight()
    .rotateRightDown()
    .rotateRightDown()
    .rotateTopRight()


val simpletest = arrayListOf(
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
val simpletest2 = Cube(solvedState).rotateRightDown()

val keepingCubeOrientationTheSame = arrayListOf(
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Green, Blue, EMPTY),
        arrayListOf(EMPTY, Blue, Green, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Yellow, White, EMPTY),
        arrayListOf(Red, EMPTY, EMPTY, Purple),
        arrayListOf(White, EMPTY, EMPTY, White),
        arrayListOf(EMPTY, Red, Red, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Yellow, Red, EMPTY),
        arrayListOf(Purple, EMPTY, EMPTY, Yellow),
        arrayListOf(White, EMPTY, EMPTY, Purple),
        arrayListOf(EMPTY, Green, Blue, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Green, Blue, EMPTY),
        arrayListOf(EMPTY, Purple, Yellow, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    )
)


val anchorCorner = arrayListOf(
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Red, Red, EMPTY),
        arrayListOf(EMPTY, Yellow, Blue, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Yellow, White, EMPTY),
        arrayListOf(Blue, EMPTY, EMPTY, Blue),
        arrayListOf(Purple, EMPTY, EMPTY, White),
        arrayListOf(EMPTY, Blue, Purple, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Red, Yellow, EMPTY),
        arrayListOf(Green, EMPTY, EMPTY, Red),
        arrayListOf(White, EMPTY, EMPTY, Yellow),
        arrayListOf(EMPTY, Green, Green, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, White, Green, EMPTY),
        arrayListOf(EMPTY, Purple, Purple, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    )
)

val momsCube = arrayListOf(
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Yellow, White, EMPTY),
        arrayListOf(EMPTY, White, Red, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Red, Purple, EMPTY),
        arrayListOf(Green, EMPTY, EMPTY, Blue),
        arrayListOf(Red, EMPTY, EMPTY, Blue),
        arrayListOf(EMPTY, Blue, Yellow, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Purple, Purple, EMPTY),
        arrayListOf(Green, EMPTY, EMPTY, Blue),
        arrayListOf(White, EMPTY, EMPTY, Green),
        arrayListOf(EMPTY, Green, Red, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Yellow, Yellow, EMPTY),
        arrayListOf(EMPTY, Purple, White, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    )
)


val dadsCube = arrayListOf(
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, Red, Yellow, EMPTY),
        arrayListOf(EMPTY, Yellow, Purple, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, White, Green, EMPTY),
        arrayListOf(Green, EMPTY, EMPTY, Red),
        arrayListOf(Purple, EMPTY, EMPTY, Blue),
        arrayListOf(EMPTY, Blue, White, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, Blue, Yellow, EMPTY),
        arrayListOf(Red, EMPTY, EMPTY, Blue),
        arrayListOf(White, EMPTY, EMPTY, Yellow),
        arrayListOf(EMPTY, Green, Green, EMPTY)
    ),
    arrayListOf(
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
        arrayListOf(EMPTY, White, Red, EMPTY),
        arrayListOf(EMPTY, Purple, Purple, EMPTY),
        arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
    )
)