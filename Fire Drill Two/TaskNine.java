import java.util.Scanner;
public class TaskNine{
public static void main(String...args){

Scanner scanner = new Scanner(System.in);
int total = 0;

for(int count = 1; count <= 10; count++){
System.out.print("Enter Score" + count +":");
int scores = scanner.nextInt();
if(scores > 0){
total+= scores;
}
}
System.out.print("The sum of valid scores: " +total);
}
}