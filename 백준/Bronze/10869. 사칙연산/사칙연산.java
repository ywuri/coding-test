import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int plus = a+b;
        int mainus = a-b;
        int multiply = a*b;
        int divide1 = a/b;
        int divide2 = a%b;
        
        System.out.println(plus);
        System.out.println(mainus);
        System.out.println(multiply);
        System.out.println(divide1);
        System.out.println(divide2);
    }
}