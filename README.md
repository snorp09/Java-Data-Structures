# Interview Cheat Sheet
### Citation: O-Notation values are found from: https://www.bigocheatsheet.com/

## Arrays
Arrays are the most primitive type of data structure, as arrays simply are a block of memory, indexed.
The down side to an array, is that the size of the data must be known at compile time. Arrays are not runtime resizable without a copy and replace procedure.

Arrays have the following statistics:
Accessing is in constant time O(1)
Searching, Insertion, and Deletion all have O(n) time.

## Linked Lists
Linked Lists are a data structure, that is essentially a chain of objects.
Each Link in a Linked List should have a reference/pointer to the next object in the chain.
We're at the end of the chain, the reference should be null, as there is no more links.

Linked Lists are best used in a situation where there is lots of data insertion, and data movement, such as inserting at an index, or removing.

Linked Lists have the following statistics:
Accessing Data in a linked list runs in linear time, O(n), due to the need to go through each node to check their value.

Linked Lists perform best at insertion, and deletion, as they are performed at constant time, 0(1). Again, consider a linked list if you're doing lots of these operations, and less data retrieval.

### Doubly-Linked List
The Doubly-Linked list is the same as the above Linked List, except in that a Doubly-Linked Node is aware of both it's next Link, but also the Link that came before it. This means that it is better in the situation in which data will need to communicate across the nodes in its chain.

The statistics for the Doubly-Linked List are the same as the statistics for the prior Linked List.

(I have implemented this Data Structure, please see structures/List.java, structures/LinkNode.java)

## Binary Search Trees
Binary Search Trees are a data structure optimized for data retrieval. The pattern is as follows: In a Binary Tree, each node has two potential references to other nodes. A Left, and a Right, branch. The branches should be organized as left branch nodes have smaller values, and right branch nodes have higher values. Each node inserted, should follow this rule, from the prior node. I.E.
         10
    5           15
  2   7      12    18

Notice that 7 is still smaller than 10, and 12 is still greater than 10, while still being left and right respectively.

This pattern results in an optimized search pattern, in which in a log2(n) where n is the number of levels, number of node accesses required to find your data.

This is done via simple comparison. If x > root, go right, x < root, go left.

The downside that when putting data into a binary search tree, it must already be sorted to make sure that it is placed into the proper nodes.

When removing from a Binary Search Tree, Left-sided Nodes replace the root node.

The statistics for a Binary Search Tree:
A properly sorted Binary Search Tree has an Access, Search, Insertion, and Deletion time of O(log(n)).

The biggest downside to the Binary Search Tree is the need for data to be sorted prior to insertion into the tree. This means that the real performance of the Binary Search Tree will be relative to your ability to sort the incoming dat.

## Stacks / Queue
Stacks are a simple data structure type. Stacks are commonly implemented using Arrays.

Stacks are a LIFO data structure, meaning that you can only access the last data put into the stack at any given time. Accessing this data is done via two means, peeking, which allows you to see the data, but doesn't remove it, or by pop, which removes the item from the stack.
Adding Data to a stack is called pushing. Once you've pushed, you can only access that data until you pop it.

Queues are similar to a stack, except they function in FIFO, or the first item added, is the first item out, but you cannot access any later added data until you take out the first.

Stack/Queue Statistics:
Accessing, and searching for data is an O(n) operation, as you'll need to pop each data in the structures until you find the one that you need.

On the other hand, inserting and deletion are an O(1) constant time operation, since it's as always as simple as taking the first piece of data off the pile, whether that's LIFO, or FIFO.

## While Loops

## For Loops

## Classes