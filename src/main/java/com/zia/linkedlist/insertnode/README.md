# Problem
You’re given the pointer to the head node of a linked list, an integer to add to the list and the position at which the integer must be inserted. Create a new node with the given integer, insert this node at the desired position and return the head node.

A position of 0 indicates head, a position of 1 indicates one node away from the head and so on. The head pointer given may be null meaning that the initial list is empty.

As an example, if your list starts as 1->2->3 and you want to insert a node at position 2 with data=4, your new list should be 1->2->4->3
###Input Format
The first line contains an integer , the number of elements in the linked list. 
Each of the next n lines contains an integer SinglyLinkedListNode[i].data. 
The last line contains an integer position.
###Output Format
Return a reference to the list head. Locked code prints the list for you.
###Sample Input
```
3
16
13
7
1
2
```
###Sample Output
```
16 13 1 7
```