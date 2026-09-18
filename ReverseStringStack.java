import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); String s=sc.next(); Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray())st.push(c);
        while(!st.empty())System.out.print(st.pop());
    }
}