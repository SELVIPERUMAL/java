 package  com.sms;

import java.util.List;

/**
 * school contains multiple teachers
 * school contains multiple students
 * @author RUSHIKESH
 *
 */
	public class School	 {



/**
     *
     * @param salary
     */
    /**
     *
     * @param fees_paid
     */
    		private final List<Teachers> teacher;
		private final List<Student> students;
		private static int totalmoneyeearned;
		private  static int totalmoneyspent; 
       	
	
	public School(List<Teachers> teacher,List<Student> students) {
		this.teacher=teacher;
		this.students=students;
		School.totalmoneyeearned=0;
		School.totalmoneyspent=0;	
	}
	
	//  generated by using getter ad seetter methodds
	// alt+shift+s

	// returns the list of teachers in the school

	public List<Teachers> getTeacher() {
		return teacher;
	}

	// adds a teacher to the school 
	public void addTeacher(Teachers teachers) {
		teacher.add(teachers);
	}

// returns the list of students
	public List<Student> getStudents() {
		return students;
	}

// returns the students
	public void addStudents(Student student) {
		students.add(student);
	}


	public int getTotalmoneyeearned() {
		return totalmoneyeearned;
	}


	public static void UpdateTotalmoneyeearned(int Moneyearned) {
		totalmoneyeearned += Moneyearned;
	}


	public int getTotalmoneyspent() {
		return totalmoneyspent;
	}


	public static void updateTotalmoneyspent(int moneyspent) {
		totalmoneyeearned-=moneyspent;
	}
	
	
	
	
	}
