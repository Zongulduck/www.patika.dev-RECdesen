import java.util.Scanner;
public class RECdesen {
    static void minus1(int a, int x) {
        if (a > 0) {
            System.out.print(a + " ");
            minus1(a - 5, x);
        } else if (a <= 0) {
            minus2(a, x);}}

    static void minus2(int a, int x) {
        if (x >= a) {
            System.out.print(a + " ");
            minus2(a + 5, x);
        }}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Desen için sayı girin ");
        int a = scan.nextInt();
        int x = a;
        minus1(a, x);
    }
}




