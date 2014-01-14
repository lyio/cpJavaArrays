public class ArrayStuff {

    public static void main(final String[] args) {
        // declare array of primitives
        int [] numbers;

        // initialize array of primitives
        numbers = new int[7];

        System.out.println(numbers);

        // a different way to get an array of primitives
        numbers = IntArray.getIntArray();

        // and now for something completely different: reference types
        final Dwarf[] dwarfs = DwarfArray.getDwarfs();

        // have them do something
        for (final Dwarf d : dwarfs) {
            d.greet();
        }

        // demonstrating covariance
        Object[] objects = dwarfs;
        objects[0] = new Dwarf("Grumpy");
        // objects[1] = "this string literal is an object --> no compile time error";
    }
}
