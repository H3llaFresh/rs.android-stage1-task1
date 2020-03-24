package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        var IntArray: IntArray = input
        var maxValue: Int = 0
        var minValue: Int = 0
        var sum: Int = 0
        IntArray.sort()
        for (i in 0..IntArray.size - 2) sum += IntArray[i]
        minValue = sum
        sum = 0
        IntArray.reverse()
        for (i in 0..IntArray.size - 2) sum += IntArray[i]
        maxValue = sum
        return intArrayOf(minValue, maxValue)
        throw NotImplementedError("Not implemented")
    }
}
