import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(),m=sc.nextInt(); Set<Integer> s=new LinkedHashSet<>();
        for(int i=0;i<n+m;i++) s.add(sc.nextInt());
        for(int x:s) System.out.print(x+" ");
    }
}