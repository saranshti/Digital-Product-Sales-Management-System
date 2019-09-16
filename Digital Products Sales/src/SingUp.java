import java.io.*;
import java.util.Scanner;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SingUp 
{
    public boolean singup()
    {
        String user,pass,name,surname,add,cpass;
        long mo; 
        int code;
        Scanner sc = new Scanner(System.in); 
        Random ran = new Random();
        File f = new File("F:\\java\\Users");
        if(!f.exists())
        {
            f.mkdirs();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~SINGUP~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Enter Your name:");
        name = sc.next();
        System.out.print("Enter Your Surname:");
        surname = sc.next();
        System.out.print("Enter Your 10 digit Mobile No.:");
        mo = sc.nextLong();
        System.out.print("Enter Your Address:");
        add = sc.next();
        System.out.print("Enter New Username:");
        user = sc.next();
        System.out.print("Enter Password:");
        pass = sc.next();
        System.out.print("Confirm your Password:");
        cpass = sc.next();
        int ran1 = ran.nextInt(10000);
        System.out.println("Your Human Verification code ="+ran1);
        System.out.print("Enter Human Verification code =");
        code = sc.nextInt();
        File fr = new File(f+"\\"+user+".txt");
        if(!fr.exists() && code == ran1)
        {
            try 
            {
                RandomAccessFile raf = new RandomAccessFile(f+"\\"+user+".txt","rw");
                raf.writeBytes("Username:"+user+ "\r\n");
                raf.writeBytes("Password:"+pass+ "\r\n");
                raf.writeBytes("Name:"+name+" "+surname);
                raf.writeBytes("Mobile No.:"+mo);
                raf.writeBytes("Adresss:"+add);  
            }
            catch (FileNotFoundException ex) 
            {
                Logger.getLogger(SingUp.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (IOException ex) 
            {
                Logger.getLogger(SingUp.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Account Created.");
            return true;
        }
        else
        {
            System.out.println("Warning : Username Already exsist. OR You are Robot.");
            System.out.println("Please Retry.");
            return false;
        }
    } 
    
}