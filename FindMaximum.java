import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) max = Math.max(max, sc.nextInt());
        System.out.println(max);
    }
}