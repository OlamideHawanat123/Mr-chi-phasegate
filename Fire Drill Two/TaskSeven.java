import java.util.Scanner;
public class TaskSeven{
public static void main(String...args){

Scanner scanner = new Scanner(System.in);
int total = 0;
double average = 0.0;

for(int count = 1; count <= 10; count++){
System.out.print("Enter Score" + count +":");
int scores = scanner.nextInt();
if(scores % 2 == 0){
total += scores;
average = total / scores;
}
}
System.out.println("The total of scores: " + total);
System.out.print("The average of score: " + average);
}
}