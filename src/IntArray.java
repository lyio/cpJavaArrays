public class IntArray {

    public static int[] getIntArray() {
        // declare and initialize right away
        final int [] numbers = {1, 2, 3, 4, 5};

        // this does not compile!
        // final int[] otherNumbers;
        // otherNumbers = {1, 2, 3, 4, 5};

        return numbers;
    }
}
