import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int[] a=new int[n];
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){ a[i]=sc.nextInt(); if(!s.add(a[i])) {System.out.println(a[i]); return;} }
        System.out.println(-1);
    }
}