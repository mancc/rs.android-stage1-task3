package subtask2

class Combinator {

    // Subtask 2 function
    internal fun factorial(a : Int) : Int {
        if((a == 0) or (a == 1)) {
            return 1
        }
        var factorial: Int = 1
        for(b in 1..a){
            factorial*=b
        }
        return factorial
    }
    internal fun checkChooseFromArray(array: Array<Int>): Int? {
        val cnk: Int = array[0]
        val a = array[1]
        for (b in 0..(a / 2)) {
            if (cnk * factorial(b) * factorial(a - b) == factorial(a)) {
                return b
            }
        }
        return null
    }
}
