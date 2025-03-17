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
```
         10

    5           15

  2   7      12    18
```
Notice that 7 is still smaller than 10, and 12 is still greater than 10, while still being left and right respectively.

This pattern results in an optimized search pattern, in which in a log2(n) where n is the number of levels, number of node accesses required to find your data.

This is done via simple comparison. If x > root, go right, x < root, go left.

The downside that when putting data into a binary search tree, it must already be sorted to make sure that it is placed into the proper nodes.

When removing from a Binary Search Tree, Left-sided Nodes replace the root node.

The statistics for a Binary Search Tree:
A properly sorted Binary Search Tree has an Access, Search, Insertion, and Deletion time of O(log(n)).

The biggest downside to the Binary Search Tree is the need for data to be sorted prior to insertion into the tree. This means that the real performance of the Binary Search Tree will be relative to your ability to sort the incoming data.

## Stacks / Queue
Stacks are a simple data structure type. Stacks are commonly implemented using Arrays.

Stacks are a LIFO data structure, meaning that you can only access the last data put into the stack at any given time. Accessing this data is done via two means, peeking, which allows you to see the data, but doesn't remove it, or by pop, which removes the item from the stack.
Adding Data to a stack is called pushing. Once you've pushed, you can only access that data until you pop it.

Queues are similar to a stack, except they function in FIFO, or the first item added, is the first item out, but you cannot access any later added data until you take out the first.

Stack/Queue Statistics:
Accessing, and searching for data is an O(n) operation, as you'll need to pop each data in the structures until you find the one that you need.

On the other hand, inserting and deletion are an O(1) constant time operation, since it's as always as simple as taking the first piece of data off the pile, whether that's LIFO, or FIFO.

## Sorting  Algorithms
There are many sorting Algorithms that are available. Within this repository, you can find an example of a merge sort.

In general, the rule of thumb is a good sorting algorithms has as few statements, and as few loops, as possible.

When looking at Algorithms, you should try and target algorithms with O(1), O(logn), and depending upon the use case, O(n), which is linear time. (Takes as long as N number of items. Should only be used in small collections.)

## While Loops
While Loops one of the three common types of loops. While loops are indefinite loops, that have no set up within declaration.

A while loop is best used where you have an unknown variable number of times that you will do the same action. Such as display a menu for a game.

### Do While Loops
Do while Loops are similar to the while loop, except the code within executes once regardless of the variable condition.

Do While Loops aren't available in every programming language (Python in particular strikes to me) so I will tend to favor the While loop, when programming in general.
Despite that, in an interview, favor them where possible, as it shows that you know what loop is best for the job. You have a good understanding of the languages and concepts.

## For Loops
For loops are a good type of loop in the case of having a definite number of times a loop will run. Such as if you need to loop through an entire array, but no further.

For loops involving declaring of your conditions at initialization, such as a counter variable, when you exit, and what to do at the start of the next iteration. (Increasing counter variable is most common.)

NOTE: This standard for loop doesn't exist in Python, instead Python only has the for each loop. A for classic for loop can be simulated by using enumerate. Example:
```python
  for index, item in enumerate(items):
    pass
```

### For Each Loops
For Each Loops are similar to the for loop, except they specialize in data retrieval from a collection. For Each Loops do NOT transparently track the index of each item.
If you need to know where you are in a collection, it's best to favor the standard for loop.

The setup for a for each loop is quite a bit different from the standard for loop. It involves declaring a variable for the current item at the index (which you can't see) and what collection you're iterating through.

## If and Switch Statements
Both the If and Switch Statements are logical branching operations. Such as perform this code if x is true.

In general, if statements are the most simple and common type of logical control, when there are only two or three potential path ways. (Commonly using the if-else-if-else pattern.)

When there are multiple potential pathways for code, it may be desirable to instead use a switch statement (Match in Python).

The Switch Statement specializes in larger path branching operations.

When using a Switch Statement, I believe it is best to keep the conditional code down to minimum. It should primarily be used for calling another method, where the real logic will happen.

In most languages, the switch statement is setup like the following:
```java
  switch(conditional){
    case true:
        trueMethod();
        break // Breaks are required in most languages, to not flow into the next case.
    case false:
        falseMethod();
        break;
    default:
        throw new InvalidConditionException();
        break;
  }
```

## Classes
Classes are the blueprint of an object to be initialized later.

In general, classes are best used for grouping of related utility code, and for Object Oriented Programming.

### OOP in Five Lines
- Object Oriented Programming is the concept of declaring code that represents an object. An Object can extend an other object to add more functionality to a super class. (The extending object is called a subclass). This is also called Polymorphism.
- Methods in the object should be related to the actions and requirements of said object.
- All data in an object should be private, with getter and setter methods to retrieve and set the private data.
- Abstract Classes and Interfaces are a way to have classes conform to an expected set of behavior or methods defined within the Abstract Class or Interface.
- In general, a good OOP pattern looks like: Data Class -> Manager Class -> Test Class.

### Overriding
In OOP, when extending an object, it is expected that you will "override" methods from the super class, with your own logic.
This is generally done by  writing a method in your child class with the same name as the method from the parent class. Some languages have an override keyword, which should be used where possible to mark.
If you need to access your super class, most languages have the super keyword, which represents the super class object.

Abstract Classes are classes that cannot be directly instantiated into an object. Instead they are meant primarily to be extended.
A method declared "abstract" must be overridden by the subclass. An abstract class can have implementation logic, it just cannot be instantiated directly.

An Interface is an outline of expected methods to be found within a class. If a class implements the Comparison interface, it is expected to have some comparison logic, generally under the name compareTo.
Interfaces generally do not have logic inside of their methods. They are just an outline of expected functionality from your class. Used heavily in generic programming, for specifying expected features for a generic.