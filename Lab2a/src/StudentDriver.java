/**
 * 
 */

/**
 * @author edwardlambke a00892244
 * 
 *
 *
 */
public class StudentDriver {

	/**
	 * Driver class
	 */
	
	
	public static void main(String[] args) {
		StudentDatabase db = new StudentDatabase();
		
		test("Create new students");
		db.addStudent("coleen");
		db.addStudent("BILL");
		
		test("Add a new mark");
		db.changeQuizMark("COLEEN", 0, 20);
		db.changeQuizMark("bill", 8, 10);
		
		test("Show quiz marks");
		db.showQuizMarks();
		
		test("Change quiz marks");
		db.changeQuizMark("bill", 6, 100);
		db.showQuizMarks();
		
		test("Change quiz marks with invalid arguments");
		db.changeQuizMark("bill", 1, 110);
		db.changeQuizMark("bill", 11, 100);
		db.changeQuizMark("Fred", 1, 100);
		db.showQuizMarks();
		
		test("Get quizzes for a student");
		getQuizzes(db, "bill");
		
		test("Get quizzes for an invalid student");
		getQuizzes(db, "Fred");
	}
	
	private static void getQuizzes(StudentDatabase db, String name){
		System.out.format("\n\n%s's marks:",name);
		for (int mark : db.getQuizzes(name)) {
			System.out.format("%d ", mark);
		}
	}
	
	private static void test(String testName){
		System.out.format("\n\n%s", testName);
	}

}