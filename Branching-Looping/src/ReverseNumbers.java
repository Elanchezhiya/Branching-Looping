import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter your number ");
        int number= obj.nextInt();
        int reverse=0;
        for (;number!=0;number/=10)
        {
            int digit=number%10;
            reverse=reverse*10+digit;

        }
        System.out.println("Reverse Number is "+reverse);
    }
}
