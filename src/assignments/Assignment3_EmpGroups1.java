package assignments;

public class Assignment3_EmpGroups1 extends Assignment3_EmployeesClass1 {
	
    String[] employeeNames = new String[3];
    int[] employeeIds = new int[3];
    {
        employeeNames[0] = emp1Name;
        employeeNames[1] = emp2Name;
        employeeNames[2] = emp3Name;

        employeeIds[0] = emp1ID;
        employeeIds[1] = emp2ID;
        employeeIds[2] = emp3ID;
    }

	public static void main(String[] args) {
	
		Assignment3_EmpGroups1 obj2 = new Assignment3_EmpGroups1();

		System.out.println("Employee Name: " + obj2.employeeNames[0] + ", Employee ID: " + obj2.employeeIds[0]);
        System.out.println("Employee Name: " + obj2.employeeNames[1] + ", Employee ID: " + obj2.employeeIds[1]);
        System.out.println("Employee Name: " + obj2.employeeNames[2] + ", Employee ID: " + obj2.employeeIds[2]);
	}

}
