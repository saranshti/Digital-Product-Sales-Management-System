import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
        Main mobj = new Main(); 
        Scanner sc = new Scanner(System.in);
        Login lobj = new Login();
        SingUp sobj = new SingUp();
        Payment payobj = new Payment();
        ProductDetails pobj = new ProductDetails(); 
        Bill bobj = new Bill(); 
        int ch;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~Digital Product Sales Portal~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1.Login.");
        System.out.println("2.SingUp.");
        System.out.println("3.Exit.(for Exit press any key and Then Enter.)");
        System.out.print("Enter Your Choice:");
        ch=sc.nextInt();
        if(ch == 1)
        {
            do
            {
                if(lobj.login() == true){
                pobj.prod();
                bobj.bill();
                payobj.pay();}
            }while(lobj.login() != true);
        }
        else if(ch == 2)
        {
            do
            {
                if(sobj.singup() == true){
                pobj.prod();
                bobj.bill();
                payobj.pay();}
            }while(sobj.singup() != true);
        }
        else
        {
            System.out.println("Exited.");
        }
    }   
}
