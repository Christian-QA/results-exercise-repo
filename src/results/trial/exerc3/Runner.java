package results.trial.exerc3;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner result_input = new Scanner(System.in);  
		Results total = new Results();
	
		
		System.out.println("What marks did you score for Physics out of 150?: ");
		int physics_marks = result_input.nextInt();
		
		System.out.println("What marks did you score for Chemistry out of 150?: ");
		int chemistry_marks = result_input.nextInt();
		
		System.out.println("What marks did you score for Biology out of 150?: ");
		int biology_marks = result_input.nextInt();
	//	Results executor = new Results();
		System.out.println(total.Sum(physics_marks,chemistry_marks,biology_marks));
		
		System.out.println(total.Perc(total.Sum(physics_marks,chemistry_marks,biology_marks))+ "%");
		
		if (total.Sum(physics_marks,chemistry_marks,biology_marks) < 60.0) {
			System.out.println("You fail haha lol");
		} else {
			System.out.println("Nice one");
		}
		
		result_input.close();
		
	}
	
	
}