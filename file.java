import java.util.*;

class Encryppt
{
    public char EncryptDecrypt(char n,char key)
    {
        int ni,ki,ci;
        char d;
        ni=(int)n;
        ki=(int)key;
        ci=n^key;
        d=(char)ci;
        return(d);
    }
}
class file
{
  public static void main(String arg[])
  {
    Encryppt e = new Encryppt();
    Scanner sc = new Scanner(System.in);
    String plaintext="";
    String key;
    String cyphertext ="";
    int i,ch,n;
    char k,p,c;
    do
     {
        System.out.println("1:ENCRYPT\n2:DECRPYT\n3:EXIT");
        ch=sc.nextInt();
        sc.nextLine();
        switch (ch)
        {
            case 1 : System.out.println("Enter the key:");
                     key=sc.nextLine();
                     k=key.charAt(0);
                     System.out.println("Enter the plaintext");
                     plaintext=sc.nextLine();
                     n=plaintext.length();
                     System.out.println("The Encrypted text is:");
                     for(i=0;i<n;i++)
                     {
                         p=plaintext.charAt(i);
                         c=e.EncryptDecrypt(p,k);
                         System.out.print(c);
                     }
                     System.out.println();
                     break;
            case 2 : System.out.println("Enter the key");
                     key=sc.nextLine();
                     k=key.charAt(0);
                     System.out.println("Enter the cyphertext to be decrypted");
                     cyphertext=sc.nextLine();
                     n=cyphertext.length();
                     System.out.println("The Decrypted text is:");
                     for(i=0;i<n;i++)
                     {
                        c=cyphertext.charAt(i);
                        p=e.EncryptDecrypt(c,k);
                        System.out.print(p);
                     }
                     System.out.println();
                     break;
        }
    }while(ch<3);
  }
}
