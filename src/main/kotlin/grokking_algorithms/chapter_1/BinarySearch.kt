package grokking_algorithms.chapter_1

//log2n = steps
//log2 240_000 = 18

class BinarySearch {

	fun searchInt(list: List<Int>, item: Int): Int? {
		var low = 0
		var height = list.count() - 1

		while (low <= height) {
			val mid = (low + height) / 2
			val guess = list[mid]
			if (guess == item) {
				return mid
			}
			if (guess > item) {
				height = mid - 1
			} else {
				low = mid + 1
			}
		}
		return null
	}
}