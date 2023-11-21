import java.util.Scanner;
class ConvertHour{
public static void main(String args[]){
Scanner Con = new Scanner(System.in);
System.out.println("Enter a hour");
int hour = Con.nextInt();
int min = hour * 60;
int sec = hour * 3600;
System.out.println("The given hour is " +hour);
System.out.println("The minutes is" +min);
System.out.println("The second is" +sec);
}
}
