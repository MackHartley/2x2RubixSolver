import RubixColor.*
import java.util.*
import Step.*
import kotlin.collections.HashMap

/**
 * The corner with white, green and purple must be in the back-bottom-left corner. Purple should be facing the back,
 * white facing the left and green facing down.
 */
fun main(args : Array<String>) {

    val x = Cube(simpletest)
    val y = simpletest2
    val x1 = x.toString()
    val y1 = y.toString()


    val maxItr = 500000
    var curItr = 0

    val queueStart: Queue<List<Step>> = LinkedList<List<Step>>().apply { add(emptyList()) }
    val queueTarget: Queue<List<Step>> = LinkedList<List<Step>>().apply { add(emptyList()) }

    val visitedStart: HashMap<String, Steps> = HashMap()
    val visitedTarget: HashMap<String, Steps> = HashMap()


    val manualCube = Cube(arrayListOf(
        arrayListOf(
            arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
            arrayListOf(EMPTY, Red, Red, EMPTY),
            arrayListOf(EMPTY, Green, White, EMPTY),
            arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
        ),
        arrayListOf(
            arrayListOf(EMPTY, Yellow, Yellow, EMPTY),
            arrayListOf(Blue, EMPTY, EMPTY, Green),
            arrayListOf(Red, EMPTY, EMPTY, Purple),
            arrayListOf(EMPTY, White, Blue, EMPTY)
        ),
        arrayListOf(
            arrayListOf(EMPTY, Purple, Blue, EMPTY),
            arrayListOf(Green, EMPTY, EMPTY, White),
            arrayListOf(White, EMPTY, EMPTY, Purple),
            arrayListOf(EMPTY, Green, Blue, EMPTY)
        ),
        arrayListOf(
            arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY),
            arrayListOf(EMPTY, Yellow, Red, EMPTY),
            arrayListOf(EMPTY, Purple, Yellow, EMPTY),
            arrayListOf(EMPTY, EMPTY, EMPTY, EMPTY)
        )
    ))

    val programCube = Cube(solvedState)
        .rotateFrontCCW()
        .rotateFrontCCW()
        .rotateTopLeft()
        .rotateRightDown()
        .rotateTopRight()
        .rotateRightDown()
        .rotateFrontCW()


    val startCube = Cube(anchorCorner)
//    val startCube = Cube(solvedState)
//        .rotateFrontCW()
//        .rotateRightDown()
//        .rotateRightDown()
//        .rotateFrontCCW()
//        .rotateFrontCCW()
//        .rotateTopLeft()
//        .rotateTopLeft()
//        .rotateFrontCCW()
//        .rotateTopRight()
//        .rotateRightDown()
//        .rotateRightDown()
//        .rotateTopRight()
    val targetCube = Cube(solvedState)


    // solved
    // rotate right down
    // rotate top left


    // target
    // rotate face ccw

    println("""
        =========================================================================== 
        Starting...
    """.trimIndent())


    while (curItr < maxItr) {
        curItr++
//        println(""""
//|Running...
//|     queueStart  size: ${queueStart.size}
//|     queueTarget size: ${queueTarget.size}
//|     """.trimMargin())
        println("Ittr: $curItr / $maxItr")
        if (curItr == maxItr) {
            println("Reached max allowed steps")
        }

        val curStartSteps = queueStart.remove()
        val cubeStateS = startCube.calculateCubeState(curStartSteps)
        if (!visitedStart.containsKey(cubeStateS.toString())) {
            val thingy = visitedTarget[cubeStateS.toString()]
            if (thingy != null) {
                println("Solved1! ${curStartSteps} ++++ ${thingy.reverseSteps()}")
                break
            }
            visitedStart.put(cubeStateS.toString(), curStartSteps)
            queueStart.add(curStartSteps.plus(RotateFrontCW))
            queueStart.add(curStartSteps.plus(RotateFrontCCW))
            queueStart.add(curStartSteps.plus(RotateTopLeft))
            queueStart.add(curStartSteps.plus(RotateTopRight))
            queueStart.add(curStartSteps.plus(RotateRightUp))
            queueStart.add(curStartSteps.plus(RotateRightDown))
        }

        val curTargetSteps = queueTarget.remove()
        val cubeStateT = targetCube.calculateCubeState(curTargetSteps)
        if (!visitedTarget.containsKey(cubeStateT.toString())) {
            val thingy2 = visitedStart[cubeStateT.toString()]
            if (thingy2 != null) {
                println("Solved2! ${thingy2} ++++ ${curTargetSteps.reverseSteps()}")
                break
            }
            visitedTarget.put(cubeStateT.toString(), curTargetSteps)
            queueTarget.add(curTargetSteps.plus(RotateFrontCW))
            queueTarget.add(curTargetSteps.plus(RotateFrontCCW))
            queueTarget.add(curTargetSteps.plus(RotateTopLeft))
            queueTarget.add(curTargetSteps.plus(RotateTopRight))
            queueTarget.add(curTargetSteps.plus(RotateRightUp))
            queueTarget.add(curTargetSteps.plus(RotateRightDown))
        }
    }
}

fun Steps.reverseSteps(): Steps {
    return reversed().map {
        return@map when (it) {
            RotateFrontCW -> RotateFrontCCW
            RotateFrontCCW -> RotateFrontCW
            RotateTopLeft -> RotateTopRight
            RotateTopRight -> RotateTopLeft
            RotateRightUp -> RotateRightDown
            RotateRightDown -> RotateRightUp
        }
    }
}

typealias Steps = List<Step>
fun Steps.toShortString(): String {
    val sb = StringBuilder()
    for (step in this) {
        sb.append(step.ordinal)
    }
    return sb.toString()
}
fun String.toStepsList(): Steps {
    val result = mutableListOf<Step>()
    for (c in this) {
        val ordChar = Character.getNumericValue(c)
        result.add(Step.values()[ordChar])
    }
    return result
}

fun algo2() {

//    val testSet = mutableSetOf(Cube(solvedState))
//    println("result: ${testSet.contains(Cube(solvedState))}")

    val maxItr = 10000000
    val queue: Queue<List<Step>> = LinkedList<List<Step>>()
    val visited = mutableSetOf<String>()
    var curItr = 0

    val myCube = Cube(rand5)


    println("""
        ===========================================================================
        ===========================================================================
        ===========================================================================
        
        Starting...
    """.trimIndent())
    queue.add(
        emptyList()
    )

    while (curItr < maxItr) {
        curItr++
//        println("Running. Queue size: ${queue.size}")
        if (curItr == maxItr) {
            println("Reached max steps")
        }
        val curSteps = queue.remove()


        if (myCube.calculateCubeState(curSteps).isSolved()) {
            println("It is solved! Steps are: $curSteps")
            break
        }
        if (visited.contains(curSteps.toShortString())) {
//            println("Duplicate")
            continue
        }
        else visited.add(curSteps.toShortString())
//        println(curState.state.toString())
        queue.add(curSteps.plus(RotateFrontCW))
        queue.add(curSteps.plus(RotateFrontCCW))
        queue.add(curSteps.plus(RotateTopLeft))
        queue.add(curSteps.plus(RotateTopRight))
        queue.add(curSteps.plus(RotateRightUp))
        queue.add(curSteps.plus(RotateRightDown))
    }
}

fun algo1() {

//    val testSet = mutableSetOf(Cube(solvedState))
//    println("result: ${testSet.contains(Cube(solvedState))}")

    val maxItr = 5000000
    val queue: Queue<Cube> = LinkedList<Cube>()
    val visited = mutableSetOf<String>()
    var curItr = 0

    println("""
        ===========================================================================
        ===========================================================================
        ===========================================================================
        
        Starting...
    """.trimIndent())
    queue.add(
        Cube(solvedState)
            .rotateRightDown()
            .rotateRightDown()
            .rotateTopRight()
            .rotateRightDown()
            .rotateRightDown()
            .rotateTopRight()
            .rotateRightDown()
            .rotateRightDown()
            .rotateTopLeft() // This algo could only calculate up to here before hitting memory limits
//            .rotateTopLeft()
//            .rotateFrontCCW()
    )

    while (curItr < maxItr) {
        curItr++
        println("Running. Queue size: ${queue.size}")
        if (curItr == maxItr) {
            println("Reached max steps")
        }
        val curState = queue.remove()

        if (curState.isSolved()) {
            println("It is solved!")
            break
        }
        if (visited.contains(curState.toString())) {
//            println("Duplicate")
            continue
        }
        else visited.add(curState.toString())
//        println(curState.state.toString())
        queue.add(curState.rotateFrontCW())
        queue.add(curState.rotateFrontCCW())
        queue.add(curState.rotateTopLeft())
        queue.add(curState.rotateTopRight())
        queue.add(curState.rotateRightUp())
        queue.add(curState.rotateRightDown())
    }
}

enum class Step {
    RotateFrontCW,
    RotateFrontCCW,
    RotateTopLeft,
    RotateTopRight,
    RotateRightUp,
    RotateRightDown
}

enum class RubixColor {
    Red,
    Blue,
    Yellow,
    White,
    Green,
    Purple,
    EMPTY
}




