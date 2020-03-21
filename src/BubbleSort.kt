class BubbleSort {

    fun sort() {
        var holder : Int

        var randomNumberArray : IntArray = intArrayOf(3,6,7,3,4,5,1)
        println("Random array: ")
        for (i in randomNumberArray) {
            println(i)
        }

        for (i in randomNumberArray) {
            for(j in 1..randomNumberArray.lastIndex) {
                if (randomNumberArray[j - 1] > randomNumberArray[j]) {
                    holder = j - 1
                    randomNumberArray[j - 1] = randomNumberArray[j]
                    randomNumberArray[j] = holder
                }
            }
        }

        println("Sorted array: ")
        for(i in randomNumberArray) {
            println(i)
        }
    }
}

/*
* Bubble sort algorithm as I remember it 21/03/2020
* -------------------------
* Ascending order:
* In a list of numbers, check two numbers, x and y in respective order
* if X is greater than Y, swap the two numbers
* Move up to the next integer in the list until the end.
* Repeat until each number is in ascending order
* */