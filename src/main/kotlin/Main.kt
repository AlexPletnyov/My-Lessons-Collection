package kot

import grokking_algorithms.chapter_1.BinarySearch
import kot.sorting_algorithms_collection.BubbleSort

fun main() {

	val myList = mutableListOf(3, 4, 46, 3, 1, 6, 9, 4, 25, 343, 23, 5, 4, 3, 2)
	val searcher = BinarySearch()
	val sorter = BubbleSort()
	val sortedList = sorter.sortInt(myList)
	println(sortedList.toString())
	println(searcher.searchInt(sortedList, 3))
}