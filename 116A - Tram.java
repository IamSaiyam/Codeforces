//144330481	Jan/28/2022 19:47UTC+5.5	sym	116A - Tram	Java 8	Accepted	280 ms	0 KB
import java.util.Scanner;

public class Tram {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //Number of Stops
        int min = 0; //Initializing minimum capacity required to 0
        int numberPresent = 0; //Number of people present on a stop at a time
        while(n-->0){
            int exit = sc.nextInt(); //People who exit the train at a stop
            int enter = sc.nextInt(); //People who get inside the train
            numberPresent -= exit;
            numberPresent += enter;
            if(numberPresent>min) min = numberPresent;

        }
        System.out.println(min);
    }
}
