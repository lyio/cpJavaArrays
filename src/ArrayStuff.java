import java.util.Objects;

public class ArrayStuff {

    public static void main(final String[] args) {
        // declare array
        int [] numbers;

        // initialize array
        numbers = new int[7];

        numbers = IntArray.getIntArray();

        final Dog[] dogs = DogArray.getDogs();
        dogs[0].bark();

        for (final Dog d : dogs) {
            d.bark();
        }

        Object[] objects = dogs;
        objects[0] = new Dog();
        objects[1] = "this string literal is an object --> no compile time error";
    }
}
