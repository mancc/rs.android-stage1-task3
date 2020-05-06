package subtask3

class ArrayCalculator {

    // Subtask 3 function
    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        val items: MutableList<Int> = mutableListOf<Int>()
        for(item in itemsFromArray)
            if(item is Int)
                items.add(item)
        if(items.isEmpty())
            return 0
        if(numberOfItems >= items.size){
            var product = 1
            for(item in items)
                product*=item
            return product
        }
        items.sortDescending()
        var product = 1
        if(numberOfItems % 2 == 1){
            product*=items.first()
            items.removeAt(0)
        }
        val Productpair = mutableListOf<Int>()
        for(itemIndex in items.indices){
            if(itemIndex+1 != items.size)
                Productpair.add(items[itemIndex] * items[itemIndex+1])
        }
        Productpair.sortDescending()
        for(i in 1.rangeTo(numberOfItems/2)) {
            product*=Productpair[i-1]
        }
        return product
    }
}
