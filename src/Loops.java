/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

    public static void main(String args[]) {
        sumOfFirstTenFibWithN(5);
    }

    private static void oneThroughTen() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    private static void oneThroughTen2() {
        int x = 1;
        while (x < 11) {
            System.out.println(x);
            x++;
        }
    }

    private static void printNum(int n) {
        for (int i = 1; i < (n + 1); i++) {
            System.out.println(i);
        }
    }

    private static void printEven(int n) {
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
    }

    private static void sumTen() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static void sumThroughN(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static void sumThrough1000() {
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static void printNandS(int n, String s) {
        if (n < 0) {
            System.out.println("");
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    private static void concatenateString(int n, String s) {
        String newString = s;
        if (n < 0) {
            System.out.println("");
        }
        for (int i = 0; i < n; i++) {
            newString += s;
        }
        System.out.println(newString);
    }

    private static void firstTenFib() {
        int x = 0;
        int y = 1;
        int n3;
        int count = 10;
        System.out.println(" "+x);
        System.out.println(" "+y);
        for (int i = 2; i < count ; ++i) {
            n3 = x +y;
                System.out.println(" "+ n3);
            x=y;
            y=n3;
            }
        }

    private static void sumOfFirstTenFib() {
        int x = 0;
        int y = 1;
        int n3;
        int sum = 0;
        int count = 10;
        for (int i = 2; i < count ; ++i) {
            n3 = x +y;
            sum+=n3;
            x=y;
            y=n3;
        }
        System.out.println(sum);
    }

    private static void sumOfFirstTenFibWithN(int n) {
        int x = 0;
        int y = 1;
        int n3;
        int sum = 0;
        for (int i = 2; i < n ; ++i) {
            n3 = x +y;
            sum+=n3;
            x=y;
            y=n3;
        }
        System.out.println(sum);
    }
    }
