import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class attendanceList{
	public static void main(String[] args){
		
		LinkedList <String> attendanceList = new LinkedList<>();
		
		//Adding 5 student names 
		attendanceList.add("Alice");
		attendanceList.add("Bob");
		attendanceList.add("Charlie");
		attendanceList.add("Diana");
		attendanceList.add("Eve");
		
		//Display the full list
		System.out.println("Initial attendance list:"+ attendanceList);
		
		//Simulate an absence by removing a student name (e.g., "Charlie") from the list
		attendanceList.remove("Charlie");
		
		//Display the updated attendance list after the removal
		System.out.println("Updated attendanceList: "+attendanceList);
		
		//Print the first and last student in the list
		System.out.println("First student in the list:"+attendanceList.getFirst());
		System.out.println("Last student in the list:"+attendanceList.getLast());
		
		//Print the total number of present students
		System.out.println("Total number of students presented :"+attendanceList.size());
		
		//Check if the list is empty, and print a message based on that
		if(attendanceList.isEmpty()){
			System.out.println("The list is empty");
		}else{
			System.out.println("The list isnt empty");
		}
		
		//Try adding a new student (e.g., "Frank") at a specific index, and show the updated list
		attendanceList.add(2,"Frank");
		System.out.println("Attendance list after addind the new student: " );
		
	
		for(int i=0;i<attendanceList.size();i++){
			System.out.println((i+1) + ". " + attendanceList.get(i));
		}
		 	/* 
		int i=1;
		for(String student : attendanceList){
			System.out.println(i+ ". "+student);
			i++;
		}
		 */
		 
		//Clear the list and print a message based on it
		attendanceList.clear();
		if(attendanceList.isEmpty()){
			System.out.println("The list is empty");
		}else{
			System.out.println("The list isnt empty");
		}
		
	}
}
