// Task 7.7.1: statistics functions

fun findMedian(list: List<Float>) :  Float {
    val count = list.size
    val rem = count % 2
    val sorted = list.sorted()
    
    if (rem == 0) {
        val mid1 = sorted[count / 2-1]
        val mid2 = sorted[count/ 2]
        return (mid1+mid2)/2f
    } else {
        return sorted[count / 2]
    }
}