import java.util.Collections
import java.util.PriorityQueue

fun minStoneSum(piles: IntArray, k: Int): Int {
    val heap = PriorityQueue<Int>(Collections.reverseOrder())
    var totalSum = 0
    for (pile in piles) {
        totalSum += pile
        heap.add(pile)
    }
    for (i in 1..k) {
        val curr = heap.remove()
        val remove = curr / 2
        totalSum -= remove
        heap.add(curr - remove)
    }
    return totalSum
}