package level1.unit1.examples

import kotlin.random.Random


fun printShortArray(a: IntArray) {
    for(e in a)
        print("$e ")

    println()
}

fun fillWithRandoms(a: IntArray, from: Int = -1000, to: Int = 1000) {
    for (i in 0 until a.size)
        a[i] = Random.nextInt(from, to)
}

fun checkIfSorted(a: IntArray): Boolean {
    if(a.size == 0)
        return true

    for (i in 1 until a.size) {
        if (a[i] < a[i-1])
            return false
    }

    return true
}

fun showVerdictForSorted(a: IntArray) {
    if(checkIfSorted(a))
        println("passed")
    else
        println("FAILED!!!")
}
