import java.util.Scanner;
class AverageNumber{
public static void main(String args[]){
Scanner Avg = new Scanner(System.in);
System.out.println("Enter first number");
int First = Avg.nextInt();
System.out.println("Enter second number");
int Second = Avg.nextInt();
System.out.println("Enter third number");
int Third = Avg.nextInt();
System.out.println("Enter fourth number");
int Fourth = Avg.nextInt();
System.out.println("Enter fifth number");
int Fifth = Avg.nextInt();
int AvgNumbers = First + Second + Third + Fourth + Fifth;
int sum = AvgNumbers / 5;
System.out.println("The average is : " + sum);

}
}