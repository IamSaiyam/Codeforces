//144315209	Jan/28/2022 17:07UTC+5.5	sym	791A - Bear and Big Brother	Java 8	Accepted	109 ms	0 KB
import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        while(a<=b){
            a += a+a;
            b += b;
            count++;
        }
        System.out.println(count);
    }
}
