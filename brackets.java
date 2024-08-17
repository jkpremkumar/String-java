import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if((c=='{' || c=='(' || c=='[')){
                stack.push(c);
                continue;
            }
            else if((c=='}' || c==')' || c==']')){
                if(!stack.isEmpty()){
                    char last=stack.peek();
                    if((c=='}'&& last=='{')|| (c==')'&& last=='(')|| (c==']'&&last=='[')){
                        stack.pop();
                    }
                    else{
                        System.out.print("not");
                        return;
                    }
                }
                else{
                    System.out.print("Correct brackets");
                    return;
                }
            }
        }
        if(stack.isEmpty()){
            System.out.print("correct parenthises");
        }
        else{
            System.out.print("Not parenthises");
        }
    }
}