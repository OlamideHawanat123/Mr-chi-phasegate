import java.util.Scanner;
public class TaskOne{
public static void main(String...args){

Scanner scanner = new Scanner(System.in);
int total = 0;

for(int count = 1; count <= 10; count++){
System.out.print("Enter Score" + count +":");
int scores = scanner.nextInt();
total+= scores;

}
System.out.print(total);
}
}