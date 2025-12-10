package assignments;

public class Assignment3_EmployeesClass {
	
	String [] employeeNames = new String [3];
	{
	employeeNames[0] = "Bharath";
	employeeNames[1] = "John";
	employeeNames[2] = "Aarav";
	}
	int [] employeeIds = new int [3];
	{
	employeeIds[0] = 1234;
	employeeIds[1] = 1235;
	employeeIds[2] = 1236;
	}
	
	public static void main(String[] args) {
		
		//className obj = new className();
		
		Assignment3_EmployeesClass obj = new Assignment3_EmployeesClass();
		
		System.out.println("EmployeeName1:" + obj.employeeNames[0] +"," + "Employee Id1:" + obj.employeeIds[0]);
		System.out.println("EmployeeName2:" + obj.employeeNames[1] +"," + "Employee Id2:" + obj.employeeIds[1]);
		System.out.println("EmployeeName3:" + obj.employeeNames[2] +"," + "Employee Id3:" + obj.employeeIds[2]);

	}

}
