// Superclass: HillStation
class HillStation {
    // Methods to be overridden by subclasses
    public void location() {
        System.out.println("Location of the hill station.");
    }

    public void famousFor() {
        System.out.println("Famous for something.");
    }
}

// Subclass: Manali
class Manali extends HillStation {
    @Override
    public void location() {
        System.out.println("Manali is located in Himachal Pradesh.");
    }

    @Override
    public void famousFor() {
        System.out.println("Manali is famous for its scenic beauty and adventure sports.");
    }
}

// Subclass: Mussoorie
class Mussoorie extends HillStation {
    @Override
    public void location() {
        System.out.println("Mussoorie is located in Uttarakhand.");
    }

    @Override
    public void famousFor() {
        System.out.println("Mussoorie is famous for its colonial heritage and beautiful landscapes.");
    }
}

// Subclass: Gulmarg
class Gulmarg extends HillStation {
    @Override
    public void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir.");
    }

    @Override
    public void famousFor() {
        System.out.println("Gulmarg is famous for its ski resorts and beautiful meadows.");
    }
}

// Main class to demonstrate method overriding
public class Hillstations {
    public static void main(String[] args) {
        // Create an array of HillStation references
        HillStation[] hillStations = new HillStation[3];

        // Instantiate the subclasses and assign them to the array
        hillStations[0] = new Manali();
        hillStations[1] = new Mussoorie();
        hillStations[2] = new Gulmarg();

        // Iterate through the array and call the location and famousFor methods
        for (HillStation hillStation : hillStations) {
            hillStation.location();
            hillStation.famousFor();
            System.out.println();  // For better readability
        }
    }
}


/*
Output:-
Manali is located in Himachal Pradesh.
Manali is famous for its scenic beauty and adventure sports.

Mussoorie is located in Uttarakhand.
Mussoorie is famous for its colonial heritage and beautiful landscapes.

Gulmarg is located in Jammu and Kashmir.
Gulmarg is famous for its ski resorts and beautiful meadows.
*/