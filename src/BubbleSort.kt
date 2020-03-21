class BubbleSort {

    fun sort() {
        var k : Int

        var randomNumberArray : IntArray = intArrayOf(3,6,7,3,4,5,1)
        println("Random array: ")
        for (i in randomNumberArray) {
            println(i)
        }

        for (i in randomNumberArray) {
            for(j in 1..randomNumberArray.lastIndex) {
                if (randomNumberArray[j - 1] > randomNumberArray[j]) {
                    k = j - 1
                    randomNumberArray[j - 1] = randomNumberArray[j]
                    randomNumberArray[j] = k
                }
            }
        }

        println("Sorted array: ")
        for(i in randomNumberArray) {
            println(i)
        }
    }
}