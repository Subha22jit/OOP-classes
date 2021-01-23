#### HashSet

HashSet implemented by HashMap.  
in HashMap, we always have <Key, Value> pair, but HashSet has only <Value>, so, the Value of HashSet becomes the key in the HashMap with a static object as it's value.

HashSet containes unique elements, Key is unique.

In HashSet, method to insert is `add()`

In HashMap, method to insert is `put()`

`add()` calls `put()` internally.

Initial Capacity = 16  
Load Factor = 0.75

if LF = 1, 16*1 = more chances of collision

if LF = 0.5, increase space overhead and more rehashing, i.e. more time.

so, LF = 0.75, perfecto balanco.

#### TreeSet

Red - Black Tree: O(logn) always for basic operatons like add, remove, get.

TreeSet stores the elements in ascending order. It is implemented by Red-Black Tree.

Comparison between HashSet and TreeSet:

1. HashSet does not gurantee the order of elements. TreeSet stores the elements in ascending order.
2. Both are not synchronized.
3. Both store unique elements.
4. HashSet provides constat time performance for basic operations like add, remove, etc. TreeSet performance time O(logn)
5. They can be converted to each other.