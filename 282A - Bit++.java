//143990376	Jan/25/2022 20:59UTC+5.5	sym	282A - Bit++	Java 8	Accepted	109 ms	0 KB
import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int x = 0;
        for(int i=0; i<n; i++){
            String s = sc.nextLine();
            if(s.charAt(0)=='+' || s.charAt(1)=='+') x++;
            else x--;
        }
        System.out.println(x);
    }
}
