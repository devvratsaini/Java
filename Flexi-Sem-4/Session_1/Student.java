package Session_1;

public class Student {

	String studentName, courseName, teacherName;
	int studentAge, studentID, courseID, teacherAge, teacherID; 
	
	public static void main(String[] args) {
		
		// Creating a new instance of the class 'Student'
		Student s1 = new Student();
		
		// Assigning values to the data members
		s1.studentName = "Devvrat Saini";
		s1.studentAge = 19;
		s1.studentID = 173;
		s1.courseName = "Flexi";
		s1.courseID = 1010;
		s1.teacherName = "ABC";
		s1.teacherAge = 30;
		s1.teacherID = 100;
		
		// Printing the values of the data members
		System.out.println("Student Name: " + s1.studentName);
		System.out.println("Student Age: " + s1.studentAge);
		System.out.println("Student ID: " + s1.studentID);
		System.out.println("Course Name: " + s1.courseName);
		System.out.println("Course ID: " + s1.courseID);
		System.out.println("Teacher Name: " + s1.teacherName);
		System.out.println("Teacher Age: " + s1.teacherAge);
		System.out.println("Teacher ID: " + s1.teacherID);
	}
}
