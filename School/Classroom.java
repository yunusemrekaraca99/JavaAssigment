package School;

import java.util.List;


public class Classroom {
	private int classroomID;
	private String clasroomName;
	private List<Student> StudentList;
	private List<Classroom> ClassroomList;
	private School School;
	public Classroom(int classroomID, String clasroomName) {

		this.classroomID = classroomID;
		this.clasroomName = clasroomName;
	}
	public int getClassroomID() {
		return classroomID;
	}
	public void setClassroomID(int classroomID) {
		this.classroomID = classroomID;
	}
	public String getClasroomName() {
		return clasroomName;
	}
	public void setClasroomName(String clasroomName) {
		this.clasroomName = clasroomName;
	}
	public List<Student> getStudentList() {
		return StudentList;
	}
	public void setStudentList(List<Student> studentList) {
		StudentList = studentList;
	}
	public List<Classroom> getClassroomList() {
		return ClassroomList;
	}
	public void setClassroomList(List<Classroom> classroomList) {
		ClassroomList = classroomList;
	}
	public School getSchool() {
		return School;
	}
	public void setSchool(School school) {
		School = school;
	}

}
