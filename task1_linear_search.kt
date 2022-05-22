
// Project i1. Level 1. Unit 1. Task 1. Linear search.

private fun linearSearch(a: IntArray, target: Int): Int? {
    for ((targetIndex, number) in a.withIndex()){
        if (number == target)
            return targetIndex
    }

    return null
}

fun main(){
    val a = intArrayOf(1, 0, 12, 45, 31)
    val target = 1
    val targetIndex = linearSearch(a, target)

    if (targetIndex != null){
        println("$target is at Index $targetIndex")
    } else {
        println("This array does not contain $target.")
    }
}