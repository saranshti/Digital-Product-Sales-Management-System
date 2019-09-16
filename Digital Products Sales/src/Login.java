import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Login 
{
    public boolean login()
    {
        Scanner sc = new Scanner(System.in);
        String user,pass,username,password;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~LOGIN~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Username:");
        user = sc.next();
        System.out.println("Password:");
        pass = sc.next();
        File f = new File("F:\\java\\Users\\"+user+".txt");
        if(f.exists())
        {
            try 
            { 
                RandomAccessFile raf = new RandomAccessFile(f,"r");
                String line =raf.readLine();
                username=line.substring(9);
                password=raf.readLine().substring(9);
                if(user.equals(username) && pass.equals(password))
                {
                    System.out.println("Successfully Login.");
                }
                else
                {
                    System.out.println("Username and Password Not Matched.");  
                }
                
            } catch (FileNotFoundException ex) 
            {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true; 
        }
        else
        {
            System.out.println("Warning : User not found.\nCreate New User.");
            return false;
        }    
    }
}