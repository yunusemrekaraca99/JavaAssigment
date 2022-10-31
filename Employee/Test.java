package Employee;

public class Test {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEmployeeID(43);
		employee1.setEmployeeName("Yunus Emre Karaca");
		employee1.setSalary(2430);
		
		System.out.println(
		"Employee ID: "+employee1.getEmployeeID()+"\n"
		+"Employee Name: "+employee1.getEmployeeName()+"\n"
		+"Salary: "+employee1.getSalary());
	}

}
