package Employee;

public class EmployeeConverter {
	public Employee parse(String line) {
		String[] fields = line.split(";");
		long employeeID=Long.parseLong(fields[0]);
		String employeeName=fields[1];
		double Salary=Double.parseDouble(fields[2]);
		
		Employee employee = new Employee(employeeID,employeeName,Salary);
		return employee;
	}
	public String format(Employee employee) {
		StringBuilder builder = new StringBuilder();
		builder.append(employee.getEmployeeID()).append(";");
		builder.append(employee.getEmployeeName()).append(";");
		builder.append(employee.getSalary()).append(";");
		String string = builder.toString();
		return string;
	}
}
