//144702204	Jan/31/2022 20:42UTC+5.5	sym	734A - Anton and Danik	Java 8	Accepted	140 ms	0 KB
import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int d = 0, a = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == 'D') d++;
            else a++;
        }
        if(d>a) System.out.println("Danik");
        else if(a>d) System.out.println("Anton");
        else System.out.println("Friendship");
    }
}
