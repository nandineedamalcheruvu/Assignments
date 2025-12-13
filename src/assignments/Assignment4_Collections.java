package assignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignment4_Collections {

	public static void main(String[] args) {
		
		System.out.println("**********************STUDENT DETAILS*************************************");
		//Storing Student Details
		//Student1 Details
		Map<String,String> student1Data = new LinkedHashMap<String,String>();
		student1Data.put("Name", "Jhon Doe");
		student1Data.put("Age", "20");
		student1Data.put("Gender", "Male");
		student1Data.put("Roll Number", "SBA12345");
		student1Data.put("Grade", "A++");
		student1Data.put("Major", "Computer Science");
		student1Data.put("GPA", "A3.8");
		student1Data.put("Email", "john@example.com");
		student1Data.put("PAN Number", "SDF6543210");
		student1Data.put("Address", "123 Elm St");
		System.out.println("Student 1 details :" + student1Data);
		
		//Student2 Details
		Map<String, String> student2Data = new LinkedHashMap<String, String>();
		student2Data.put("Name", "Jane Smith");
		student2Data.put("Age", "21");
		student2Data.put("Gender", "Female");
		student2Data.put("Roll Number", "S12346");
		student2Data.put("Grade", "B+");
		student2Data.put("Major", "Mathematics");
		student2Data.put("GPA", "A3.5");
		student2Data.put("Email", "jane@example.com");
		student2Data.put("PAN Number", "REW6543211");
		student2Data.put("Address", "456 Oak St");
		System.out.println("Student 2 details :" + student2Data);
		
		//Student3 Details
		Map<String, String> student3Data = new LinkedHashMap<String, String>();
		student3Data.put("Name", "Mike Brown");
		student3Data.put("Age", "22");
		student3Data.put("Gender", "Male");
		student3Data.put("Roll Number", "S12347");
		student3Data.put("Grade", "A+");
		student3Data.put("Major", "Physics");
		student3Data.put("GPA", "A3.9");
		student3Data.put("Email", "mike@example.com");
		student3Data.put("PAN Number", "TYR6543212");
		student3Data.put("Address", "789 Pine St");
		System.out.println("Student 3 details :" + student3Data);
		
		//Add student details to a list
		List<Map<String, String>> studentList = new ArrayList<Map<String, String>>();
		studentList.add(student1Data);
		studentList.add(student2Data);
		studentList.add(student3Data);
		System.out.println("Student Details:"+studentList);

		System.out.println("*************************EMPLOYEE DETAILS**********************************");
		//Storing Employee Details
		//Employee1 Details
		Map<String, String> employee1Data = new LinkedHashMap<String, String>();
		employee1Data.put("Employee ID", "E001");
		employee1Data.put("Name", "Alice Green");
		employee1Data.put("Age", "30");
		employee1Data.put("Gender", "Female");
		employee1Data.put("Department", "Engineering");
		employee1Data.put("Position", "Software Engineer");
		employee1Data.put("Salary", "75K Pounds");
		employee1Data.put("Email", "alice@example.com");
		employee1Data.put("PAN Number", "SDF6543210");
		System.out.println("Employee 1 details :" + employee1Data);

		//Employee2 Details

		Map<String, String> employee2Data = new LinkedHashMap<String, String>();
		employee2Data.put("Employee ID", "E002");
		employee2Data.put("Name", "Bob Johnson");
		employee2Data.put("Age", "35");
		employee2Data.put("Gender", "Male");
		employee2Data.put("Department", "Marketing");
		employee2Data.put("Position", "Marketing Manager");
		employee2Data.put("Salary", "85K Pounds");
		employee2Data.put("Email", "bob@example.com");
		employee2Data.put("PAN Number", "REW6543211");
		System.out.println("Employee 2 details :" + employee2Data);

		//Employee3 Details

		Map<String, String> employee3Data = new LinkedHashMap<String, String>();
		employee3Data.put("Employee ID", "E003");
		employee3Data.put("Name", "Carol White");
		employee3Data.put("Age", "28");
		employee3Data.put("Gender", "Female");
		employee3Data.put("Department", "Sales");
		employee3Data.put("Position", "Sales Executive");
		employee3Data.put("Salary", "65K Pounds");
		employee3Data.put("Email", "carol@example.com");
		employee3Data.put("Pan Number", "TYR6543212");
		System.out.println("Employee 3 details :" + employee3Data);

		// Add employee details to a list

		List<Map<String, String>> employeeList = new ArrayList<Map<String, String>>();
		employeeList.add(employee1Data);
		employeeList.add(employee2Data);
		employeeList.add(employee3Data);
		System.out.println("Employee List :" + employeeList);
		
		System.out.println("**********************PRODUCT DETAILS***********************************");
		//Storing Product Details
		//Product1 Details

		Map<String, String> product1Data = new LinkedHashMap<String, String>();
		product1Data.put("Product ID", "P001");
		product1Data.put("Name", "Laptop");
		product1Data.put("Category", "Electronics");
		product1Data.put("Price", "12K Pounds");
		product1Data.put("Stock Quantity", "Not Available");
		product1Data.put("Supplier", "Tech Supplies");
		product1Data.put("Warranty", "2 years");
		product1Data.put("Rating", "4.5");
		product1Data.put("Manufacturing Date", "Aug 2023");
		product1Data.put("Expiry Date", "Aug 2028");
		System.out.println("Product 1 details :" + product1Data);

		//Product2 Details

		Map<String, String> product2Data = new LinkedHashMap<String, String>();
		product2Data.put("Product ID", "P002");
		product2Data.put("Name", "Desk Chair");
		product2Data.put("Category", "Furniture");
		product2Data.put("Price", "150K Pounds");
		product2Data.put("Stock Quantity", "2");
		product2Data.put("Supplier", "Office Depot");
		product2Data.put("Warranty", "1 year");
		product2Data.put("Rating", "4");
		product2Data.put("Manufacturing Date", "Sep 2024");
		product2Data.put("Expiry Date", "N/A");
		System.out.println("Product 2 details :" + product2Data);

		//Product3 Details

		Map<String, String> product3Data = new LinkedHashMap<String, String>();
		product3Data.put("Product ID", "P003");
		product3Data.put("Name", "Coffee Maker");
		product3Data.put("Category", "Kitchen");
		product3Data.put("Price", "75 Pounds");
		product3Data.put("Stock Quantity", "200");
		product3Data.put("Supplier", "KitchenWorld");
		product3Data.put("Warranty", "6 months");
		product3Data.put("Rating", "4.2");
		product3Data.put("Manufacturing Date", "Jan 2025");
		product3Data.put("Expiry Date", "Jan 2027");
		System.out.println("Product 3 details :" + product3Data);

		// Add Product details to a list

		List<Map<String, String>> productList = new ArrayList<Map<String, String>>();
		productList.add(product1Data);
		productList.add(product2Data);
		productList.add(product3Data);
		System.out.println("Product List :" + productList);


		System.out.println("******************Print the data from Product details > Supplier Name > Office Depot *****************************************");
		System.out.println("Supplier Name: "+ product2Data.get("Supplier"));
	}
}

