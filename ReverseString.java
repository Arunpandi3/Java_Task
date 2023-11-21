import java.util.Scanner;
class ReverseString{
public static void main(String args[]){
Scanner str = new Scanner(System.in);
System.out.println("Enter the the string");
char First = str.next();

for(int i = 0;i<=First.length;i--){
System.out.print(First);
}

}
}