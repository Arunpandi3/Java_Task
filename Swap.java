import java.util.Scanner;
class Swap{
public static void main(String args[]){
Scanner Sw = new Scanner(System.in);
System.out.println("Enter the first value");
int First = Sw.nextInt();
System.out.println("Enter the second value");
int Second = Sw.nextInt();
int temp = First;
First = Second;
Second = temp;
System.out.println("The first value is : " + First);
System.out.println("The second value is : " + Second);
}
}