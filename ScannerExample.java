import java.util.Scanner;
class ScannerExample{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter your email : ");
String email = scan.nextLine();
System.out.println("Enter your phone number : ");
long phoneNumber = scan.nextLong();
System.out.println("--------------------------------------");
System.out.println("your email is : " +email);
System.out.println("Your phoneNumber is : " +phoneNumber); 
}
}