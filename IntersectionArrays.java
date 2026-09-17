import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(),m=sc.nextInt(); Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++) s.add(sc.nextInt());
        for(int i=0;i<m;i++){int x=sc.nextInt();if(s.contains(x))System.out.print(x+" ");}
    }
}