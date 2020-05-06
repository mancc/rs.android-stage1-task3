package subtask5

class TelephoneFinder {

    // Subtask 5 function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val numbers = mapOf(
            "0" to listOf("8"),
            "1" to listOf("2", "4"),
            "2" to listOf("1", "3", "5"),
            "3" to listOf("2", "6"),
            "4" to listOf("1", "5", "7"),
            "5" to listOf("2", "4", "6", "8"),
            "6" to listOf("3", "5", "9"),
            "7" to listOf("4", "8"),
            "8" to listOf("5", "7", "9", "0"),
            "9" to listOf("6", "8")
        )
        val value = number.toInt()
        if (value < 0) {
            return null
        }
        val result: MutableList<String> = mutableListOf()
        for (i in number.indices) {
            val getnumbers = numbers.getValue(number[i].toString())
            for (j in getnumbers.indices) {
                val newNeighbour: String = number.replaceRange(i, i + 1, getnumbers[j])
                val add = result.add(newNeighbour)
            }
        }
        return result.toTypedArray()
    }
}
