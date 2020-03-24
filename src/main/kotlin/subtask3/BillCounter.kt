package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
            var sum: Int = 0
            for (i in 0..bill.size-1){
                if(i == k) continue
                sum += bill[i]
            }
            if (b == sum/2) return ("bon appetit")
            else return ((b - sum/2).toString())
        throw NotImplementedError("Not implemented")
    }
}
