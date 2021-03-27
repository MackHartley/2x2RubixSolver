import Step.*

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