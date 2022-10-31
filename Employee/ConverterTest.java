package Employee;

public class ConverterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "241;Mansur Yavaş;4350.0";
		System.out.println("Satır:" + line);
		
		EmployeeConverter converter = new EmployeeConverter();
		Employee employee2 = converter.parse(line);
		
		System.out.println(employee2);
		
		String string = converter.format(employee2);
		System.out.println(
				"ID: "+employee2.getEmployeeID()
				+"\n"+
				"Name: "+employee2.getEmployeeName()
				+"\n"+
				"Salary:"+employee2.getSalary()
				+"\n"+
				"2.Gösterim --> Sicim:"+string);
	}

}
