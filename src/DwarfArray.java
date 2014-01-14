
public class DwarfArray {
    public static Dwarf[] getDwarfs() {
        final Dwarf[] dwarfs = {new Dwarf("Happy"), new Dwarf("Grumpy"), new Dwarf("Sleepy"),
                new Dwarf("Sneezy"), new Dwarf("Bashful"), new Dwarf("Dopey"), new Dwarf("Doc")};

        // the other way to initialize the array
        // final Dwarf[] dwarfs;
        // dwarfs = new Dwarf[7];

        return dwarfs;
    }
}
