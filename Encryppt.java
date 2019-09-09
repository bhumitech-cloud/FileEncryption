

import java.util.Scanner;
class Convert
{
    public void Binary(int n) 
    {
        int count = 0, a;
        String x = "";
        
        while(n > 0)
        {
            a = n % 2;
            x = x + "" + a;
            n = n / 2;
        }
        System.out.println("Binary number:"+x);
        //return(x);
    }
}
class Encryppt 
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        Convert c= new Convert();
        String data;
	int n,i,j;
        char ch;
        System.out.println("Enter the Character to be Encrypted");
        data=sc.nextLine();
        n=data.length();
        for(i=0;i<n;i++)
        {
            ch=data.charAt(i);
            j=(int)ch;
            System.out.println(j);
            c.Binary(j);
        } 
    }
}
    
