package subtask6

class FullBinaryTrees {
    // Subtask 6 function
    fun stringForNodeCount(count: Int): String {
        if (count % 2 == 0) {
            return "[]"
        }
        if (count == 1) {
            return "[[0]]"
        }
        if(count == 3) {
            return "[[0,0,0]]"
        }
        this.generateTreeRecourse("000",1, count - 3)
        return answerList.joinToString(postfix = "]]", prefix = "[[", separator = "],[") {
            it.split(
                ""
            ).joinToString(",").trim(',').replace("N", "null")
        }
    }
    private val answerList = mutableListOf<String>()
    private fun generateTreeRecourse(tree : String, currentCheckNodeIndex : Int, nodesLeft : Int){
        if(nodesLeft == 0){
            answerList.add(tree)
        }
        else{
            if(tree[currentCheckNodeIndex] == '0'){
                generateTreeRecourse(tree+"00", currentCheckNodeIndex+1, nodesLeft - 2)
                generateTreeRecourse(tree+"NN", currentCheckNodeIndex+1, nodesLeft)
            }
            else {
                val next: Int = tree.indexOf('0', currentCheckNodeIndex+1)
                if(next!= -1)
                    generateTreeRecourse(tree, next, nodesLeft)
            }
        }
    }
}