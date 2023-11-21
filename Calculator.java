import java.util.Scanner;
class Calculator{
public static void main(String args[]){
Scanner calc = new Scanner(System.in);
System.out.println("Enter first value");
int First = calc.nextInt();
System.out.println("Enter second value");
int Second = calc.nextInt();
int choice = calc.nextInt();
switch(choice)
{
	case 1:
	System.out.println("The addidion value is" + (First + Second));
	break;

	}
System.out.println("The given values are :" +total);
}
}