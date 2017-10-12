# Questions & Answers

## TestIterator Questions
### 1. Also try with a LinkedList - does it make any difference?
To use a Linkedlist does not affect the test functions, but the performance of each test is varied. 

For `testEmpty` and `testAverageBalues` seem faster with ArrayList, while `testRemove` and `testNonempty` perform better with Linkedlist.

### 2. What happens if you use list.remove(77)?
It will throw an `OutOfBoundException` as `java.lang.IndexOutOfBoundsException: Index: 77, Size: 7`.

## TestList Questions
### 1. Also try with a LinkedList - does it make any difference?
The Linkedlist still does not affect the functions but the performance of some of the tests.

Some of the tests with ArrayList perform better than those with LinkedList, such as `testSet`, `testAddMultiple2`, `testRemoveObject` and `testSubList`. Others does not show much differences.

### 2. `list.remove(5);` // what does this method do?
This method is to delete element with `index 5`, that is 77 in the list.

`[3, 77, 4, 77, 5, 77, 6]` becomes `[3, 77, 4, 77, 5, 6]`.

### 3. `list.remove(Integer.valueOf(5));` // what does this one do?
This method is to delete element of integer number 5 in the list, the one with `index 4`.

`[3, 77, 4, 77, 5, 77, 6]` becomes `[3, 77, 4, 77, 77, 6]`.

## TestPerformance Questions
[My Google Sheet document](https://docs.google.com/spreadsheets/d/15iLQ7I2MwR-ArpZwzql9efGmgKMOe9XNoixdfz3pTLc/edit?usp=sharing) to record running time for SIZE = 10, 100, 1000, 10000.
 