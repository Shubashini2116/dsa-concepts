import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(); Map<Integer,Integer> m=new LinkedHashMap<>();
        for(int i=0;i<n;i++){int x=sc.nextInt();m.put(x,m.getOrDefault(x,0)+1);}
        for(int x:m.keySet()) System.out.println(x+" "+m.get(x));
    }
}