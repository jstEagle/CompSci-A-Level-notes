Linked lists are fundamental data structures in computer science that provide dynamic storage for elements. Unlike arrays, linked lists do not require contiguous memory allocation and can efficiently insert and delete elements. Below is a short summary of linked lists along with Java code examples.

## Introduction

A linked list is a linear data structure consisting of nodes, each containing a data element and a reference (or link) to the next node in the sequence. The last node typically points to `null`, indicating the end of the list. Linked lists come in various forms, with the two most common types being singly linked lists (each node points to the next node) and doubly linked lists (each node points to both the next and previous nodes).

## Java Code Examples

### Creating a Simple Singly Linked List

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.append(10);
        myList.append(20);
        myList.append(30);
        myList.display(); // Output: 10 -> 20 -> 30 -> null
    }
}
```

### Deleting a Node from a Singly Linked List

```java
class LinkedList {
    // ... (previous code)

    void delete(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.append(10);
        myList.append(20);
        myList.append(30);
        myList.delete(20);
        myList.display(); // Output: 10 -> 30 -> null
    }
}
```

Linked lists are versatile and can be used to implement various data structures like stacks, queues, and more. Understanding how to manipulate linked lists is a fundamental skill for computer scientists and software engineers.