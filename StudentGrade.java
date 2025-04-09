import java.util.Scanner;
import java.util.Arrays;
public class StudentGrade{
 
	public static void main(String...args){
	StudentGradeFunctions input = new StudentGradeFunctions();

	Scanner scanner = new Scanner(System.in);

	System.out.println("How many students do you have?:");
	int studentNumber = scanner.nextInt();

	while(studentNumber <= 0){
	System.out.println("Enter a valid number of students");
	studentNumber = scanner.nextInt();
	}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
	System.out.println("How many subjects are they offering?");
	int subjects = scanner.nextInt();
	
	while(subjects <= 0){
	System.out.println("Enter a valid number of subjects");
	subjects = scanner.nextInt();
	}

	input.savingStatus();
	input.savingStatus2();
	
	int score = 0;
	int [][] student = new int [studentNumber][subjects];

	for(int i = 0; i < studentNumber; i++){
		for(int count = 0; count < subjects; count++){
			System.out.println("Enter the score for student"+ (i + 1) + ":");
			System.out.println("Enter the score for subject"+ (count + 1) + ":");

			int counter = 0;
			scores = scanner.nextInt();
			scores[i][count] = (score);
			counter += 1;

		}
	}

	
		
			
	








}


















 





}