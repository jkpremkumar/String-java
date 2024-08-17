import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String[] words=str.split(" ");
        String small=words[0];
        for(String word:words){
            if(word.length()<small.length()){
                small=word;
            }
        }
        System.out.print(small);
    }
}