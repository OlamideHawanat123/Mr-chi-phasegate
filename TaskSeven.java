public class TaskSeven{
public static void main(String...args){
for(int count = 1; count <= 10; count++){
if(count % 4 == 0){
int multiple = 1;
int total = 0;

for(int counter = 1; counter <= 5; counter++){
multiple = count * multiple;
total+=multiple;
}
System.out.print(total + " ");


}



}
}





}


