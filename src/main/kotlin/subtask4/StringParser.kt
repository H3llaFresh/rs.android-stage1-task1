package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {

        val str : String = inputString
        var substringArray = arrayOf<String>()
        var closeBracket: Char = 's'
        var openBracket: Char = 'o'
        var level: Int = 0
        for (i in 0..str.length - 1){
            if (str[i] == '<' || str[i] == '(' || str[i] == '['){
                if (str[i] == '<'){
                    openBracket = '<'
                    closeBracket = '>'
                }
                if (str[i] == '(') {
                    openBracket = '('
                    closeBracket = ')'
                }
                if (str[i] == '[') {
                    openBracket = '['
                    closeBracket = ']'
                }
                for (p in i + 1..str.length - 1){
                    if (str[p] == openBracket) level++
                    if (str[p] == closeBracket){
                        if (level == 0){
                            substringArray += str.substring(i + 1, p)
                            break;
                        } else level --
                    }
                }
            }
        }
        return substringArray
        throw NotImplementedError("Not implemented")
    }
}
