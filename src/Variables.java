/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {

    public static void main(String args[]) {
        int one = 113;
        double two = 2.71828;
        String three = "Computer Science";
        printValues(one, two, three);

    }

    public static void printValues(int firstVar, double secondVar, String thirdVar) {
        System.out.println("This is room # " + firstVar);
        System.out.println("e is close to " + secondVar);
        System.out.println("I am learning a bit about " + thirdVar);
    }

    public static boolean isOdd(int number) {
        if (number % 2 == 1) {
            return true;
        }
        return false;
    }
    public static int greatestCommonFactor(){
        return 0;
    }
}
