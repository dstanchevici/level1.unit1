import level1.unit1.examples.fillWithRandoms
import level1.unit1.examples.printShortArray
import level1.unit1.examples.showVerdictForSorted

//package level1.level1.unit1.tasks

//import prgi1.solutions.level1.level1.unit1.task1.testTask2

/*
    Write a function implementing the binary search algorithm.
    The functions should return array's index of the given number or null.
*/


fun binarySearch(a: IntArray, target: Int): Int? {
    var leftIndex = 0
    var rightIndex = a.lastIndex

    while (leftIndex <= rightIndex) {
        val middleIndex = (leftIndex + rightIndex) / 2

        if (target == a[middleIndex])
            return middleIndex

        if (target < a[middleIndex]) {
            rightIndex = middleIndex - 1
        } else {
            leftIndex = middleIndex + 1
        }
    }

    return null
}


fun main() {
    val a = intArrayOf(-923, -872, -705, -70, -621, -327, -309, -276, -184, -179, -163, -127, 6, 47, 84, 203, 241, 486, 547, 819 )
    //fillWithRandoms(a)
    //a.sort() // For IntArrays in Kotlin collections. Is this a native language function?
    printShortArray(a)

    val target = -47

    val targetIndex = binarySearch(a, target)

    if (targetIndex != null){
        println("$target is located at Index $targetIndex.")
    } else {
        println("This array does not contain $target.")
    }


// testTask2(::binarySearch)
}
