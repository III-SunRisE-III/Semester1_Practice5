import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 1;
        int b = 1;
        int mid;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            mid = a + b;
            a = b;
            b = mid;
        }
    }
}
