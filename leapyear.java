//Check if a given year is a leap year
import java.util.Scanner;

class LeapYear {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int year = in.nextInt(); 
        in.close();
        int flag = 0;
        if(year % 100 == 0) {
            if (year % 400 == 0) {
                flag = 1;
            }
        } else {
            if (year % 4 == 0) {
                flag = 1;
            }
        }
        if(flag == 1) {
            System.out.println(year + " is leap year.");
        } else {
            System.out.println(year + " is not leap year.");
        }
    }    
}
