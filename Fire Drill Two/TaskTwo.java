import java.util.Scanner;
public class TaskTwo{
public static void main(String...args){

Scanner scanner = new Scanner(System.in);
int total = 0;
double average = 0.0;
int  number = 10;

for(int count = 1; count <= number; count++){
System.out.print("Enter Score" + count +":");
int scores = scanner.nextInt();
total+= scores;
}
average = (double)total/ number;
System.out.print(average);
}
}