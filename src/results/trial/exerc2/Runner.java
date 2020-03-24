package results.trial.exerc2;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner result_input = new Scanner(System.in);  /// Starts user input scanner
		Results total = new Results();	/// Pulls methods from Results Class
	
		
		System.out.println("What marks did you score for Physics out of 150?: ");    /// Marks for physics out of 150
		int physics_marks = result_input.nextInt();
		
		System.out.println("What marks did you score for Chemistry out of 150?: ");    /// Marks for chemistry out of 150
		int chemistry_marks = result_input.nextInt();
		
		System.out.println("What marks did you score for Biology out of 150?: ");     /// Marks for biology out of 150
		int biology_marks = result_input.nextInt();
	//	Results executor = new Results();
		System.out.println(total.Sum(physics_marks,chemistry_marks,biology_marks));    /// Total marks between the 3 subjects
		
		System.out.println(total.Perc(total.Sum(physics_marks,chemistry_marks,biology_marks))+ "%");   /// Percentage of total marks relative to maximum (450)
		
		if (total.Sum(physics_marks,chemistry_marks,biology_marks) > 60.0   /// Success criteria is above 60% across the board and for each subject exam
		&& (physics_marks*100)/150 > 60 
		&& (chemistry_marks*100)/150 > 60 
		&& (biology_marks*100)/150 > 60)  {
			
			System.out.println("Nice one"); 
		} else {      /// Counts the failures if success criteria is not met
			int failures = 0;
			if ((physics_marks*100)/150 < 60) {
				failures += 1;
			} if ((chemistry_marks*100)/150 < 60) {
				failures += 1;
			} if ((biology_marks*100)/150 < 60) {
				failures += 1;
			}
			
			switch(failures) {     /// Determines message based on failures
				case 1:
					System.out.println("Failed 1... good job");
					break;
				case 2:
					System.out.println("Failed 2... revise more");
					break;
				case 3:
					System.out.println("Failed 3... sorry...");
					break;
				default:
					System.out.println("Failed 1... good job");	
			
			}
		
		}
		
		result_input.close();
		
	}
	
	
}