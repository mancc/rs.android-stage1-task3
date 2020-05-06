package subtask1

class PolynomialConverter {

    // Subtask 1 function
    fun convertToStringFrom(numbers: Array<Int>): String? {
        if (numbers.isEmpty()) return null
        var output = ""
        for((index,coefficient) in numbers.withIndex()){
            if(coefficient != 0) output += coefficient.toString() + "x^" + (numbers.size - index - 1) + " + "
        }
        output = output.replace("x^1", "x")
        output = output.replace("x^0", "")
        output = output.replace("1x", "x")
        output = output.replace("+ -", "- ")
        return output.substring(
            0,
            (output.length-3)
        )
    }
}
