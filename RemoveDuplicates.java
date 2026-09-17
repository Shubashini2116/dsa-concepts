import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), last=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){ int x=sc.nextInt(); if(x!=last){System.out.print(x+" "); last=x;} }
    }
}