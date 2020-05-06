package subtask4

class SquareDecomposer {

    // Subtask 4 function
    private fun decomposer(number: Long, remain: Long): ArrayList<Long>? {
        if (remain != 0L) {
            for (i in number - 1 downTo 0) {
                if ((remain - i * i) >= 0) {
                    val numbers = decomposer(i, (remain - i * i))
                    if (numbers != null) {
                        numbers.add(number)
                        return numbers
                    }
                }
            }
            return null
        }
        val numbers = ArrayList<Long>()
        val add = numbers.add(number)
        return numbers
    }
    fun decomposeNumber(number: Int): Array<Int>? {
        if (number < 0) {
            return null
        } else {
            val numToLong: Long = number.toLong()
            val decompose = decomposer(numToLong, numToLong * numToLong)
            val find = mutableListOf<Int>()
            if (decompose != null) {
                decompose.removeAt(decompose.size - 1)
                for (i in decompose) {
                    val value = i.toInt()
                    find.add(value)
                }
                return find.toTypedArray()
            }
            return null
        }
    }
}