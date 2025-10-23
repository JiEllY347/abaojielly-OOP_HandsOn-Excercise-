package Building;

public class BuildingMain {
    public static void main(String[] args) {
        ResidentialBuilding rb = new ResidentialBuilding(
                " St. Thomas Street ", 20, 4000.0, 50, 15000.0);

        CommercialBuilding cb = new CommercialBuilding(
                " Rizal Street ", 15, 20000.0, 9000.0, 300.0);

        rb.displayInfo();
        cb.displayInfo();
    }
}