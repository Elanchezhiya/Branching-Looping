import java.util.Scanner;

public class FindPostiveNegative {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the number to check whether it is Positive or Negative : ");
        long number= obj.nextLong();
        //to check the given number is positive or negative
        if(number>=0)
        {
            System.out.println(" The Given Number is in Postive");
        }
        else if(number<0)
        {
            System.out.println(" The Given Number is in Negative");
        }
    }
}
