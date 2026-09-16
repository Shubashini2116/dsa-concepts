import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        int x = sc.nextInt(), ans = -1;
        for(int i=0;i<n;i++)
            if(a[i]==x) { ans=i; break; }
        System.out.println(ans);
    }
}