import kotlin.random.Random

class BubbleSort {

    fun sort() {
        var holder : Int
        val arraySize : Int = 10
        val randomNumberArray = IntArray(arraySize) { Random.nextInt(0, 100)}
        println("Random array: ")
        for (i in randomNumberArray) {
            print("$i ")
        }

        for (i in 0 until randomNumberArray.size - 1) {
            for(j in 0 until randomNumberArray.size - 1 - i) {
                if (randomNumberArray[j] > randomNumberArray[j + 1]) {
                    holder = randomNumberArray[j]
                    randomNumberArray[j] = randomNumberArray[j+1]
                    randomNumberArray[j + 1] = holder

                }
            }
        }

        println("\nSorted array: ")
        for(i in randomNumberArray) {
            print("$i ")
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