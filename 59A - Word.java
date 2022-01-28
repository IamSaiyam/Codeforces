//144319369	Jan/28/2022 17:56UTC+5.5	sym	59A - Word	Java 8	Accepted	218 ms	0 KB
import java.util.Scanner;

public class Word {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n=0;
        for(char c : s.toCharArray()){
            if(c>=97 && c<=122) n++;
            else n--;
        }
        if(n>=0) System.out.println(s.toLowerCase());
        else System.out.println(s.toUpperCase());
    }
}
