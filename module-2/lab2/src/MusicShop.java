// Step 1: Create an abstract class Instrument
abstract class Instrument {
    // This should include:
    // - private String name
    // - protected int year (year of manufacture)
    // - constructor that initializes both fields
    // - abstract method play() that returns a String
    // - concrete method getInstrumentDetails() that returns information about the
    // instrument
    private String name;
    protected int year;

    public Instrument(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public abstract String play();

    public String getInstrumentDetails() {
        return "Instrument: " + name + " year of manufacture: " + year;
    }

    public String getName() {
        return name;
    }
}

// Step 2: Create an interface Tunable
interface Tunable {
    // This should include:
    // - abstract method tune() that returns a String
    // - abstract method adjustPitch(boolean up) that returns a String (up means
    // increase pitch)
    String tune();

    String adjustPitch(boolean up);
}

// Step 3: Create an interface Maintainable
interface Maintainable {
    // This should include:
    // - abstract method clean() that returns a String
    // - abstract method inspect() that returns a String
    String clean();

    String inspect();
}

// Step 4: Create a concrete class StringedInstrument that extends Instrument
class StringedInstrument extends Instrument {
    // This should include:
    // - private int numberOfStrings
    // - constructor that initializes name, year, and numberOfStrings
    // - implementation of the abstract play() method
    // - override getInstrumentDetails() to include number of strings
    private int numberOfStrings;

    public StringedInstrument(String name, int year, int numberOfStrings) {
        super(name, year);
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String play() {
        return "... playing stringed instrument ...";
    }

    @Override
    public String getInstrumentDetails() {
        return super.getInstrumentDetails() + ", number of strings: " + numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}

// Step 5: Create a concrete class Guitar that extends StringedInstrument
// and implements Tunable and Maintainable
class Guitar extends StringedInstrument implements Tunable, Maintainable {
    // This should include:
    // - private String guitarType (acoustic, electric, etc.)
    // - constructor that initializes all fields
    // - implementation of all required interface methods
    private String guitarType;

    public Guitar(String name, int year, int numberOfStrings, String guitarType) {
        super(name, year, numberOfStrings);
        this.guitarType = guitarType;
    }

    @Override
    public String play() {
        return "playing the " + guitarType + " guitar with " + getNumberOfStrings() + " strings";
    }

    @Override
    public String clean() {
        return "Cleaning the " + guitarType + " guitar";
    }

    @Override
    public String inspect() {
        return "Inspecting the " + guitarType + " guitar.";
    }

    @Override
    public String tune() {
        return "Tuning the " + guitarType + " guitar";
    }

    @Override
    public String adjustPitch(boolean up) {
        return up ? "Increasing pitch of the guitar" : "Decreasing pitch of the guitar";
    }
}

// Step 6: Create a concrete class Piano that extends Instrument
// and implements Tunable and Maintainable
class Piano extends Instrument implements Tunable, Maintainable {
    // This should include:
    // - private boolean isGrand
    // - constructor that initializes all fields
    // - implementation of the abstract play() method
    // - implementation of all required interface methods
    private boolean isGrand;

    public Piano(String name, int year, boolean isGrand) {
        super(name, year);
        this.isGrand = isGrand;
    }

    @Override
    public String play() {
        return "Playing the " + (isGrand ? "grand" : "upright") + " piano";
    }

    @Override
    public String getInstrumentDetails() {
        return super.getInstrumentDetails() + ", Type: " + (isGrand ? "Grand" : "Upright");
    }

    @Override
    public String clean() {
        return "Cleaning the piano keys and interior";
    }

    @Override
    public String inspect() {
        return "Inspecting the " + (isGrand ? "grand" : "upright") + " piano.";
    }

    @Override
    public String tune() {
        return "Tuning the piano";
    }

    @Override
    public String adjustPitch(boolean up) {
        return up ? "Increasing pitch of the piano" : "Decreasing pitch of the piano";
    }
}

// Step 7: Create a public class MusicShop to test the classes
public class MusicShop {
    public static void main(String[] args) {
        // Create an array of Instrument objects
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar("Fender Stratocaster", 2020, 6, "electric");
        instruments[1] = new Piano("Steinway", 2015, true);
        instruments[2] = new Guitar("Martin", 2018, 12, "acoustic");

        // Demonstrate polymorphism by calling play() for each instrument
        System.out.println("===== PLAYING INSTRUMENTS =====");
        for (Instrument instrument : instruments) {
            System.out.println(instrument.play());
            System.out.println(instrument.getInstrumentDetails());
        }

        // Demonstrate interface type checking and method calling
        System.out.println("\n===== MAINTAINING INSTRUMENTS =====");
        for (Instrument instrument : instruments) {
            System.out.println("Working with: " + instrument.getName());

            // Check if this instrument is Tunable
            if (instrument instanceof Tunable) {
                Tunable tunableInstrument = (Tunable) instrument;
                System.out.println(tunableInstrument.tune());
                System.out.println(tunableInstrument.adjustPitch(true));
            }

            // Check if this instrument is Maintainable
            if (instrument instanceof Maintainable) {
                Maintainable maintainableInstrument = (Maintainable) instrument;
                System.out.println(maintainableInstrument.clean());
                System.out.println(maintainableInstrument.inspect());
            }

            System.out.println("-----");
        }
    }
}
