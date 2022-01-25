//143987209	Jan/25/2022 20:29UTC+5.5	sym	158A - Next Round	Java 8	Accepted	340 ms	0 KB
import java.util.Scanner;

public class NextRound {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int j[] = new int[n];
        int count = 0, min=0;
        for(int i=0; i<n; i++){
            j[i] = sc.nextInt();
            if(i==k-1) min = j[i];
            if(j[i]>0){
                if(i<k) count++;
                else if(i>=k && j[i]>=min) count++;
            }
        }
        System.out.println(count);
    }
}
