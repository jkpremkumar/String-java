import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String[] word=str.split(" ");
        String rev="";
        for(int i=word.length-1;i>=0;i--){
            rev=rev+word[i];
        }
        System.out.println(rev);
}
}