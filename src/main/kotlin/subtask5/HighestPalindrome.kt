package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var str: String = digitString
        var k: Int = k
        var n: Int = n
        var changedElementsIndeces: IntArray = intArrayOf()
        var stringToChar = str.toCharArray()

        for (i in 0..n / 2 - 1){
            if (stringToChar[i] - stringToChar[n - 1 - i] > 0){
                if (k > 0){
                    stringToChar[n - 1 - i] = stringToChar[i]
                    changedElementsIndeces += n - 1 - i
                    k--
                }else{
                    return "-1"
                }
            }

            if (stringToChar[i] - stringToChar[n - 1 - i] < 0){
                if (k > 0){
                    stringToChar[i] = stringToChar[n - 1 - i]
                    changedElementsIndeces += i
                    k--
                }else{
                    return "-1"
                }
            }
        }

        while(k > 0)
            for (i in 0..n / 2 - 1)
                if (stringToChar[i] < '9'){
                    if (changedElementsIndeces.contains(i) || changedElementsIndeces.contains(n - 1 - i)){
                        stringToChar[i] = '9'
                        stringToChar[n - i - 1] = '9'
                        k--
                    }
                    if (k > 1){
                        stringToChar[i] = '9'
                        stringToChar[n - 1 - i] = '9'
                        k -=2
                    }
                }
        return stringToChar.joinToString("")
        throw NotImplementedError("Not implemented")
    }
}
