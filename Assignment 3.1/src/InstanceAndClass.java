
class Cal   //creating a new class to  calculate salary
{
	private double salary;		//creating an instance variable which will be visible within the Cal class
	public String name;		//creating an instance variable which can be accessed in the child class as well
	public void setSalary(double sal) {  //salary variable to assign a value
		salary = sal;
	}
	public void print() {   //method to print the salary that has been set using the setSalary method
		System.out.print(salary);
	}
}

public class InstanceAndClass {

	public static final String department = "Development";  //creating class variable by making the value of the variable static and final
	
	public static void main(String[] args) {  //main method 
		
		Cal c = new Cal();   //creating an object of cal to access the members of the class
		c.setSalary(59280);		//calling the method of class Cal using the created object and passing some parameter for that method
		System.out.println("Salary of " +department+ " is: " );  //displaying the output on the console
		c.print();  //printing the salary which is present in cal class using the object created
	}

}

