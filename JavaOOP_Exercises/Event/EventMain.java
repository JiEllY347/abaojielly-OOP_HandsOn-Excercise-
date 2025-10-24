package Event;
import java.util.*;

public class EventMain {
    public static void main(String[] args) {
        Seminar seminar = new Seminar("Exo Concert 2025", "2025-11-15", "Araneta", 5);
        MusicalPerformance concert = new MusicalPerformance(
                "K-Pop",
                "2025-11-15",
                "Araneta",
                Arrays.asList("Exo", "", "K-Pop")
        );
        MusicalPerformance concert2 = new MusicalPerformance(
                "Super Junior",
                "2025-12-01",
                "Arena",
                Arrays.asList("Super Junior", "K-pop")
        );

        seminar.displayDetails();
        concert.displayDetails();
        concert2.displayDetails();

        System.out.println("Checking event conflicts...");
        checkConflict(seminar, concert);
        checkConflict(seminar, concert2);
        checkConflict(concert, concert2);
    }

    
    public static void checkConflict(Event e1, Event e2) {
        if (e1.isConflict(e2)) {
            System.out.println(" Conflict detected between \"" + e1.getEventName() + "\" and \"" + e2.getEventName() + "\" on " + e1.getDate() + " at " + e1.getLocation() + ".");
        } else {
            System.out.println(" No conflict between \"" + e1.getEventName() + "\" and \"" + e2.getEventName() + "\".");
        }
    }
}
