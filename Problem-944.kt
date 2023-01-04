fun minDeletionSize(strs: Array<String>): Int {
    val n = strs.size
    val m = strs[0].length
    var result = 0
    for (col in 0 until m) {
        for (row in 0 until n - 1) {
            if (strs[row][col] > strs[row + 1][col]) {
                result++
                break
            }
        }
    }
    return result
}