

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
class Decryypt
{
    public char Decrypt(char n,char key)
    {
      int i=0,ni,ki;
      char d;
      int e[] = new int[8];
      int k[] = new int[8];
      int p[] = new int[8];
      Convert c= new Convert();
      Exor x= new Exor();
      e=c.Binary(n);
      k=c.Binary(key);
      p = x.XOR(e,k);
      d=c.Charac(p);
      return(d);
    }
}
class Encryppt
{
    public char Encrypt(char n,char key)
    {
        int i=0,ni,ki;
        char d;
        int e[] = new int[8];
        int k[] = new int[8];
        int p[] = new int[8];
        Convert c= new Convert();
        Exor x= new Exor();
        e=c.Binary(n);
        k=c.Binary(key);
        p = x.XOR(e,k);
        d=c.Charac(p);
        return(d);
    }
}
class file
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);
    Encryppt e = new Encryppt();
    Decryypt d = new Decryypt();
    int ch,n,i;
    char k,p,c;
//    String plaintext;
//    String key;
//    String cyphertext ="";
    do
     {
        System.out.println("1:ENCRYPT\n2:DECRPYT\n3:EXIT");
        ch=sc.nextInt();
        switch (ch)
        {
            case 1 : String plaintext;
                     String key;
                     String cyphertext ="";
                     System.out.println("Enter the key:");
                     key=sc.nextLine();
                     k=key.charAt(0);
                     System.out.println("Enter the plaintext");
                     plaintext=sc.nextLine();
                     n=plaintext.length();
                     for(i=0;i<n;i++)
                     {
                         p=plaintext.charAt(i);
                         c=e.Encrypt(p,k);
                         cyphertext=cyphertext + "" + c;
                     }
                     System.out.println(cyphertext);
                     break;
            case 2 : String plantext="";
                     String ke;
                     String cyphetext;
                     System.out.println("Enter the key");
                     ke=sc.nextLine();
                     k=ke.charAt(0);
                     System.out.println("Enter the cyphertext to be decrypted");
                     cyphetext=sc.nextLine();
                     n=cyphetext.length();
                     for(i=0;i<n;i++)
                     {
                        c=cyphetext.charAt(i);
                        p=d.Decrypt(c,k);
                        plantext=plantext + "" + p;
                     }
                     System.out.println(plantext);
                     break;
        }
    }while(ch<3);
  }
}
