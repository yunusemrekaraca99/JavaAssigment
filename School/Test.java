package School;

import java.util.ArrayList;
import java.util.List;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School schoolA=new School(801,"Godoro Üniversitesi");
		schoolA.setClassroomList(new ArrayList<Classroom>());
		Classroom classroomA= new Classroom(601,"Mühendislik Fakültesi");
		schoolA.getClassroomList().add(classroomA);
		
		Classroom classroomB= new Classroom(602,"Ekonomi Fakültesi");
		schoolA.getClassroomList().add(classroomB);
		
		classroomA.setStudentList(new ArrayList<Student>());
		classroomB.setStudentList(new ArrayList<Student>());

		
		Student Student1=new Student(201,"Neşet Ertaş",6.8);
		Student1.setClassroom(classroomA);
		classroomA.getStudentList().add(Student1);

		Student Student2=new Student(202,"Mahsuni Şerif",7.8);
		Student2.setClassroom(classroomA);
		classroomA.getStudentList().add(Student2);
		
		Student Student3=new Student(203,"Erkan Ocaklı",2.3);
		Student3.setClassroom(classroomB);
		classroomB.getStudentList().add(Student3);
		
		Student Student4=new Student(204,"Celal Güzelses",7.8);
		Student4.setClassroom(classroomA);
		classroomA.getStudentList().add(Student4);
		
		Student Student5=new Student(205,"Aşık Veysel",7.1);
		Student5.setClassroom(classroomB);
		classroomB.getStudentList().add(Student5);
		
		
		System.out.println(schoolA.getSchoolID()+" "+schoolA.getSchoolName());
		
		for(Classroom Classroom : schoolA.getClassroomList())
		{
			System.out.println("\t"+Classroom.getClassroomID()+" "+
					Classroom.getClasroomName());
			for(Student Student : Classroom.getStudentList()) {
				System.out.println("\t\t"+Student.getStudentID()+" "+
						Student.getStudentName()+" "+Student.getAvarageMark());
			}	
		
		}
	}

}
