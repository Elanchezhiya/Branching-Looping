import java.util.Scanner;

public class PurchaseAndDiscount {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your Purchase Amount: ");
        float amount=obj.nextInt();
        if(amount<500)
        {
            System.out.println("No Discount is applied");
        }
        else if(amount>=500&&amount<=1000)
        {
            System.out.println("10% Discount is applied");
            amount= (float) (amount*0.10);
        }
        else if(amount>1000)
        {
            System.out.println("20% Discount is applied");
            amount= (float) (amount*0.20);
        }
        System.out.println("The Final Discount of your Purchased Amount is "+amount);
    }
}
