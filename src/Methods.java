import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

    public static void main(String args[]) {
        System.out.println(calculateSquare(4));
        System.out.println(calculateSquareRoot(16));
        System.out.println(toLowerCase("Hello World!"));
        System.out.println(isMultiple(5, 101));
        prettyInteger(5);
        System.out.println(random(10,20));
    }

    public static int calculateSquare(int number) {
        return number * number;
    }

    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public static String toLowerCase(String word) {
        return word.toLowerCase();
    }

    public static boolean isMultiple(double firstNum, double secondNum) {
        if (secondNum % firstNum == 0) {
            return true;
        }
        return false;
    }

    private static void prettyInteger(int number) {
        String newString = "";
        for (int i = 0; i < number; i++) {
            newString += "*";
        }
        newString += number;
        for (int i = 0; i < number; i++) {
            newString += "*";
        }
        System.out.println(newString);
    }

    private static int random(int firstNum, int secondNum){
        Random random = new Random();
        int randomNum = random.nextInt((secondNum-firstNum)+1) + firstNum;
        return randomNum;
    }

}
