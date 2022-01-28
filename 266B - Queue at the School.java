//144335053	Jan/28/2022 20:27UTC+5.5	sym	266B - Queue at the School	Java 8	Accepted	218 ms	0 KB
import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        while(k>0) {
            for (int i=0; i < n-1; i++) {
                if(arr[i] == 'B' && arr[i+1] == 'G'){
                    arr[i] = 'G';
                    arr[i+1] = 'B';
                    i++;
                }
            }
            k--;
        }
        for(char c : arr){
            System.out.print(c);
        }
    }
}
