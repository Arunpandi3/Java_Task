import java.util.Scanner;
class Calculator{
public static void main(String args[]){
Scanner calc = new Scanner(System.in);
System.out.println("Enter first value");
int First = calc.nextInt();
System.out.println("Enter second value");
int Second = calc.nextInt();
int choice = calc.nextInt();
Switch(choice)
{
	case 1:
	int total = First + Second;
	break;

	case 2:
	total = First - Second;
	break;

	case 3:
	total = First * Second;
	break;

	case 4:
	total = First / Second;
	break;
	
	default:
	total = First % Second;
	break;
}
}
}