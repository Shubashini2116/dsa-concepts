import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(); int[] st=new int[n]; int top=-1;
        for(int i=0;i<n;i++)st[++top]=sc.nextInt();
        while(top>=0)System.out.print(st[top--]+" ");
    }
}