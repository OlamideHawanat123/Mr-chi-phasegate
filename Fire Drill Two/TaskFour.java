import java.util.Scanner;
public class TaskFour{
public static void main(String...args){

Scanner scanner = new Scanner(System.in);
int total = 0;
double average = 0.0;


for(int count = 1; count <= 10; count++){
System.out.print("Enter Score" + count +":");
int scores = scanner.nextInt();
if(count % 2 == 0){
total += scores;
}
}
System.out.print("The total of scores is: " + total);
}
}