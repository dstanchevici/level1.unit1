
// Project i1. Level 1. Unit 1. Task 1. Linear search

private fun linearSearch(a: IntArray, target: Int): Int? {
    var targetIndex: Int? = 0

    if (targetIndex != null){
        for (number in a){
            if (number == target)
                return targetIndex
            targetIndex++
        }
    }
    return null
}

fun main(){
    val a = intArrayOf(1, 0, 12, 45, 31)
    val target = 0
    val targetIndex = linearSearch(a, target)

    if (targetIndex != null){
        println("$target is at Index $targetIndex")
    } else {
        println("This array does not contain $target.")
    }

}