import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = n;
        int palindrome = 0;
        while (n > 0) {
            palindrome = palindrome * 10 + n % 10;
            n /= 10;
        }
        if (x == palindrome) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
