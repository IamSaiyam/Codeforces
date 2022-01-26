//144089520	Jan/26/2022 21:44UTC+5.5	sym	263A - Beautiful Matrix	Java 8	Accepted	216 ms	0 KB
import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int x=0, y=0, count=0;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                int a = sc.nextInt();
                if(a==1){
                    x=i;
                    y=j;
                }
            }
        }
        if(x>3) count += x-3;
        else count += 3-x;
        if(y>3) count += y-3;
        else count += 3-y;
        System.out.println(count);
    }
}
