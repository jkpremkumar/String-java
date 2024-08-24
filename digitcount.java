import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String[] str=new String[n];
        int count=0;
        scan.nextLine();
        for(int i=0;i<n;i++){
            str[i]=scan.nextLine();
        }
        for(int k=0;k<n;k++)
        {
            for(int j=0;j<str[k].length();j++)
            {
                char c=str[k].charAt(j);
                if(Character.isDigit(c))
                {
                count++;
                break;
                }
            }
        }
        System.out.print(count);
    }
}