package homeworks;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course();
		Course course2 = new Course();
		
		course1.courseName = "Java Programlama";
		course1.courseTeacher = "Engin Demirog";
		course1.studentName = "�lk� Nur Duran";
		
		
		course2.courseName = "C# Programlama";
		course2.courseTeacher = "Engin Demirog";
		course2.studentName = "�lk� Nur Duran";
		
		Course[] courses = {course1,course2};

		for (Course course : courses) {
			System.out.println(course.courseName+"Kursuna ho�geldiniz. Say�n "+course.studentName);
		}
}}
