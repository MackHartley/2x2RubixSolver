import java.util.*
import Step.*
import kotlin.collections.HashMap

fun main(args : Array<String>) {
    bidirectionalBfsSolver()
}

/**
 * This algorithm uses Bidirecitional BFS which allows it to solve the rubiks cube super fast
 *
 * The corner with white, green and purple must be in the back-bottom-left corner. Purple should be facing the back,
 * white facing the left and green facing down.
 */
fun bidirectionalBfsSolver() {
    val startTime = System.currentTimeMillis()

    println("Starting...".trimIndent())
    val maxItr = 500000 // Anything past this won't be solved probably
    var curItr = 0
    
    val searchQueue: Queue<List<Step>> = LinkedList<List<Step>>().apply { add(emptyList()) }
    val solutionQueue: Queue<List<Step>> = LinkedList<List<Step>>().apply { add(emptyList()) }
    val searchVisited: HashMap<String, Steps> = HashMap()
    val solutionVisited: HashMap<String, Steps> = HashMap()

    val startCube = Cube(dillsCube) // Starting cube state
    val targetCube = Cube(solvedState) // Desired cube state

    while (curItr++ < maxItr) {
        println("Iteration: $curItr / $maxItr")

        // The search node
        val currentSearchSteps = searchQueue.remove()
        val currentSearchCubeState = startCube.calculateCubeState(currentSearchSteps)
        if (!searchVisited.containsKey(currentSearchCubeState.toString())) {
            val previouslyVisitedSolutionState = solutionVisited[currentSearchCubeState.toString()]
            if (previouslyVisitedSolutionState != null) { // If the solution queue has seen this node then we've solved the cube
                println("Solved! (From search queue): $currentSearchSteps + ${previouslyVisitedSolutionState.reverseSteps()}")
                break
            }
            searchVisited[currentSearchCubeState.toString()] = currentSearchSteps
            searchQueue.add(currentSearchSteps.plus(RotateFrontCW))
            searchQueue.add(currentSearchSteps.plus(RotateFrontCCW))
            searchQueue.add(currentSearchSteps.plus(RotateTopLeft))
            searchQueue.add(currentSearchSteps.plus(RotateTopRight))
            searchQueue.add(currentSearchSteps.plus(RotateRightUp))
            searchQueue.add(currentSearchSteps.plus(RotateRightDown))
        }

        // The solution node
        val curTargetSteps = solutionQueue.remove()
        val cubeStateT = targetCube.calculateCubeState(curTargetSteps)
        if (!solutionVisited.containsKey(cubeStateT.toString())) {
            val previouslyVisitedSearchState = searchVisited[cubeStateT.toString()]
            if (previouslyVisitedSearchState != null) { // If the search algorithm has seen this node before then we've solved the cube
                println("Solved! (From solution queue): $previouslyVisitedSearchState + ${curTargetSteps.reverseSteps()}")
                break
            }
            solutionVisited[cubeStateT.toString()] = curTargetSteps
            solutionQueue.add(curTargetSteps.plus(RotateFrontCW))
            solutionQueue.add(curTargetSteps.plus(RotateFrontCCW))
            solutionQueue.add(curTargetSteps.plus(RotateTopLeft))
            solutionQueue.add(curTargetSteps.plus(RotateTopRight))
            solutionQueue.add(curTargetSteps.plus(RotateRightUp))
            solutionQueue.add(curTargetSteps.plus(RotateRightDown))
        }
    }
    if (curItr >= maxItr) println("Reached max allowed steps")
    val endTime = System.currentTimeMillis()
    println("Search took ${endTime - startTime} milliseconds")
}

/**
 * Also too slow, uses BFS but stores less data on the search queue. That allows this algorithm to run for a bit longer,
 * but it still isn't sufficient to solve the cube
 */
fun secondAlgorithmAttempt() {

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

/**
 * Too slow, uses BFS and stored entire cube states in memory. Hit memory constraints on my macbook
 */
fun firstAlgorithmAttempt() {

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
