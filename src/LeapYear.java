import java.util.Scanner;

public class LeapYear {
    public static void findLeapYear(){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the year");
        int year= a.nextInt();
        boolean leap = false;
        boolean error = false;
        if (year < 1582){
            error = true;
        }
        if(year % 400 == 0) {
            leap = true;
        }else if (year % 100 == 0){
            leap = false;
        }else if (year % 4 == 0){
            leap = true;
        }else{
            leap = false;
        }
        if (error) {
            System.out.println("Error, this year the Gregorian calendar wasn't created :)");
        }else {
            if (leap) {
                System.out.println("Year " + year + " is a leap year");
            } else {
                System.out.println("Year " + year + " is not a leap year");
            }
        }
    }
}
