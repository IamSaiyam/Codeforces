//143979419	Jan/25/2022 19:17UTC+5.5	sym	4A - Watermelon	Java 8	Accepted	186 ms	3700 KB
import java.util.Scanner;

public class Watermelon {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();

        if(w%2==0 && w>2) System.out.println("YES");
        else System.out.println("NO");
    }
}
