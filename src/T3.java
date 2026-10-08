import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n == 1) System.out.println("mon");
        if (n == 2) System.out.println("tue");
        if (n == 3) System.out.println("wen");
        if (n == 4) System.out.println("thu");
        if (n == 5) System.out.println("fri");
        if (n == 6) System.out.println("sat");
        if (n == 7) System.out.println("sun");
        if ((n > 7)||(n < 1)) {
            System.out.println("n must be in range [1;7] you fucking idiot");
        }
    }
}
