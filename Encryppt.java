

import java.util.Scanner;
class Convert
{
    public int[] Binary(char n)
    {
        int count=0,i=0,a,k,ni;
        int d[]=new int[8];
        d[i]=0;
        ni=(int)n;
        while(ni > 0)
        {
            i++;
            a = ni % 2;
            ni = ni / 2;
            d[i]=a;
        }
        return(d);
    }
    public char Charac(int[] c)
    {
        int num;
        char d;
        num=(c[0]*128)+(c[1]*64)+(c[2]*32)+(c[3]*16)+(c[4]*8)+(c[5]*4)+(c[6]*2)+(c[7]*1);
        d=(char)num;
        //System.out.println(num);
        return(d);
    }
}
class Exor
{
    public int[] XOR(int[] da,int[] ke)
    {
        int i=0;
        int ciph[]= new int[8];
        for(i=0;i<8;i++)
        {
            ciph[i]=da[i]^ke[i];
        }
        return(ciph);
    }
}
class Encryppt
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        Convert c= new Convert();
        Exor x= new Exor();
        String data;
        String cyphertext="";
        int n,i,j;
        char ch,cc;
        int key[]= new int[8];
        int dat[]= new int[8];
        int cipher[]= new int[8];
        System.out.println("Enter the key");
        data=sc.nextLine();
        cc=data.charAt(0);
        key=c.Binary(cc);
        System.out.println("Enter the Character to be Encrypted");
        data=sc.nextLine();
        n=data.length();
        for(i=0;i<n;i++)
        {
            ch=data.charAt(i);
            dat=c.Binary(ch);
            cipher=x.XOR(dat,key);
            ch=c.Charac(cipher);
        //    System.out.println(ch);
            cyphertext=cyphertext + "" + ch;
        }
        System.out.println("the Encrypted text is:");
        System.out.println(cyphertext);
    }
}
