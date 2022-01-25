//143983891	Jan/25/2022 19:58UTC+5.5	sym	231A - Team	Java 8	Accepted	280 ms	0 KB
import java.util.Scanner;
public class Team {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0, s = 0;
        for(int i=1;i<=n;i++) {
            s=0;
            for(int j=0;j<=2;j++) {
                s+= sc.nextInt();
            }
            if(s>=2) count++;
        }
        System.out.println(count);
    }
}
