import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        int c=0;
        for(char x:s.toCharArray())
            if("aeiou".indexOf(x)>=0) c++;
        System.out.println(c);
    }
}