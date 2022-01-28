//144316202	Jan/28/2022 17:19UTC+5.5	sym	546A - Soldier and Bananas	Java 8	Accepted	109 ms	0 KB
import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String... args){
        Scanner sc =  new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        for(int i=1; i<=w; i++){
            n-=(k*i);
        }
        if(n<0) n *= -1;
        else n=0;
        System.out.println(n);
    }
}
