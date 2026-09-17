import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(); int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int l=0,r=n-1; while(l<r){int t=a[l];a[l]=a[r];a[r]=t;l++;r--;}
        for(int x:a) System.out.print(x+" ");
    }
}