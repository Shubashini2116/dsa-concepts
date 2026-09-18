import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){int x=sc.nextInt();m.put(x,m.getOrDefault(x,0)+1);}
        System.out.println(m);
    }
}