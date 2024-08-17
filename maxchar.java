import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       String str=scan.nextLine();
      char res=str.charAt(0);
      int summ=0;
       for(int i=0;i<str.length();i++){
           int count=0;
           for(int j=0;j<str.length();j++){
               if(str.charAt(i)==str.charAt(j)){
                   count++;
               }
           }
           if(count>summ){
               summ=count;
               res=str.charAt(i);
           }
       }
       System.out.print(res);
    }
}