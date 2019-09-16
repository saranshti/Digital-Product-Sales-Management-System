import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bill
{
    static float pt;
    public void alternateMerge(int arr1[], int arr2[],int n1, int n2, int arr3[]) 
    { 
        int i = 0, j = 0, k = 0; 
        while (i < n1 && j < n2) 
        { 
            arr3[k++] = arr1[i++]; 
            arr3[k++] = arr2[j++]; 
        } 
        while (i < n1)
        {
            arr3[k++] = arr1[i++];
        }
        while (j < n2) 
        {
            arr3[k++] = arr2[j++];
        }
    } 
    public static void bill()
    {
        FileReader fr = null;
        Scanner sc = new Scanner(System.in);
        int ch[] = new int[100];
        try {
            fr = new FileReader("F:\\java\\Products\\products.txt");
            BufferedReader bf = new BufferedReader(fr);
            String st =bf.readLine();
            System.out.print("How Many Products do you Want to Buy:");
            int n=sc.nextInt();
            System.out.println("Enter "+n+" Product id of your Choice = ");
            for(int i=0;i<n;i++)
            {
                ch[i] = sc.nextInt();
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~Choosed Products~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Product Id    Name                                    Prize");
            while((st=bf.readLine())!=null)
            {
                StringTokenizer stn = new StringTokenizer(st);
                int id = Integer.parseInt(stn.nextToken());
                String name=stn.nextToken();
                int prize = Integer.parseInt(stn.nextToken());
                for(int i=0;i<n;i++)
                {
                    if(ch[i] == id)
                    {
                        System.out.println(""+id+"             "+name+"                                       "+prize);
                    }
                }
            }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
        }
        int n1 = ch.length;
        int a = 1;
        int ach[] = new int[100];
            while(a!=0)
            {
                System.out.println("0.I don't Want to add or remove Products.");
                System.out.println("1.Add More Products.");
                System.out.println("2.Remove Products.");
                System.out.println("Enter Your Choice:");
                a=sc.nextInt();
                if(a==1)
                {
                    System.out.println("How Many Product do You want to add:");
                    int m=sc.nextInt();
                    System.out.println("Enter "+m+" Product id of your Choice = ");
                    for(int i=0;i<m;i++)
                    {
                        ach[i] = sc.nextInt();
                    }
                    int n2 = ach.length;
                    int tch[]; 
                    tch = new int[n1+n2];
                    Bill bi = new Bill(); 
                    bi.alternateMerge(ch,ach,n1,n2,tch);
                    try {
                        fr = new FileReader("F:\\java\\Products\\products.txt");
                        BufferedReader bf = new BufferedReader(fr);
                        String st =bf.readLine();
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~Choosed Products~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Product Id    Name                                    Prize");
                        while((st=bf.readLine())!=null)
                        {
                            StringTokenizer stn = new StringTokenizer(st);
                            int id = Integer.parseInt(stn.nextToken());
                            String name=stn.nextToken();
                            int prize = Integer.parseInt(stn.nextToken());
                            for(int i=0;i<100;i++)
                            {
                                if(tch[i] == id)
                                {
                                    System.out.println(""+id+"             "+name+"                                       "+prize);
                                }
                            }
                        }
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(ProductDetails.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(ProductDetails.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(a==2)
                {
                    System.out.print("Enter How Many product to be removed:");
                    int re = sc.nextInt();
                    for(int k=1;k<=re;k++){
                    System.out.print("Enter the id of "+k+" product to be removed:");
                    int elem = sc.nextInt();
                    for(int i=0;i<ch.length;i++)
                    {
                        if(ch[i] == elem)
                        {
                            for(int j=i;j<ch.length-1;j++)
                            {
                                ch[j] = ch[j+1];
                            }
                            break;
                        }    
                    }
                    }
                    try {
                        fr = new FileReader("F:\\java\\Products\\products.txt");
                        BufferedReader bf = new BufferedReader(fr);
                        String st =bf.readLine();
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~Choosed Products~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Product Id    Name                                    Prize");
                        while((st=bf.readLine())!=null)
                        {
                            StringTokenizer stn = new StringTokenizer(st);
                            int id = Integer.parseInt(stn.nextToken());
                            String name=stn.nextToken();
                            int prize = Integer.parseInt(stn.nextToken());
                            for(int i=0;i<100;i++)
                            {
                                if(ch[i] == id)
                                {
                                    System.out.println(""+id+"             "+name+"                                       "+prize);
                                }
                            }
                        }
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(ProductDetails.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(ProductDetails.class.getName()).log(Level.SEVERE, null, ex);
                    }    
                }
                if(a==0)
                {
                    float prodtotal=0,total=0,gst=0,devc = 100;
                    int n2 = ach.length;
                    int tch[]; 
                    tch = new int[n1+n2];
                    Bill bi = new Bill(); 
                    bi.alternateMerge(ch, ach, n1, n2, tch);
                    try {
                        fr = new FileReader("F:\\java\\Products\\products.txt");
                        BufferedReader bf = new BufferedReader(fr);
                        String st =bf.readLine();
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Bill~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Product Id    Name                                    Prize");
                        while((st=bf.readLine())!=null)
                        {
                            StringTokenizer stn = new StringTokenizer(st);
                            int id = Integer.parseInt(stn.nextToken());
                            String name=stn.nextToken();
                            int prize = Integer.parseInt(stn.nextToken());
                            for(int i=0;i<100;i++)
                            {
                                if(tch[i] == id)
                                {
                                    System.out.println(""+id+"             "+name+"                                       "+prize);
                                    total=total+prize;
                                }  
                            }
                        }
                        gst=(total*18)/100;
                        prodtotal=total+gst+devc;
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("GST                                                             "+gst);
                        System.out.println("Delivery Charge                                                "+devc);
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Total                                                           "+prodtotal);
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        pt = prodtotal;
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(ProductDetails.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(ProductDetails.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
    }
    
}