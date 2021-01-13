# JCF

## Java Colletion Framework

A Collection represents a group of objects known as it's elements.  
Java Collection Framework is a set of classes and interfaces that implement common data structures like Array, LinkedList, Stack, Queue, Tree, Hashing, etc.  

The Root Interface in the collection hierarchy is `Collection<E>`. It is an *interface*.  
`<E>` Syntax tells us that the interface is generic.  
Generic means more type safety, it adds the compile time safety to the collections framework.  
And the **E** denotes **Element's DataType**.  

### Benefit of JCF:

1. Reduces programming effort by providing useful datastructures and algorithms.
2. Increase program speed and quality.

**Map does not extend from java.util.Collection**, but still it is considered as a part of collection framework.  

We use **List** when sequence matters, i.e storing the elements in insertion order. It can also contain duplicate elements.  
We use **Set** when uniqueness matters, i.e no duplicate elements.  
We use **Map** when finding something by key matters.  


#### List:

- ArrayList: ArrayList<Integer> AL = new ArrayList<Integer>();