import java.util.Scanner;
public class TaskTen{
public static void main(String...args){

Scanner scanner = new Scanner(System.in);
int total = 0;
double average = 0.0;

for(int count = 1; count <= 10; count++){
System.out.print("Enter Score" + count +":");
int scores = scanner.nextInt();
if(scores > 0){
total+= scores;
average = total/ count;

}

}
System.out.println("The sum of valid scores: " +total);
System.out.print("The average of valid scores: " +average);

}
}