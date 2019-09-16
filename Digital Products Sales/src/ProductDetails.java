import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ProductDetails 
{
    public void prod()
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Welecome~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Products~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Scanner sc = new Scanner(System.in);
        try {
            FileReader fr = new FileReader("F:\\java\\Products\\products.txt");
            BufferedReader bf = new BufferedReader(fr);
            String st =bf.readLine();
            System.out.println("Product Id    Name                                       Prize");
            while((st=bf.readLine())!=null)
            {
                StringTokenizer stn = new StringTokenizer(st);
                int id = Integer.parseInt(stn.nextToken());
                String name=stn.nextToken();
                int prize = Integer.parseInt(stn.nextToken());
                System.out.println(""+id+"             "+name+"                                       "+prize);
            }    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProductDetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProductDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}