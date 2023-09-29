package Midterm;
import java.util.Scanner;
public class ProblemThree {
    public static void main (String[]args){
       System.out.println("Input a month number: ");
       Scanner sc = new Scanner (System.in);
       int month = sc.nextInt();
       System.out.println("Input a year: ");
       int year = sc.nextInt();
       sc.close();
       boolean isLeapYear = false;
       String monthName = "";
       int monthDays = 0;
       if ((year % 4) == 0){
        isLeapYear = true;
       }
    switch (month){
        case 1: monthName = "January";
        monthDays = 31;
        break;
        case 2: monthName = "February";
        if (isLeapYear == true){
            monthDays = 29;
        } else {
            monthDays = 28;
        }
        break;
        case 3: monthName = "March";
        monthDays = 31;
        break;
        case 4: monthName = "April";
        monthDays = 30;
        break;
        case 5: monthName = "May";
        monthDays = 31;
        break;
        case 6: monthName = "June";
        monthDays = 30;
        break;
        case 7: monthName = "July";
        monthDays = 31;
        break;
        case 8: monthName = "August";
        monthDays = 31;
        break;
        case 9: monthName = "September";
        monthDays = 30;
        break;
        case 10: monthName = "October";
        monthDays = 31;
        break;
        case 11: monthName = "November";
        monthDays = 30;
        break;
        case 12: monthName = "December";
        monthDays = 31;
        break;
        default: System.out.println("Invalid input.");
    }
System.out.println(monthName + " " + year + " has " + monthDays + " days");
}
}