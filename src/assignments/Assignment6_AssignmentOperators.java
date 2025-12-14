package assignments;

public class Assignment6_AssignmentOperators {

	public static void main(String[] args) {
	
		/*
		Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and marks [75, 80, 82] 
		Add 10 marks to each students using assignment operators and
		store it into another array, after adding 10 marks identify the average marks of all students
		*/
		
		String[] studentNames = {"Suresh","Mahesh","Naresh"};
		int[] marks = {75,80,82};
		
		int[] updatedMarks = new int[3];
		updatedMarks[0] = marks[0] + 10;  
        updatedMarks[1] = marks[1] + 10;
        updatedMarks[2] = marks[2] + 10;  
		
        // Calculate average 
        int sum = updatedMarks[0] + updatedMarks[1] + updatedMarks[2];
        double average = (double) sum / 3;

        // Print results
        System.out.println(studentNames[0] + " : " + updatedMarks[0]);
        System.out.println(studentNames[1] + " : " + updatedMarks[1]);
        System.out.println(studentNames[2] + " : " + updatedMarks[2]);

        System.out.println("Average Marks of All Students: " + average);
		
	}

}
