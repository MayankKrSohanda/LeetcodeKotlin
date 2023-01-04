private class Solution {
    fun maximumBags(capacity: IntArray, rocks: IntArray, additionalRocks: Int): Int {
        val remainingCapacity = mutableListOf<Int>()
        var result = 0
        var extraRocks = additionalRocks
        capacity.indices.forEach { i ->
            val diff = capacity[i] - rocks[i]
            if (diff == 0) {
                result++
            } else {
                remainingCapacity.add(diff)
            }
        }
        remainingCapacity.sort()
        for (item in remainingCapacity) {
            if (extraRocks >= item) {
                extraRocks -= item
                result++
            } else {
                break
            }
        }
        return result
    }
}

fun main() {
    val solution = Solution()
    val capacity = intArrayOf(2, 3, 4, 5)
    val rocks = intArrayOf(1, 2, 4, 4)
    val additionalRocks = 2
    val result = solution.maximumBags(capacity, rocks, additionalRocks)
    println(result)
}

