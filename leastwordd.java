import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String[] str=new String[n];
        int max=Integer.MAX_VALUE;
        String name="";
        scan.nextLine();
        for(int i=0;i<n;i++)
        {
            str[i]=scan.nextLine();
            if(str[i].length()<max)
            {
                max=str[i].length();
                name=str[i];
            }
        }
        String rev=new StringBuilder(name).reverse().toString();
        for(int i=0;i<n;i++)
        {
            if(str[i].equals(name))
            {
                str[i]=rev;
            }
            System.out.println(str[i]);
        }
    }
}