//144193654	Jan/27/2022 20:31UTC+5.5	sym	266A - Stones on the Table	Java 8	Accepted	248 ms	0 KB
import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int count = 0;
        for(int i=0; i<n-1; i++){
            if(s.charAt(i)==s.charAt(i+1)) count++;
        }
        System.out.println(count);
    }
}
