

import java.util.Scanner;
class Convert
{
    public int[] Binary(int n)
    {
        int count=0,i=0,a,k;
        int d[]=new int[8];
        String x = "";
        d[i]=0;
        while(n > 0)
        {
            i++;
            a = n % 2;
            x = x + "" + a;
            n = n / 2;
            d[i]=a;
        }
        System.out.println("Binary number:"+x);
        return(d);
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
        int dat[]= new int[8];
        System.out.println("Enter the Character to be Encrypted");
        data=sc.nextLine();
        n=data.length();
        for(i=0;i<n;i++)
        {
            ch=data.charAt(i);
            j=(int)ch;
            System.out.println(j);
            dat=c.Binary(j);
            System.out.println(dat[1]);
        }
    }
}
