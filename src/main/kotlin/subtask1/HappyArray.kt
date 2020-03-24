package subtask1

class HappyArray {
    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var sadArray = sadArray
        var happyArray:IntArray = intArrayOf()
        var badNumberInArray: Boolean = false
        var lastElement: Int
        if (!(sadArray.isEmpty())){
            happyArray += sadArray[0]
            lastElement = sadArray[(sadArray.size)-1]

            if (sadArray.size > 1){
                for (index in 1..(sadArray.size) - 2){
                    if (sadArray[index] < (sadArray[index - 1] + sadArray[index + 1])){
                        happyArray += sadArray[index]
                    }else badNumberInArray = true
                }

                while(badNumberInArray){
                    happyArray += sadArray[sadArray.size - 1]
                    badNumberInArray = false
                    sadArray = happyArray
                    happyArray = intArrayOf()
                    happyArray += sadArray[0]
                    for (index in 1..(sadArray.size) - 2){
                        if (sadArray[index] < (sadArray[index - 1] + sadArray[index + 1])) happyArray += sadArray[index]
                        else badNumberInArray = true
                    }
                }
                happyArray += lastElement
            }

        }
        return happyArray
        throw NotImplementedError("Not implemented")

    }

}