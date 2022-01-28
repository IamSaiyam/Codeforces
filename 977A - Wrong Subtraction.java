//144320116	Jan/28/2022 18:04UTC+5.5	sym	977A - Wrong Subtraction	Java 8	Accepted	108 ms	0 KB
import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        while(k-->0){
            if(n % 10 == 0) n /= 10;
            else n--;
        }
        System.out.println(n);
    }
}
