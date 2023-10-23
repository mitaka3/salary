/**
 *
 * @author user
 */
import java.util.Scanner;
public class Salary {
   
 public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    double regPay;
    double PayPerHr;
    int hoursAWeek;
    double pay;
    double OverTimeHours;
    double OverTimePay;
    
    
    System.out.print("Enter your pay per hour:");
    PayPerHr = reader.nextDouble();
    System.out.print("Enter your regular hours a week:");
    hoursAWeek = reader.nextInt();
    System.out.print("Enter your overtime Hours;");
    OverTimeHours = reader.nextDouble();
    regPay = PayPerHr * hoursAWeek;
    OverTimePay = OverTimeHours * 1.5 * PayPerHr;
    pay = OverTimePay + regPay;
    System.out.println("Your pay this week will be:php" + pay);
    }
}