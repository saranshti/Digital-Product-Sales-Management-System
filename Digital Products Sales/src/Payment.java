import java.util.Scanner;
import java.util.Random;
public class Payment 
{
    public void pay() 
    {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        Bill ob = new Bill();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~Payment Portal~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("You have to pay "+ob.pt+"Rs.");
        System.out.println("1.Cash On Delivery");
        System.out.println("2.Net Banking.");
        System.out.print("Choose Payment Method:");
        int ch=sc.nextInt();
        if(ch==1)
        {
            System.out.println("Ready With "+ob.pt+"Rs.");
            System.out.println("your product Will Be Delivered in 7 Days provided By your Detail.");
            System.out.println("Thank You");
        }
        if(ch==2)
        {
            System.out.println("1.mobile Wallet");
            System.out.println("2.Credit/Debit Card");
            System.out.print("Enter Your Choice:");
            int c=sc.nextInt();
            if(c == 1)
            {
                System.out.print("Enter Your Phone no:");
                short mo = sc.nextShort();
                int ran1 = ran.nextInt(10000);
                System.out.println("OTP="+ran1);
                System.out.print("Enter OTP:");
                int otp = sc.nextInt();
                if(ran1 == otp)
                {
                    System.out.print("Payment Successful.");
                    System.out.println(ob.pt+"Rs. Debited from your Mobile Wallet.");
                    System.out.println("your product Will Be Delivered in 7 Days provided By your Detail.");
                    System.out.println("Thank You");
                }
                else
                {
                    System.out.print("Payment Failed");
                }
            }
            if(c == 2)
            {
                System.out.print("Enter Your Credit/Debit card No.:");
                long cno =sc.nextLong();
                System.out.print("Enter Your Name As On Card:");
                String st =sc.next();
                System.out.print("Expiry Date:");
                String dt =sc.next();
                System.out.print("Enter cvv:");
                int cvv =sc.nextInt();
                int ran1 = ran.nextInt(10000);
                System.out.println("OTP="+ran1);
                System.out.print("Enter OTP:");
                int otp = sc.nextInt();
                if(ran1 == otp)
                {
                    System.out.print("Payment Successful.");
                    System.out.println(ob.pt+"Rs. Debited from your Account.");
                    System.out.println("your product Will Be Delivered in 7 Days provided By your Detail.");
                    System.out.println("Thank You");
                }
                else
                {
                    System.out.print("Payment Failed");
                }
                
            }   
        }  
    } 
}
