//144166352	Jan/27/2022 19:38UTC+5.5	sym	112A - Petya and Strings	Java 8	Accepted	248 ms	0 KB
import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int comp = s1.compareTo(s2);
        if(comp > 0) System.out.println(1);
        else if(comp<0) System.out.println(-1);
        else System.out.println(0);
    }
}
