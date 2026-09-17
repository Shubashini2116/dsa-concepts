import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(),sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){sum=Math.max(sc.nextInt(),sum+sc.nextInt());}
    }
}