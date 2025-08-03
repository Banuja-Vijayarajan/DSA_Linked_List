import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class fruits{
	public static void main(String[] args){
	
	//Create a LinkedList of fruits
	LinkedList <String> fruits = new LinkedList<>();
	
	//Add 5 fruits, print the list
	fruits.add("Mango");
	fruits.add("Apple");
	fruits.add("Papaya");
	fruits.add("Kiwi");
	fruits.add("Grapes");
	
	System.out.println("Original List: " + fruits);
	
	// Add a new fruit at index 2
	fruits.add(2,"Blueberry");
	System.out.println("After adding Blueberry at index 2: " + fruits);
	
	fruits.removeLast();
	System.out.println("After removing last fruit: " + fruits);
	
	//print the size
	System.out.println("Size of the list: " + fruits.size());
	
	//access elements
	System.out.println("First fruit: "+fruits.getFirst());
	System.out.println("Last fruit: "+fruits.getLast());
	System.out.println("Fruit at index 4: "+fruits.get(4));
	
	//Print all using for-each loop
	System.out.println("List of fruit: ");
	for(String fruit : fruits){
	System.out.println("- "+ fruit);	
	}
	//"For every String item called fruit inside the fruits list,do the following..."
/* 
So if fruits = [Mango, Apple, Blueberry, Papaya, Kiwi], 
this loop runs 5 times, and each time:

| **Loop Count** | **fruit =** |
| -------------- | ----------- |
| 1              | "Mango"     |
| 2              | "Apple"     |
| 3              | "Blueberry" |
| 4              | "Papaya"    |
| 5              | "Kiwi"      |

 */
 
	//Clear the List
	fruits.clear();
	System.out.println("After clearing the list: "+ fruits);

	// Check if list is empty
	if(fruits.isEmpty()){
		 System.out.println("The list is empty");
	} else {
		System.out.println("The list stil contains something");
	}
	}
}

