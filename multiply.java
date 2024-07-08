import java.util.*;

public class multiply{
    public static int multiplication(int a, int b){
        return a * b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Multiplaction of 2 sum : " + multiplication(a, b));
    }
}