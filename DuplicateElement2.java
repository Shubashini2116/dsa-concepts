import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(); Set<Integer>s=new HashSet<>();
        for(int i=0;i<n;i++){int x=sc.nextInt();if(!s.add(x)){System.out.println(x);return;}}
    }
}