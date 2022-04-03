//Check if a given number is a prime number
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();
        int flag = 0;
        for(int i=2; i*i<= num; i++) {
            if(num % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.print(num + " is Prime Number");
        } else {
            System.out.print(num + " is not a Prime Number");
        }
    }
}
