/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

    public static void main(String args[]) {
        Cat garField = new Cat("Garfield");
        Cat pinky = new Cat("Pink Panther");
        Cat catWoman = new Cat("Cat Woman");
        Person charlie = new Person("Charlie");

        garField.setFavoriteFood("Lasagna");
        pinky.setFavoriteFood("Pizza");
        catWoman.setFavoriteFood("Salmon");

        garField.setAge(4);
        pinky.setAge(1);
        catWoman.setAge(5);

        System.out.println(adoption(catWoman,charlie));
        System.out.println(isFree(catWoman));
        System.out.println(isSibling(catWoman,pinky));

    }

    private static boolean isOlder(Cat one, Cat two) {
        if (one.getAge() > two.getAge()) {
            return true;
        }
        return false;
    }

    private static void makeBestFriends(Cat one, Cat two) {
        String food = two.getFavoriteFood();
        two.setFavoriteFood(food);
    }

    private static Cat makeKitten(Cat one, Cat two) {
        String name1 = one.getName();
        String name2 = two.getName();
        String newName = name1 + name2;
        Cat kitten = new Cat(newName);
        kitten.setAge(0);
        return kitten;
    }

    private static String adoption(Cat cat, Person person) {
        if(cat.getName() == "Cat Woman"){
            return cat.getName() + " will never be anyone's pet!";
        }
        cat.setHasOwner(true);
        return person.getName() + " is now " + cat.getName() + "'s owner!";
    }

    private static boolean isFree(Cat cat) {
        if(cat.isHasOwner()){
            return false;
        }
        return true;
    }

    private static boolean isSibling(Cat cat, Cat otherCat) {
        if(cat.isHasOwner() && otherCat.isHasOwner()){
            return true;
        }
        return false;
    }
}
