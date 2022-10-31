package Employee;
public class Employee {

	private long employeeID;
	private String employeeName;
	private double Salary;

	public Employee() {
	}

	public Employee(long employeeID, String employeeName, double salary) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		Salary = salary;
	}

	public long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	
	
}
