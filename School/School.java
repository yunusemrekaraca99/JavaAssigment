package School;

import java.util.List;

public class School {
	private int SchoolID;
	private String SchoolName;
	private List<Student> StudentList;
	private List<Classroom> ClassroomList;
	private List<School> SchoolList;
	
	public School(int SchoolID, String SchoolName) {

		this.SchoolID = SchoolID;
		this.SchoolName = SchoolName;
	}
	
	public int getSchoolID() {
		return SchoolID;
	}
	public void setSchoolID(int schoolID) {
		SchoolID = schoolID;
	}
	public String getSchoolName() {
		return SchoolName;
	}
	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
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
	public List<School> getSchoolList() {
		return SchoolList;
	}
	public void setSchoolList(List<School> schoolList) {
		SchoolList = schoolList;
	}
}
