//144176794	Jan/27/2022 20:14UTC+5.5	sym	281A - Word Capitalization	Java 8	Accepted	248 ms	0 KB
import java.util.Scanner;

public class WordCapitalization {
    public static void main(String... args){
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        s = s.substring(0, 1).toUpperCase() + s.substring(1,n);
        System.out.println(s);
    }
}
