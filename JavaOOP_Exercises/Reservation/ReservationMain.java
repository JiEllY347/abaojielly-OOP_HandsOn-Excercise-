package Reservation;

import java.time.LocalDate;

public class ReservationMain {
    public static void main(String[] args) {
        ResortReservation resort = new ResortReservation(
                "RES-001", 
                "Abao Jielly", 
                LocalDate.of(2025, 11, 24), 
                205
        );

        resort.displayReservationDetails();
        resort.checkReservationStatus();

        System.out.println("\n--- Updating Resort Reservation ---");
        resort.modifyReservationDetails("Jielly A.", LocalDate.of(2025, 11, 25));
        resort.modifyRoomNumber(12);
        resort.updateStatus("Confirmed");
        resort.displayReservationDetails();

        System.out.println("\n----------------------------------------\n");
        RailwayReservation railway = new RailwayReservation(
                "RAIL-202", 
                "Jose Rizal", 
                LocalDate.of(2025, 12, 24), 
                "B12"
        );

        railway.displayReservationDetails();
        railway.checkReservationStatus();

        System.out.println("\n--- Updating Railway Reservation ---");
        railway.modifyReservationDetails("Maria S.", LocalDate.of(2025, 12, 3));
        railway.modifySeatNumber("C5");
        railway.updateStatus("Confirmed");
        railway.displayReservationDetails();
    }
}
