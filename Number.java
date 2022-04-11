import java.util.Scanner;

class Demo{
    static String binary(int n) {
        String bi = "";
        for(; n!=0; n/=2) {
            int t = n%2;
            bi = t + bi;
        }
        return bi;
    }
    static String octal(int n) {
        String oct = "";
        for(; n!=0; n/=8) {
            int t = n%8;
            oct = t + oct;
        }
        return oct;
    }
    static String hexa(int n) {
        String hexa = "";
        for(; n!=0; n/=16){
            int t = n%16;
            if(t <= 9) {
                hexa = t + hexa;
            } else {
                hexa = Character.toString((char)65 + t - 10) + hexa;
            }
        }
        return hexa;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        sc.close();
        String bi, oct, hex;
        bi = binary(num);
        oct = octal(num);
        hex = hexa(num);
        System.out.println("Binary of "+num+": "+bi);
        System.out.println("Octal of "+num+": "+oct);
        System.out.println("Hexadecimal of "+num+": "+hex);
    }
}