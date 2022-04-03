//Check if a given number is an armstrong number
import java.util.Scanner;
import java.lang.Math;

class Armstrong{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        String str = in.nextLine();
        int num = Integer.parseInt(str), n = num;
        in.close();
        int digits = str.length();
        double s = 0;
        while(n > 0) {
            int r = n % 10;
            s = s + Math.pow(r, digits);
            n /= 10;
        }
        if(s == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}