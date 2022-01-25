//143981529	Jan/25/2022 19:36UTC+5.5	sym	71A - Way Too Long Words	Java 8	Accepted	124 ms	0 KB
import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while((t--)>0){
            String s = sc.nextLine();
            if(s.length()>10) System.out.println("" + s.charAt(0) + (s.length()-2) + s.charAt(s.length()-1));
            else System.out.println(s);
        }
    }
}
