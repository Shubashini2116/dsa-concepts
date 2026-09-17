import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(), p=0, neg=0;
        for(int i=0;i<n;i++){int x=sc.nextInt(); if(x>0)p++; else if(x<0)neg++;}
        System.out.println("Positive: "+p); System.out.println("Negative: "+neg);
    }
}