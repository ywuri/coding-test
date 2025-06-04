import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        String bs = String.valueOf(b);
        
        int one = a*(bs.charAt(2)-'0');
        int two = a*(bs.charAt(1)-'0');
        int three = a*(bs.charAt(0)-'0');
        int total = a*b;
        
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(total);
    }
}