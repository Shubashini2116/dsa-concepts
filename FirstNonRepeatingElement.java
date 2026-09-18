import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int[] a=new int[n]; HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){a[i]=sc.nextInt();m.put(a[i],m.getOrDefault(a[i],0)+1);}
        for(int x:a) if(m.get(x)==1){System.out.println(x);return;}
        System.out.println(-1);
    }
}