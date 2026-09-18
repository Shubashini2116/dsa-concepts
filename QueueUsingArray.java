import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(); int[] q=new int[n];
        for(int i=0;i<n;i++)q[i]=sc.nextInt();
        for(int x:q)System.out.print(x+" ");
    }
}