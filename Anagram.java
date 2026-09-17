import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); char[] a=sc.next().toCharArray(),b=sc.next().toCharArray();
        Arrays.sort(a); Arrays.sort(b); System.out.println(Arrays.equals(a,b)?"Anagram":"Not Anagram");
    }
}