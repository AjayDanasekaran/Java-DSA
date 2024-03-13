package DSA;

public class ArrayListMethods {
	// Adding elements
//	boolean add(E element) - Adds the specified element to the end of the list.
//	void add(int index, E element) - Inserts the specified element at the specified position in the list.
//	boolean addAll(Collection<? extends E> c) - Appends all elements in the specified collection to the end of the list.
//	boolean addAll(int index, Collection<? extends E> c) - Inserts all elements in the specified collection into the list, starting at the specified index.
//
//	// Accessing elements
//	E get(int index) - Returns the element at the specified position in the list.
//	E set(int index, E element) - Replaces the element at the specified position with the specified element.
//
//	// Removing elements
//	boolean remove(Object o) - Removes the first occurrence of the specified element in the list.
//	E remove(int index) - Removes the element at the specified position in the list.
//	boolean removeAll(Collection<?> c) - Removes all elements in the specified collection from the list.
//	boolean removeIf(Predicate<? super E> filter) - Removes all elements that match the provided predicate.
//	void clear() - Removes all elements from the list.
//
	// Checking elements
//	boolean contains(Object o) - Checks if the list contains the specified element.
//	boolean containsAll(Collection<?> c) - Checks if the list contains all elements from the specified collection.
//	boolean isEmpty() - Checks if the list is empty.

	// Index-related methods
//	int indexOf(Object o) - Returns the index of the first occurrence of the specified element, or -1 if not found.
//	int lastIndexOf(Object o) - Returns the index of the last occurrence of the specified element, or -1 if not found.

	// Sublist
//	List<E> subList(int fromIndex, int toIndex) - Returns a view of a portion of the list from the specified fromIndex (inclusive) to the specified toIndex (exclusive).

	// Size and capacity
//	int size() - Returns the number of elements in the list.
//	void trimToSize() - Reduces the capacity of the list to the current size.
//	void ensureCapacity(int minCapacity) - Increases the capacity of the list, if necessary, to ensure it can hold at least minCapacity elements.

	// Array conversion
//	Object[] toArray() - Converts the list to an array of objects.
//	<T> T[] toArray(T[] a) - Converts the list to an array of type T.

	// Bulk operations
//	boolean addAll(Collection<? extends E> c) - Appends all elements in the specified collection to the end of the list.
//	boolean removeAll(Collection<?> c) - Removes all elements in the specified collection from the list.
//	boolean retainAll(Collection<?> c) - Retains only the elements in the list that are also in the specified collection.

	// Sorting
//	void sort(Comparator<? super E> c) - Sorts the elements of the list according to the order induced by the specified comparator.

	// Iteration and Streams
//	void forEach(Consumer<? super E> action) - Performs the given action for each element in the list.
//	Spliterator<E> spliterator() - Creates a late-binding and fail-fast Spliterator over the elements in the list.
//	Stream<E> stream() - Returns a sequential Stream with the elements of the list as its source.
//	Stream<E> parallelStream() - Returns a possibly parallel Stream with the elements of the list as its source.

	// Miscellaneous
//	boolean equals(Object o) - Compares the specified object with the list for equality.
//	int hashCode() - Returns the hash code of the list.
//	boolean equals(Object o) - Compares the specified object with the list for equality.
//	boolean forEach(Consumer<? super E> action) - Performs the given action for each element in the list.
//	Iterator<E> iterator() - Returns an iterator over the elements in the list.
//	ListIterator<E> listIterator() - Returns a list iterator over the elements in the list.
//	ListIterator<E> listIterator(int index) - Returns a list iterator over the elements in the list starting at the specified index.

	// Java 11+ features
//	boolean removeIf(Predicate<? super E> filter) - Removes all elements that match the provided predicate.
//	void replaceAll(UnaryOperator<E> operator) - Replaces each element of the list with the result of applying the given operator.
//	void forEach(Consumer<? super E> action) - Performs the given action for each element in the list.

}
