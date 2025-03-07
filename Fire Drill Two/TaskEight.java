import java.util.Scanner;
public class TaskEight{
public static void main(String...args){
Scanner scanner = new Scanner(System.in);

int total = 0;
for(int count = 1; count <= 10; count++){
System.out.print("Enter score between 0 - 100: ");
int scores = scanner.nextInt();
if(scores < 0 || scores > 100){
System.out.print("Enter a valid score between 0 - 100: ");
scores = scanner.nextInt();
}
total += scores;
}
System.out.print(total);

}
}

