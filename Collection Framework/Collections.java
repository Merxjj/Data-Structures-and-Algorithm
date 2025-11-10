compact yet detailed cheat sheet of the most common Java Collection methods with descriptions, grouped by collection type. This is perfect for interviews or quick reference.

1️⃣ ArrayList / List

add(E e) → Adds an element to the end of the list.

get(int index) → Returns the element at the given index.

set(int index, E element) → Replaces the element at the given index.

remove(int index) / remove(Object o) → Removes element by index or value.

size() → Returns the number of elements.

contains(Object o) → Returns true if the list contains the element.

isEmpty() → Checks if the list is empty.

clear() → Removes all elements from the list.

2️⃣ LinkedList / Deque

addFirst(E e) / addLast(E e) → Adds element to start or end.

removeFirst() / removeLast() → Removes element from start or end.

getFirst() / getLast() → Returns first or last element.

offer(E e) → Adds element to the queue (like add).

poll() → Retrieves and removes the head of the queue.

peek() → Retrieves but does not remove the head.

size(), isEmpty(), clear() → Standard list/collection methods.

3️⃣ HashSet / Set

add(E e) → Adds element (ignored if duplicate).

remove(Object o) → Removes the element.

contains(Object o) → Checks if element exists.

size() → Number of elements.

isEmpty() → True if empty.

clear() → Removes all elements.

LinkedHashSet preserves insertion order, TreeSet stores elements in sorted order.

4️⃣ HashMap / Map

put(K key, V value) → Inserts or updates key-value pair.

get(K key) → Returns value for the key (null if not found).

remove(K key) → Removes key-value pair.

containsKey(K key) → Checks if a key exists.

containsValue(V value) → Checks if a value exists.

keySet() → Returns a set of all keys.

values() → Returns a collection of all values.

entrySet() → Returns a set of Map.Entry (key-value pairs).

size(), isEmpty(), clear() → Standard operations.

LinkedHashMap preserves insertion order, TreeMap maintains sorted keys.
TreeMap also has: firstKey(), lastKey(), ceilingKey(K key), floorKey(K key).

5️⃣ PriorityQueue

offer(E e) / add(E e) → Adds element to the queue.

poll() → Retrieves and removes the head (min or max depending on comparator).

peek() → Retrieves but does not remove the head.

remove(Object o) → Removes specific element.

size(), isEmpty(), clear() → Standard methods.

Min-heap by default; for max-heap: new PriorityQueue<>(Collections.reverseOrder()).

🔹 Easy Memory Tip / Mnemonic
Collection	Mnemonic	Methods
ArrayList	AGSR	Add, Get, Set, Remove, Size, contains, isEmpty, clear
LinkedList / Deque	FL-OPP	addFirst/Last, removeFirst/Last, offer, poll, peek
Set	ARCS	Add, Remove, Contains, Size, isEmpty, clear
Map	PGR-CKVE	Put, Get, Remove, Contains (Key/Value), keySet, values, entrySet
Tree	Sorted	first(), last(), ceiling(), floor()
PriorityQueue	OPP	Offer, Poll, Peek, remove, size, isEmpty, clear