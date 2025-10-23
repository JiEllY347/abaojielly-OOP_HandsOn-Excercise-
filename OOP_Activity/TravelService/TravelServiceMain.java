package TravelService;

import java.util.ArrayList;
import java.util.List;
public class TravelServiceMain {
    public static void main(String[] args) {
        TravelService ts = new TravelService();
        
        List<String> flights = ts.searchFlights("Manila");
        List<String> hotels = ts.searchHotels("5Star");
        System.out.println("Flights to Manila: " + flights);
        System.out.println("Hotels in Manila: " + hotels);
        
        ts.bookReservation("Flight EXO123 to Manila");
        ts.bookReservation("5Star Hotel in Manila");
        System.out.println("Reservations: " + ts.getReservations());
        
        ts.cancelReservation("Flight EXO123 to Manila");
        System.out.println("After cancel - Reservations: " + ts.getReservations());
    }
}