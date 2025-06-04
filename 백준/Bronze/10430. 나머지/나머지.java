import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int one = (a+b)%c;
        int two = ((a%c)+(b%c))%c;
        int three = (a*b)%c;
        int four = ((a%c)*(b%c))%c;

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
    }
}