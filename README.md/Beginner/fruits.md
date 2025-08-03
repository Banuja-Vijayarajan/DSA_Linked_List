📚 Java LinkedList Cheat Sheet

LinkedList Methods – Java

1. add(value) – Adds an element to the end of the list
Example: fruits.add("Mango");

2. add(index, value) – Adds an element at a specific index
Example: fruits.add(2, "Blueberry");

3. remove() – Removes the first element
Example: fruits.remove();

4. remove(index) – Removes the element at a specific index
Example: fruits.remove(3);

5. removeFirst() – Removes the first element
Example: fruits.removeFirst();

6. removeLast() – Removes the last element
Example: fruits.removeLast();

7. get(index) – Gets the element at the given index
Example: fruits.get(1);

8. getFirst() – Gets the first element
Example: fruits.getFirst();

9. getLast() – Gets the last element
Example: fruits.getLast();

10. clear() – Removes all elements from the list
Example: fruits.clear();

11. isEmpty() – Returns true if the list is empty
Example: fruits.isEmpty();

12. size() – Returns the number of elements in the list
Example: fruits.size();

13. for-each loop – Iterates through all elements
Example:
for (String fruit : fruits) {
    System.out.println(fruit);
}

🧠 What I’ve Learned So Far:

✅ Creating a LinkedList:

LinkedList<String> fruits = new LinkedList<>();

✅ Adding Elements
.add(element) – Add to end
.add(index, element) – Insert at specific position

example: 
fruits.add("Apple");
fruits.add(1, "Mango");

✅ Removing Elements
.remove() – Removes first element
.remove(index) – Removes element at specific index
.removeFirst() – Removes first element
.removeLast() – Removes last element

example:
fruits.remove();
fruits.remove(2);
fruits.removeFirst();
fruits.removeLast();

✅ Accessing Elements
.get(index) – Get element at index
.getFirst() – Get first element
.getLast() – Get last element

example:
String first = fruits.getFirst();
String last = fruits.getLast();
String any = fruits.get(2);

✅ Checking List Status
.size() – Returns number of elements
.isEmpty() – Checks if list is empty

example:
int size = fruits.size();
boolean empty = fruits.isEmpty();

✅ Clearing the List
.clear() – Removes all elements

example:
fruits.clear();

✅ Looping through LinkedList
-> For-each Loop

for (String fruit : fruits) {
    System.out.println("- " + fruit);
}

Note: fruit here is a local variable that temporarily holds each element 
during the loop.
And the original list "fruits' remains unchanged through this process.


💡 Extra Tip: Synchronized LinkedList:
List<String> syncList = Collections.synchronizedList(fruits);
Makes the list thread-safe for multi-threaded environments.


📁 Use This to:
✅ Revise Java LinkedList quickly
✅ Copy/paste code snippets for practice
✅ Expand it with intermediate/pro-level topics
