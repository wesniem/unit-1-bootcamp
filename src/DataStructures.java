import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

    public static void main(String args[]) {
        Cat one = new Cat("Pebbles");
        Cat two = new Cat("Whiskers");
        Cat three = new Cat("Bill");
        Cat four = new Cat("Rob");
        Cat five = new Cat("Sammy");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(4);
        nums.add(4);
        nums.add(4);
        nums.add(5);
        System.out.println(mostFrequentElement(nums));
        ArrayList<Cat> catArrayList = new ArrayList<>();
        catArrayList.add(one);
        catArrayList.add(two);
        catArrayList.add(three);
        catArrayList.add(four);
        catArrayList.add(five);

        HashMap<String, Integer> podSquad = new HashMap<>();
        podSquad.put("Cat", 23);
        podSquad.put("Jose", 22);
        podSquad.put("Mila", 13);
        podSquad.put("Jordan", 12);

        System.out.println("Can Rent: " + canRentACar(podSquad));

        for (Map.Entry<String, Integer> pod : podSquad.entrySet()) {
            String key = pod.getKey();
            Integer value = pod.getValue();
            System.out.println(key + " " + value);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(catArrayList.get(i).getName());
        }
    }

    private static int mostFrequentElement(ArrayList<Integer> myNumberList) {
        int count = 0;
        int temp = myNumberList.get(0);
        int popular = myNumberList.get(0);
        int tempCounter = 0;
        for (int i = 1; i < myNumberList.size(); i++) {
            temp = myNumberList.get(i);
            tempCounter = 0;
            for (int j = 0; j < myNumberList.size(); j++) {
                if (temp == myNumberList.get(i)) {
                    tempCounter++;
                }
                if (tempCounter > count) {
                    popular = temp;
                    count = tempCounter;
                }
            }
        }
        return popular;
    }

    private static boolean canRentACar(HashMap<String, Integer> map) {
        int counter = 0;
        for (Map.Entry<String, Integer> pod : map.entrySet()) {
            Integer value = pod.getValue();
            if (value > 25) {
                counter++;
            }
        }
        if(counter >=1){
            return true;
        }
        return false;
    }
}
