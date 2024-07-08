
import java.util.*;

public class factoiral {
    public static void printfactoiral(int n) {
        //loop
        if(n < 0){
            System.out.println("Invalid Number");
            return;
        }
        int factoiral = 1;

        for(int i=n; i>=1; i--) {
            factoiral = factoiral * i;
        }

        System.out.println(factoiral);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        printfactoiral(n);
    }
}
