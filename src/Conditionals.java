/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

  public static void main (String args[]) {
    System.out.println(isOdd(100));
  }

  private static boolean isOdd(int num){
    if(num % 2 == 0){
      return false;
    }
    return true;
  }

  private static boolean isMultipleOfThree(int n){
    if (n % 3 == 0){
      return true;
    }
    return false;
  }

  private static boolean isOddAndIsMultipleOfThree(int n){
    if(n % 3 == 0 && n % 2 == 1){
      return true;
    }
    return false;
  }

  private static int fizzMultipleofThree(int n){
    if(n % 3 == 0){
        System.out.println("Fizz");
      return 0;
    }
    return n;
  }

  private static boolean isFromLondon(Person person){
    if(person.getCity() == "London"){
      return true;
    }
    return false;
  }

  private static String nameAnalysis(Person person){
    if (person.getName().length()>5){
      System.out.println(person.getName());
    }
    return "Name is too short";
  }
}
