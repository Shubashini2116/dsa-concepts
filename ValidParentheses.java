import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); String s=sc.next();
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='['||c=='{')st.push(c);
            else {if(st.empty()||(c==')'&&st.pop()!='(')||(c==']'&&st.pop()!='[')||(c=='}'&&st.pop()!='{')){System.out.println(false);return;}}
        }
        System.out.println(st.empty());
    }
}