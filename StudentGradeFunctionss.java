import java.util.Scanner;
public class StudentGradeFunctionss{
public static void main(String...args){

Scanner scanner = new Scanner(System.in);
StudentGrades input = new StudentGrades();

System.out.println("How many students do you have?");
int numberOfStudents = scanner.nextInt();

System.out.println("How many subjects are they offering?");
int numberOfSubjects = scanner.nextInt();

while(numberOfStudents < 1 || numberOfSubjects < 1){
input.wrongInfo();
System.out.println("Enter a valid number of students?");
numberOfStudents = scanner.nextInt();

System.out.println("Enter a valid number of subjects?");
numberOfSubjects = scanner.nextInt();
numberOfStudents++;
numberOfSubjects++;
}

input.savingStatus();

for(int count = 1; count <= numberOfStudents; count++){
for(int counter = 1; counter <= numberOfSubjects; counter++){

System.out.println("Entering score for student" + count);
System.out.println("Entering score for subject" + counter);
int scoreForStudent = scanner.nextInt();

while(scoreForStudent < 0){
input.wrongInfo();

System.out.println("Entering score for student" + count);
System.out.println("Enter a valid score for subject" + counter);
scoreForStudent = scanner.nextInt();
input.savingStatus();
scoreForStudent++;
}

input.savingStatus();


}

}

int[] students = {numberOfStudents};
int[] subjects = {numberOfSubjects};

for(int count = 1; count <= numberOfStudents; count++);

System.out.println("============================================================");
System.out.printf("%-2d %-2d %n",numberOfStudent, numberOfSubjects);




















}


}