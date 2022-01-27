//144168626	Jan/27/2022 20:04UTC+5.5	sym	339A - Helpful Maths	Java 8	Accepted	218 ms	0 KB
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length()==1){
            System.out.println(s);
            return;
        }
        String ans = "";
        int ones = 0, twos = 0, threes = 0;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='1') ones++;
            if(s.charAt(i)=='2') twos++;
            if(s.charAt(i)=='3') threes++;
        }
        if(ones==0 && twos!=0) {
            ans += 2;
            twos--;
        }
        else if(ones==0 && twos==0){
            ans += 3;
            threes--;
        }
        else {
            ans += 1;
            ones--;
        }
        while(ones-->0) ans += "+" + 1;
        while(twos-->0) ans += "+" + 2;
        while(threes-->0) ans += "+" + 3;
        System.out.println(ans);
    }
}
