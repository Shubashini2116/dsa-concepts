import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), x=sc.nextInt(), count=0;
        for(int i=0;i<n;i++) if(sc.nextInt()==x) count++;
        System.out.println(count);
    }
}