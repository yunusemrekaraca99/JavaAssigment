package School;

import java.util.List;

public class Student {
	private long StudentID;
	private String StudentName;
	private double AvarageMark;
	private Classroom Classroom;
	private List<Student> StudentList;
	
	public Student(int StudentID, String StudentName, double AvarageMark) {

		this.StudentID = StudentID;
		this.StudentName = StudentName;
		this.AvarageMark = AvarageMark;
	}
	
	public long getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public double getAvarageMark() {
		return AvarageMark;
	}
	public void setAvarageMark(double avarageMark) {
		AvarageMark = avarageMark;
	}

	public List<Student> getStudentList() {
		return StudentList;
	}
	public void setStudentList(List<Student> studentList) {
		StudentList = studentList;
	}

	public Classroom getClassroom() {
		return Classroom;
	}

	public void setClassroom(Classroom classroom) {
		Classroom = classroom;
	}
}
