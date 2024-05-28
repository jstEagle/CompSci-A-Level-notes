Works like a "Stack" of books.


| 2|  TOS   | 
| ------ | --- |
| 7|     |
|5 |     |
|6 |     |

<mark class="hltr-blue">TOS</mark> - Top of stack pointer

##### Add (push)
1) check if there is space
2) If there is space, adjust top pointer
3) Insert the new value at location set by top pointer

##### Remove (Pop)
1) Check if items still in stack
2) If yes, remove item at location set by TOS
3) Update TOS

## <mark class="hltr-green">LIFO</mark> data structure

Last in - First out.

The last item stored in the stack is the first one taken out.


### Example
Fill in the stack to represent the following instructions:

Push(5)
Push(3)
Pop()
Push(7)
Push(2)
Push(8)
Pop()
Pop()

