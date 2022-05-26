package kot.sorting_algorithms_collection

class BubbleSort {

	fun sortInt(numbers: MutableList<Int>): List<Int> {
		for (i in 1 until numbers.size) {
			for (j in numbers.size - 1 downTo i) {
				if (numbers[j] < numbers[j - 1]) {
					val temp = numbers[j]
					numbers[j] = numbers[j - 1]
					numbers[j - 1] = temp
				}
			}
		}
		return numbers
	}

	fun sortInt(numbers: Array<Int>) = sortInt(numbers.toMutableList())
	fun sortInt(vararg numbers: Int) = sortInt(numbers.toMutableList())
}