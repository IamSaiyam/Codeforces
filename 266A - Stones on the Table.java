//144187914	Jan/27/2022 20:25UTC+5.5	sym	266A - Stones on the Table	Java 8	Accepted	248 ms	0 KB
import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        char curr = s.charAt(0);
        int count=0;
        for(int i=1; i<n; i++){
            if(s.charAt(i)==curr) count++;
            else curr = s.charAt(i);
        }
        System.out.println(count);
    }
}
